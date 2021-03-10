/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;

/**
 *
 * @author ADMIN
 */
public class UserDAO {
    public static User Login(String username,String password) throws Exception {
        DBConnect db = new DBConnect();
        Connection con = db.openConnection();
        String sql = "select [User].Username,[User].Password from [User] where username=? and password =?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        User u = null;
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            u = new User();
            u.setUsername(rs.getString(1));
            u.setPassword(rs.getString(2));
            return u;
        }
        return u;
    }
}
