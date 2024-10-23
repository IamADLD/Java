/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffinal2;

import java.io.File;
import java.util.ArrayList;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 *
 * @author hp
 */
public class Product {
 ArrayList<Product> n1 = new ArrayList();
       ArrayList<Product> n2 = new ArrayList();
       File newFile1 = new File("C:\\Users\\jit\\Desktop\\finalproject/employee.txt");
    private static int search(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int id;
        private String name;
    private int quantity;
    private double price;
    private double tax;
    private  int count;
     private int year;
     private String store;

    public Product(int id, String name, int quantity, double price, double tax , int count, int year ,String store) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.tax = tax;
        this.count = count;
        this.year = year;
        this.store=store;
    }

     Product(String name, int quantity, double price, double tax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    void printProduct() {
         System.out.println("name"+name);
         System.out.println("quantity"+quantity);
         System.out.println("price"+price);
         System.out.println("tax"+tax);
    }

    public long int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

     

    /**
     * @return the name
     */
    public String getName() {
        return name;
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

    /**
     * @return the tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setquantity(int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void settax(double tax) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setprice(double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
      public Product(){this.count = 1;

      
      
      }
          public static boolean AddProduct(String name , int quantity , double price , double tax){
        if(price<=0){
            return false;
        }
        if(name == null){
            return false;
        }
        int current = 0;
        Product p = new Product(name, quantity, price,tax);
        store.[current]=p;
        current++;
        return true;
    }
    
     
     
   public static boolean DeleteProduct(String id){
      int index=search(id);
     if(index !=-1){
        for (int i = index; i < current-1; i++) {
        product temp= store(i);
             store[i]=store[i+1];
            store[i+1]=temp;
////          
//       
     }
    // }
   }
        
        
        
     //   return false;
        
   // }
      
      
      public static void PrintAllProduct(){
       System.out.println("============ All Products ============");
        for (int i = 0; i < current; i++) {
           store[i].printProduct();

        }
    }
      
      public static Product SearchByName(String name){
         if(p2.equal(p2)){
             System.out.println("");
             
         }else{
             System.out.println("unable name");
         }}
      }
//    } 
         public static boolean UpdateProduct(String name,String id, int quantity , double price , double tax){
      int index=search(id);
      if(index !=-1){
         store[index].setName(name);
         store[index].setquantity(quantity);
          store[index].settax(tax);
          store[index].setprice(price);
         
          return true;
 }


    

