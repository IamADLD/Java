/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffinal2;

import static ffinal2.Product.PrintAllProduct;
import static ffinal2.Product.SearchByName;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 *
 * @author hp
 */
public class FFinal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
                Scanner kb =new Scanner(System.in);
       ArrayList<Product> n1 = new ArrayList();
       ArrayList<Product> n2 = new ArrayList();
       File file1 = new File("c:\\test\\123.txt");
       if(!file1.exists()){
       boolean isCreated=file1.createNewFile();
       if(isCreated==false){
           System.out.println("Unable to create file");
       }
       }
        System.out.println("store system menu");
        int i =1;
        while(true){
           
               System.out.println("1. Add a new Item to the Store ." + "\n" +"2. Add a new Customer to the Store"+"\n"+"3. Add an item to Customer shopping cart ."+"\n"+"4. View the items in the Customer shopping cart ."+"\n"+"5. Empty Customer shopping cart ."+"\n"+"6. Search for a product name inside the store ."+"\n"+"7. Save the data to a file."+"\n"+"8. Import data from a file"+"\n"+"9. Exit the program ");
             i =kb.nextInt();
                 
                    switch (i){
                    
                        case 1:
                            System.out.println("Add Item Operation :");
                            System.out.println("The item Number :");
                            int p1=kb.nextInt();
                            
                            System.out.println("The item Name :");
                            String p2=kb.next();
                            
                            System.out.println("Please enter the quantity :");
                            int p3=kb.nextInt();
                         
                            System.out.println("Please enter the price :");
                            int p4=kb.nextInt();
                            
                            System.out.println("Please enter the type of item (b)Book , (s)Shope ,(G)Games ?");
                            String p5=kb.next();
                            
                         
                           
                          if(p5.equalsIgnoreCase("b")){
                               System.out.println("Please enter the Author Name :");
                               String p6=kb.next();
                                System.out.println("Please enter the Language :");
                               String p7=kb.next();
                                System.out.println("Item added Successfully ");
                                System.out.println("");
                            }
                            
                           if(p5.equalsIgnoreCase("s")){
                                System.out.println("Please enter the Style :");
                                String p8=kb.next();
                               System.out.println("Please enter the size :");
                               int p9=kb.nextInt();
                                System.out.println("Please enter the color :");
                                int p10=kb.nextInt();
                           
                            }
                            
                           if(p5.equalsIgnoreCase("G")){
                               System.out.println("Please enter the ReleaseData :");
                               String r1=kb.next();
                                System.out.println("Please enter the CompanyName :");
                                String r2=kb.next();
                              System.out.println("Please enter the rating :");
                                String r3=kb.next();
                            
                            }
                            System.out.println("Do you want to add another item (y/n)");
                            String r4=kb.next();
                             break;
                        case 2:
                            System.out.println("Add new Customer opration :");
                            System.out.println("the Customer number is :");
                            int r5=kb.nextInt();
                            System.out.println("please entre the customer Name :");
                            String r6=kb.next();
                            System.out.println("customer was added with empty shopping cart successfully");
                            System.out.println("Do you want add anther Customer (y/n)");
                               String r7=kb.next();
                            break;
                        case 3:
                      
                            System.out.println("Add Item to customer shopping cart operation :");
                            System.out.println("please enter the customer number :");
                            int f1=kb.nextInt();
                            System.out.println("the customer no :");
                            String f2=kb.next();
                            System.out.println("the customer name :");
                            String f3=kb.next();
                           if(f3.equals(n1)&& f2.equals(n1)){
                               System.out.println("Item in the store");
                           
                           
                           }else{
                               System.out.println("This client doesn't exist.");
                           
                           }
                           break;
                        case 4:
                            System.out.println("view the item in customer shopping cart operation :");
                            System.out.println("Enter customer number :");
                            int f5=kb.nextInt();
                           PrintAllProduct();
                            break;
                            ////////طباعة كل منتجات من دالة 
                        case 5:
                            DeleteProduct();
                            
                            
                            /////////دالة الحذف
                            break;
                        case 6:
                            //SearchByName;
                            ///دالة البحث بالاسم
                            break;
//                        case 7:
//                            ///حفظ البيانات في ملف
//                            break;
//                        case 8:
//                            Scanner k =new Scanner(new File("c:\\test\\123.txt"));
//                            String l1=k.nextLine();
//                              String l2=k.nextLine();
//                              String content="";
//                              while(k.hasNextLine()){
//                               content+=k.nextLine();
//                              }
//                            /// استيراد البيانات في ملف
//                              break;
                        case 9:
                            System.out.println("Good Bay");
                            System.exit(0);
            
                           }
                                
                            
                            
                            
                            
                    
                    }
                    
                    
                    
                    
                    
            }
        
        }


    

        
    
    
    

