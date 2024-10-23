/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffinal2;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Cart extends Product{
    ArrayList<Product> n1 = new ArrayList();
       ArrayList<Product> n2 = new ArrayList();
       File newFile1 = new File("C:\\Users\\jit\\Desktop\\finalproject/employee.txt");
    private String product;
private String dastcription;
    private int quantity;
    private double price;
    private double total;
    private String userName;

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the dastcription
     */
    public String getDastcription() {
        return dastcription;
    }

    /**
     * @param dastcription the dastcription to set
     */
    public void setDastcription(String dastcription) {
        this.dastcription = dastcription;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
public Cart(String product,String dastcription,int quantity,double price,double total,String userName){
    this.dastcription=dastcription;
    this.price=price;
    this.product=product;
    this.quantity=quantity;
    this.total=total;
    this.userName=userName;}
 
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}

