/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Alexey
 */
public class Request {

    private int id;
    private int idStuff;
    private int idRequest;
    private boolean agreement;
    private int amount;

     public Request(int id, int idStuff, int idRequest, boolean agreement, int amount) {
        this.id = id;
        this.idStuff = idStuff;
        this.idRequest = idRequest;
        this.agreement = agreement;

        this.amount = amount;

    }
  public Request () {      
    }
    ;
    public int getId() {
        return id;
    }

    public int getamount() {
        return amount;
    }

    public void setamount(int amount) {
        this.amount = amount;
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

    public boolean getagreement() {
        return agreement;
    }

    public void setagreement(boolean agreement) {
        this.agreement = agreement;
    }
}
