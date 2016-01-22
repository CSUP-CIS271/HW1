/*
 * David Giordano
 * Java 271 Professor Voss
 * 1/22/16
 * Class file with client file. Lab #1
 */

  public class Lab1 {
  public static void main (String[] args) {
    TestNameclass n1 = new TestNameclass("David", "A", "Smith");
    TestNameclass n2 = new TestNameclass("Amdrew", "J", "Luck");
    
   System.out.print("Regular name #1 - ");
   System.out.println(n1.getNormalOrder());
   System.out.print("Regular name #2 - ");
   System.out.println(n2.getNormalOrder());
   System.out.print("Backwards name #1 - ");
   System.out.println(n1.getReverseOrder());
   System.out.print("Backwards name 2 - ");
   System.out.println(n2.getReverseOrder());
   System.out.print("toString - ");
   System.out.println(n1);
   System.out.print("Reset first name - ");
   n1.setfName("Jason");
   System.out.println(n1.getfName());
 
  }
}
