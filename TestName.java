 /*
  * Program:   Name.java
  * Author:   Dan Baliczek
  * Last modified:  1/22/2016
  * Description: Test class for Name.java
  */
public class TestName {
 public static void main(String [] args){
  Name implicit = new Name();
  System.out.println("toString:");
  System.out.println(implicit.toString());
  System.out.println("Normal Order:");
  System.out.println(implicit.getNormalOrder());
  System.out.println("Reverse Order:");
  System.out.println(implicit.getReverseOrder());

  implicit.setfName("John");
  implicit.setlName("Kazoo");
  implicit.setInit("Q");
  System.out.println();
  System.out.println("First Name");
  System.out.println(implicit.getfName());
  System.out.println("Middle Initial");
  System.out.println(implicit.getInit());
  System.out.println("Last Name");
  System.out.println(implicit.getlName());
  System.out.println();
  System.out.println();
  
  //explicit
  Name explicit = new Name("Neil", "Harris", "P");
  System.out.println("toString:");
  System.out.println(explicit.toString());
  System.out.println("Normal Order:");
  System.out.println(explicit.getNormalOrder());
  System.out.println("Reverse Order:");
  System.out.println(explicit.getReverseOrder());

  System.out.println();
  
  explicit.setfName("John");
  explicit.setlName("Kazoo");
  explicit.setInit("Q");

  System.out.println("First Name");
  System.out.println(explicit.getfName());
  System.out.println("Middle Initial");
  System.out.println(explicit.getInit());
  System.out.println("Last Name");
  System.out.println(explicit.getlName());
 }
}
