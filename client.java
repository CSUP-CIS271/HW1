public class client {
    public static void main(String[] cl_args) {
        /* Test Program for HW 1, Test all methods. */
        // Test Person 1
        Name person1 = new Name();
        person1.setFirstName("Griffin");
        person1.setMiddleInitial("X");
        person1.setLastName("Kanke");
        Name person2 = new Name("Michael", "J", "Leonard");
        System.out.print("Person 1 First Name: ");
        System.out.println(person1.getFirstName());
        System.out.print("Person 1 Middile Initial: ");
        System.out.println(person1.getMiddleInitial());
        System.out.print("Person 1 Last Name: ");
        System.out.println(person1.getLastName());
        System.out.print("Person 1 : ");
        System.out.println(person1.getNormalOrder());

        // Test Person 2, and getReverseOrder()
        System.out.print("Person 2: ");
        System.out.println(person2.getReverseOrder());
    }
}
