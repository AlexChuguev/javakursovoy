/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Alexey
 */
public class Catalog {

    private int id;
    private int idStuff;
    private int idRequest;
    private String name;

    private int amount;

    public Catalog(int id, int idStuff, int idRequest, String name, int amount) {
        this.id = id;
        this.idStuff = idStuff;
        this.idRequest = idRequest;
        this.name = name;

        this.amount = amount;

    }

      public Catalog () {      
    }
    ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getidStuff() {
        return idStuff;
    }

    public void setidStuff(int idStuff) {
        this.idStuff = idStuff;
    }

    public int getidRequest() {
        return idRequest;
    }

    public void setidRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getamount() {
        return amount;
    }

    public void setamount(int amount) {
        this.amount = amount;
    }

}
