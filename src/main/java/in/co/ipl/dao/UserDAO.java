package in.co.ipl.dao;


import in.co.ipl.dbaccess.JDBCAccessImp;
import in.co.ipl.model.UserBean;
import java.sql.*;

public class UserDAO 	
{
   
   static JDBCAccessImp jdbc = new JDBCAccessImp();
   static Connection connection = jdbc.getConnection();
   //Utils utils = new Utils();
   
   static ResultSet rs = null; 
   
  
   public static UserBean login(UserBean bean) 
   {
	  Statement stmt = null;    
      String Username = bean.getUsername();    
      String Password = bean.getPassword();   
      String   SELECTUSER = "select * from ipldb.users where Username=\"'Username'\" AND Password=\"'Password'\" ";
		    
   try 
   {
      stmt=connection.createStatement();
      rs = stmt.executeQuery(SELECTUSER);	        
      boolean more = rs.next();
	       
      if (!more) 
      {
         System.out.println("Sorry, you are not a registered user! Please sign up first");
         bean.setValid(false);
      } 
	        
      else if (more) 
      {
         String Firstname = rs.getString("Firstname");
         String Lastname = rs.getString("Lastname");
	     	
         System.out.println("Welcome " + Firstname);
         bean.setFirstname(Firstname);
         bean.setLastname(Lastname);
         bean.setValid(true);
      }
   } 

   catch (Exception ex) 
   {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
   } 
	    

   finally 
   {
      if (rs != null)	{
         try {
            rs.close();
         } catch (Exception e) {}
            rs = null;
         }
	
      if (stmt != null) {
         try {
            stmt.close();
         } catch (Exception e) {}
            stmt = null;
         }
	
      if (connection != null) {
         try {
        	 connection.close();
         } catch (Exception e) {
         }

         connection = null;
      }
   }

return bean;
	
   }	
}