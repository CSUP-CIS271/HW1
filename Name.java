  /* Jared Horvat
   Java Programming 271
   January 22, 2016
   Lab #1 - Constrictor */
   
public class Name {
  private String first;
  private String middle;
  private String last;

public Name (String first, String middle, String last) {
  this.first = first;
  this.middle = middle;
  this.last = last;
}
public String getNormalOrder() {
  return first + " " + middle + " " + last;
  
}//end method
public String getReverseOrder() {
  return last + " " + first + " " + middle;
  
}//end method

public String getFirstName() {
 return first;
}
public String getMiddleInitial() {
 return middle;
}
public String getLastName() {
 return last;
}
public void setFirstName(String first) {
  this.first = first;
}
public void setMiddleInitial(String middle) {
  this.middle = middle;
}
public void setLastName(String last) {
  this.last = last; 
}
public String toString() {
  return first + " " + middle + " " + last;
}
}
