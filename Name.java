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
    
    // Constructor, Implicit
    public Name() {
    }
    
    // Setters
    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public void setMiddleInitial(String m_initial) {
        this.m_initial = m_initial + ".";
    }
    
    // Getters
    public String getFirstName(){
        return first_name;
    }

    public String getLastName(){
        return last_name;
    }

    public String getMiddleInitial(){
        return m_initial;
    }

    public String getNormalOrder() {
        return first_name + " " + m_initial + " " + last_name;
    }

    public String getReverseOrder() {
        return last_name + ", " + m_initial + " " + first_name;
    }
    
    // ToString Method
    public String toString() {
        return getNormalOrder();
    }

}
