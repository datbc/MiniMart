/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Product;

/**
 *
 * @author ADMIN
 */
public class ProductDAO {

    public static ArrayList<Product> getAll() throws SQLException, Exception {
        ArrayList<Product> list = new ArrayList<>();
        DBConnect db = new DBConnect();
        try (Connection con = db.openConnection()) {

            String sql = " select Product.*, Category.Name from Product "
                    + "inner join Category on Product.CategoryID = Category.Id";
            Statement sttm = con.createStatement();
            ResultSet rs = sttm.executeQuery(sql);
            while (rs.next()) {
                Product pro = new Product();
                pro.setId(rs.getInt(1));
                pro.setName(rs.getString(2));
                pro.setPrice(rs.getDouble(3));
                pro.setImage(rs.getString(4));
                pro.setCategoryID(rs.getInt(5));
                pro.setCategoryName(rs.getString(6));
                list.add(pro);
            }
        }
        return list;

    }
    public static Product getProduct(int id) throws Exception{
        DBConnect db = new DBConnect();
        try(Connection con = db.openConnection()){
            String sql = "  select * from Product inner join Category on Product.CategoryID = Category.Id "
                    + "where Product.Id = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                return new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4)
                ,rs.getInt(5),rs.getString(8),rs.getString(6));
                
            }
            return null;
        }
    }
}
