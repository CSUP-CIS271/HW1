 /*
  * Program:   Name.java
  * Author:   Dan Baliczek
  * Last modified:  1/22/2016
  * Description: Object containing methods for TestNameClass.java
  */
import java.util.*;
public class Name {
 private String fName;
 private String lName;
 private String init;
 
 public Name(String fName, String lName, String init){
  this.fName = fName;
  this.lName = lName;
  this.init = init;
 }
 public Name(){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter First Name:");
  this.fName = in.next();
  System.out.println("Enter Last Name:");
  this.lName = in.next();
  System.out.println("Enter Middle Initial:");
  this.init = in.next();
  in.close();
 }
 
 public String getNormalOrder(){
  return this.fName + " " + this.init + ". " + this.lName;
 }
 public String getReverseOrder(){
  return this.lName + ", " + this.init + " " + this.fName+ ". ";
 }
 
 public String toString(){
  return getNormalOrder();
 }
 
 public String getfName() {
  return fName;
 }
 public void setfName(String fName) {
  this.fName = fName;
 }
 public String getlName() {
  return lName;
 }
 public void setlName(String lName) {
  this.lName = lName;
 }
 public String getInit() {
  return init;
 }
 public void setInit(String init) {
  this.init = init;
 }
 
}
