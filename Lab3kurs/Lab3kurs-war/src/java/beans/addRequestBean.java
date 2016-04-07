/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import DAO.RequestDAO;
import Models.Request;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.icefaces.ace.model.table.RowStateMap;

/**
 *
 * @author Alexey
 */
@Named(value = "addRequestBean")
@RequestScoped
public class addRequestBean {

   
    @EJB
    private RequestDAO requestDAO;

    private Request request;
    private RowStateMap stateMap;

    @PostConstruct
    private void addRequestBean() {
        request = new Request();
    }

    public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String addNewRequest() {
        requestDAO.AddRequest(request.getidStuff(),
                request.getidRequest(),
                request.getagreement(),
               
                request.getamount());
        return "/index.xhtml";
    }

   
    public String editRequest(int id) {
        requestDAO.editRequest(id, request.getidStuff(),
                request.getidRequest(),
                request.getagreement(),        
                request.getamount());
        return "/All/AllMaterial.xhtml";
    }
 
    public addRequestBean() {
    }
    
}
