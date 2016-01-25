/*
  * Program:  Name.java
  * Author: Brandi Jackson
  * Last modified: 1/24/2016
  * Desc:  
  */

public class Name {
    
       private String first;
       private String midInt;
       private String last;
    
    public Name(String first, String midInt, String last){
      this.first = first;
      this.midInt = midInt;
      this.last = last;
      
	 } //end name 
         
    public String getNormalOrder() {
		return first + " " + midInt + ". " + last;
      
	 } //end getNormalOrder
	
	 public String getReverseOrder() {
		return last + ", " + midInt + ". " + first;
   
    }//end getReverseOrder
    
    public String toString(){
      return getNormalOrder();
      
    }//end toString
   
    public void setFirstName(String first) {
		this.first = first;
      
	 }//endsetFirstName
  
	 public void setMiddleInitial(String midInt) {
		this.midInt = midInt;
      
	 }//end setMiddleInitial
   
    public void setLastName(String last) {
		this.last = last;
      
	 }//end setLastName
   
}//end Name
