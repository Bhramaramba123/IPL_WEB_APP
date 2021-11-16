package in.co.ipl.model;


public class UserBean {
	
   private String Username;
   private String Password;
   private String Firstname;
   private String Lastname;
   public boolean valid;
	
	
   public String getFirstname() {
      return Firstname;
	}

   public void setFirstname(String newFirstname) {
      Firstname = newFirstname;
	}

	
   public String getLastname() {
      return Lastname;
			}

   public void setLastname(String newLastname) {
      Lastname = newLastname;
			}
			

   public String getPassword() {
      return Password;
	}

   public void setPassword(String newPassword) {
      Password = newPassword;
	}
	
			
   public String getUsername() {
      return Username;
			}

   public void setUsername(String newUsername) {
      Username = newUsername;
			}

				
   public boolean isValid() {
      return valid;
	}

   public void setValid(boolean newValid) {
      valid = newValid;
	}	
}