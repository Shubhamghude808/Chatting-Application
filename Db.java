/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

/**
 *
 * @author ASUS
 */


import java.sql.*;
import java.util.Scanner;
class Db{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chat","root","");
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter address");
            String a=sc.next();
          
            System.out.println("Enter first name");
            String b=sc.next();
            System.out.println("Enter last name");
            String c=sc.next();
            

                PreparedStatement st=con.prepareStatement("insert into info(Ctext,Cencryp,SecretV) values(?,?,?)");
                st.setString(1,a);
                st.setString(2,b);
                st.setString(3,c);

                System.out.println("Data Inserted");
                st.execute();
                
             
            con.close();
        }catch(Exception e){ System.out.println(e);}
}
}