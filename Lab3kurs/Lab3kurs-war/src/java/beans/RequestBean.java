/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import DAO.CatalogDAO;
import DAO.RequestDAO;
import Models.Catalog;
import Models.Request;
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
@Named(value = "requestBean")
@SessionScoped
public class RequestBean implements Serializable {
    @EJB
    private RequestDAO requestDAO;

    private Object Request;
    private int editId;

    private RowStateMap stateMap;

    public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }

    public List<Request> selectRequest() throws Exception {
        return requestDAO.selectRequest();
    }

    public String editRequest(int id) {
        this.editId = id;
        return "/Edit/editRequest.xhtml";
    }

   
    public RequestBean() {
    }
    
}
