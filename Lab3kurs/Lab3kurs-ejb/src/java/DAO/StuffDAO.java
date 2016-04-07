/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Models.Stuff;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateful;
import javax.enterprise.context.ApplicationScoped;
/**
 *
 * @author Alexey
 */
@Stateful
public class StuffDAO {
     public List<Stuff> selectStuff() { 
         ArrayList<Stuff> StuffList = new ArrayList<>();
         Stuff stuff = new Stuff (1,"Fanera",23);
         StuffList.add(stuff);
         return StuffList;
    }
    public void AddStuff( String name, int amount) {
    
    }
    public void deleteStuff(List<Stuff> selectStuff) {
        
    }
   
    public void editStuff(int id, String name, Integer amount) { 
     
    } 
}
