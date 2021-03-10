/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Category;

/**
 *
 * @author ADMIN
 */
public class CategoryDAO {
    public static ArrayList<Category> getAll() throws SQLException, Exception{
        ArrayList<Category> list = new ArrayList<>();
        DBConnect db = new DBConnect();
        try(Connection con = db.openConnection()) {
        
        String sql = "select * from Category";
        Statement sttm = con.createStatement();
        ResultSet rs = sttm.executeQuery(sql);
        while(rs.next()){
            Category ca = new Category();
            ca.setId(rs.getInt(1));
            ca.setName(rs.getString(2));
            list.add(ca);
        }
        
        }
        return list;
              
    }
}
