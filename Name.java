public class Name{
    private String first_name;
    private String last_name;
    private String m_initial;

    // Constructor, Explicit
    public Name(String f_name, String l_name, String m_init) {
        first_name = f_name;
        last_name = l_name;
        m_initial = m_init;
    }
    
    //Constructor, Implicit
    public Name() {
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public void setMiddileInitial(String m_initial) {
        this.m_initial = m_initial + ".";
    }

    public String getFirstName(){
        return first_name;
    }

    public String getLastName(){
        return last_name;
    }

    public String getMiddidleInitial(){
        return m_initial;
    }

    public String getNormalOrder() {
        return first_name + " " + m_initial + " " + last_name;
    }

    public String getReverseOrder() {
        return last_name + ", " + m_initial + " " + first_name;
    }

    public String toString() {
        return getNormalOrder();
    }

    // Main Method
    public static void main(String[] cl_args) {
        Name person1 = new Name();
        person1.setFirstName("Griffin");
        person1.setMiddileInitial("X");
        person1.setLastName("Kanke");
        Name person2 = new Name("Michael", "J", "Leonard");
        System.out.print("Person 1: ");
        System.out.println(person1.getNormalOrder());
        System.out.print("Person 2: ");
        System.out.println(person2.getReverseOrder());
    }
}
