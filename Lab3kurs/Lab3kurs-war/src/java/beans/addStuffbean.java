/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import DAO.StuffDAO;
import Models.Stuff;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.icefaces.ace.model.table.RowStateMap;


/**
 *
 * @author Alexey
 */
@Named(value = "addStuffbean")
@RequestScoped
public class addStuffbean {

    @EJB
    private StuffDAO stuffdao;

    private Stuff stuff;
    private RowStateMap stateMap;

    @PostConstruct
    private void addStuffbean() {
        stuff = new Stuff();
    }

    public RowStateMap getStateMap() {
        return stateMap;
    }

    public void setStateMap(RowStateMap stateMap) {
        this.stateMap = stateMap;
    }

    public Stuff getStuff() {
        return stuff;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }

    public String addNewStuff() {
        stuffdao.AddStuff(stuff.getName(), stuff.getamount());
        return "/index.xhtml";
    }

    public addStuffbean() {
    }

    public String editStuff(int id) {
        stuffdao.editStuff(id, stuff.getName(), stuff.getamount());
        return "/All/AllMaterial.xhtml";
    }
}
