/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import DAO.StuffDAO;

import Models.Stuff;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.event.ActionEvent;
import org.icefaces.ace.model.table.RowStateMap;

/**
 *
 * @author Alexey
 */
@Named(value = "stuffbean")
@SessionScoped
public class Stuffbean implements Serializable {
 @EJB
    private StuffDAO stuffDAO;

    private Object Stuff;
    private int editId;

    private RowStateMap stateMap;

    public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }

  
    public List<Stuff> selectStuff() throws Exception {
        return stuffDAO.selectStuff();
    }

    public String editStuff(int id) {
        this.editId = id;
        return "/Edit/editStuff.xhtml";
    }
}
