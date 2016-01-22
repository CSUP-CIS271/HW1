/*
 * Name.java
 * Joshua Greer
 * January 28, 2016
 * HW1
 */

public class Name {
   private String firstName;
   private String middleInit;
   private String lastName;
   
   public Name(String initFirstName, String initMiddleInit, String initLastName) {
     this.firstName = initFirstName;
     this.middleInit = initMiddleInit;
     this.lastName = initLastName;
   }
   public void setfirstName(String firstName) {
     this.firstName = firstName;
   }
   public void setmiddleInit(String middleInit) {
     this.middleInit = middleInit;
   }
   public void setlastName(String lastName) {
     this.lastName = lastName;
   }
     
   public String getfirstName() {
     return firstName;
   }
   public String getmiddleInit() {
     return middleInit;
   }
   public String getlastName() {
     return lastName;
   }
        
  public String getNormalOrder() {
    return(firstName + " " + middleInit + "." + " " + lastName);
  
  }
  
  public String getReverseOrder() {
    return lastName + " " + middleInit + "." + " " + firstName;
  }
  
  public String toString() {
        return firstName + " " + middleInit + "." + " " + lastName;
  }
}
