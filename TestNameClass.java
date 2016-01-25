/*
  * Program:  TestNameClass.java
  * Author: Brandi Jackson
  * Last modified: 1/24/201
  * Desc: Test name class
*/
import java.awt.*;

public class TestNameClass {
   public static void main (String [] args){
   Name n1 = new Name("Brandi", "S", "Jackson");
	    System.out.println("Name 1:");
	    System.out.println(n1.getNormalOrder());
	    System.out.println(n1.getReverseOrder());
       System.out.println(n1.toString());
   
   
   }//end main
}//end TestNameClass
