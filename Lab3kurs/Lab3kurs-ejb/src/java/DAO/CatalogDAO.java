/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Catalog;
import Models.Stuff;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Alexey
 */
@Stateful
public class CatalogDAO {

    public List<Catalog> selectCatalog() {
        ArrayList<Catalog> CatList = new ArrayList<>();
        Catalog catalog = new Catalog(1, 2, 3, "sasa", 2);
        CatList.add(catalog);
        return CatList;
    }

    public void AddCatalog(int idStuff, int idRequest, String name, int amount) {

    }

    public void deleteCatalog(List<Catalog> selectMaterial) {

    }

    public void editCatalog(int id, int idStuff, int idRequest, String name,  int amount) {
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
