/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Catalog;
import Models.Request;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexey
 */
public class RequestDAO {
     public List<Request> selectRequest() { 
         ArrayList<Request> ReqList = new ArrayList<>();
         Request request = new Request (1,2,3, false,2);
         ReqList.add(request);
         return ReqList;
    }
     
    public void AddRequest( int idStuff, int idRequest, boolean name,  int amount) {
    
    }
    public void deleteRequest(List<Catalog> selectMaterial) {
        
    }
    public void AddRequest( String name, int number, int quantity){
        
    }
    public void editRequest(int id, int idStuff, int idRequest, boolean name,  int amount) { 
        /*try {
            connect();
            PreparedStatement st = connection.prepareStatement("update material set name=?, number=?, quantity=? where idMat=?");
            st.setString(1, name);
            st.setInt(2, number);
            st.setInt(3, quantity);
            st.setInt(4, idMat);
            st.execute();
        } catch (Exception ex) {
            Logger.getLogger(MatDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            disconnect();
        }*/
    } 
}
