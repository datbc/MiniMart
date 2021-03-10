/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class OrderDetail {
    private int id;
    private int productID;
    private int orderID;
    private int quantity;

    public OrderDetail(int productID, int quantity) {
        this.productID = productID;
        this.quantity = quantity;
    }

    
    public OrderDetail() {
    }

    public OrderDetail(int id, int productID, int orderID, int quantity) {
        this.id = id;
        this.productID = productID;
        this.orderID = orderID;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
