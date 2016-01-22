/* Jared Horvat
   Java Programming 271
   January 22, 2016
   Lab #1 - Client Program */
   
public class TestNameClass {
  public static void main(String[] args) {
    Name n1 = new Name("Jared", "J.", "Horvat");
    System.out.println(n1.getNormalOrder());
    Name n2 = new Name("John", "A.", "Smith");
    System.out.println(n2.getNormalOrder());
    Name n3 = new Name("Sarah", "M.", "Johnson");
    System.out.println(n3.getReverseOrder());
    System.out.println(n3);
    n1.setFirstName("Billy");
    System.out.println(n1);
    System.out.println(n1.getFirstName());
    n3.setFirstName("Voss");
    n2.setMiddleInitial("Is");
    n1.setLastName("Awesome");
    System.out.print(n3.getFirstName() + " ");
    System.out.print(n2.getMiddleInitial() + " ");
    System.out.print(n1.getLastName());
    
  }//end main
}
