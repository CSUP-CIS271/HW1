/*
 * TestNameClass.java
 * Joshua Greer
 * January 28, 2016
 * HW1
 */

public class TestNameClass {
  public static void main(String[] args) {
    Name n1 = new Name("John", "Q", "Public");
    
    //Returns normal order
    System.out.println(n1.getNormalOrder());
   
    //Returns reverse order
    System.out.println(n1.getReverseOrder());
    
    //To String
    System.out.println(n1.toString());
    
    //Sets first name, middle initial, and last name
    n1.setfirstName("Zelda");
    n1.setmiddleInit("D");
    n1.setlastName("Wind");
    
    //New name to string
    System.out.println(n1.toString());
    
    //Returns current first name, middle initial, and last name
    System.out.println(n1.getfirstName());  
    System.out.println(n1.getmiddleInit());
    System.out.println(n1.getlastName());
    
        

  }
}
