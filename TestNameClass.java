/* Project: HomeWork 1
 * Name: Matt S. Ham
 * Date: January 21, 2015
 * Desc:
 */

public class TestNameClass {
  public static void main(String[] args){
    Name n1 = new Name("Matthew", "S.", "Ham");

    System.out.println(n1.getNormalOrder());

    System.out.println(n1.getReverseOrder());

    System.out.println(n1.getFirstName());
    System.out.println(n1.getMiddleName());
    System.out.println(n1.getLastName());

    System.out.println(n1.toString());
  }
}
