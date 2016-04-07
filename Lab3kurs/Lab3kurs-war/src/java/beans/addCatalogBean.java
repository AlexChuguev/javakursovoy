/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import DAO.CatalogDAO;
import DAO.StuffDAO;
import Models.Catalog;
import Models.Stuff;
import java.sql.Date;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.icefaces.ace.model.table.RowStateMap;

/**
 *
 * @author Alexey
 */
@Named(value = "addCatalogBean")
@RequestScoped
public class addCatalogBean {

   
    @EJB
    private CatalogDAO catalogDAO;

    private Catalog catalog;
    private RowStateMap stateMap;

    @PostConstruct
    private void addCatalogBean() {
        catalog = new Catalog();
    }

    public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public String addNewCatalog() {
        catalogDAO.AddCatalog(catalog.getidStuff(),
                catalog.getidRequest(),
                catalog.getName(),
               
                catalog.getamount());
        return "/index.xhtml";
    }

   
    public String editCatalog(int id) {
        catalogDAO.editCatalog(id, catalog.getidStuff(),
                catalog.getidRequest(),
                catalog.getName(),        
                catalog.getamount());
        return "/All/AllMaterial.xhtml";
    }
    public addCatalogBean() {
    }
    
}
