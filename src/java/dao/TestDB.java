/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;

/**
 *
 * @author ADMIN
 */
public class TestDB {
    public static void main(String[] args) throws Exception {
        Connection con = null;
        DBConnect db = DBConnect.getInstance();
        System.out.println((int)Math.ceil((ProductDAO.getAll().size()/4.0)));
        System.out.println(ProductDAO.getAll());
    }
}
