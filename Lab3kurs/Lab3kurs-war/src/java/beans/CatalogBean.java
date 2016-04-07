/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import DAO.CatalogDAO;
import Models.Catalog;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import org.icefaces.ace.model.table.RowStateMap;

/**
 *
 * @author Alexey
 */
@Named(value = "catalogBean")
@SessionScoped
public class CatalogBean implements Serializable {

    @EJB
    private CatalogDAO catalogDAO;

    private Object Catalog;
    private int editId;

    private RowStateMap stateMap;

    public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }

    public List<Catalog> selectCatalog() throws Exception {
        return catalogDAO.selectCatalog();
    }

    public String editCatalog(int id) {
        this.editId = id;
        return "/Edit/editCatalog.xhtml";
    }

    public CatalogBean() {
    }

}
