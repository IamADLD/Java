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
public class Customar extends Product{
     ArrayList<Product> n1 = new ArrayList();
       ArrayList<Product> n2 = new ArrayList();
       File newFile1 = new File("C:\\Users\\jit\\Desktop\\finalproject/employee.txt");
    private long id ;
 private String NameCustmer;
 private String addrees;
 private String userName;
 private long password;
 private boolean isInsert;
 public Customar (){
     this.setIsInsert(false);
 }
  public Customar (long id,String NameCustmer, String addrees, String userName,long password,boolean isInsert){
      this.setId(id);
      this.setNameCustmer(NameCustmer);
      this.setAddrees(addrees);
      this.setPassword(password);
      this.setUserName(userName);
    
    
    
    
    
}

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the NameCustmer
     */
    public String getNameCustmer() {
        return NameCustmer;
    }

    /**
     * @param NameCustmer the NameCustmer to set
     */
    public void setNameCustmer(String NameCustmer) {
        this.NameCustmer = NameCustmer;
    }

    /**
     * @return the addrees
     */
    public String getAddrees() {
        return addrees;
    }

    /**
     * @param addrees the addrees to set
     */
    public void setAddrees(String addrees) {
        this.addrees = addrees;
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

    /**
     * @return the password
     */
    public long getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(long password) {
        this.password = password;
    }

    /**
     * @return the isInsert
     */
    public boolean isIsInsert() {
        return isInsert;
    }

    /**
     * @param isInsert the isInsert to set
     */
    public void setIsInsert(boolean isInsert) {
        this.isInsert = isInsert;
    }
    
}
    

