/* Java 2 T Th 11:15 Professor Voss
 * Randall Sirota Homework 1, pg. 564 
 * Create a Class file and test the file with a client file
 */
public class Name {
	
	private String fName;
	private String mName;
	private String lName;
	
	// generic constructor
	public Name() {
	}
	
	// first middle and last name constructor
	public Name(String f, String m, String l) {
	this.fName = f;
	this.mName = m;
	this.lName = l;
	}
	
	public String getNormalOrder() {
		return this.fName + " " + this.mName + "." + " " + this.lName;
	}
	
	public String getReverseOrder() {
		return this.lName + " " + this.fName + " " + this.mName + ".";
	}
	
	@Override
	public String toString() {
		return this.fName + " " + this.mName + "." + " " + this.lName;
	}
	
	public void setFirstName(String f) {
		this.fName = f;
	}
	public void setMiddleName(String m){
		this.mName = m;
	}
	public void setLastName(String l) {
		this.lName = l;
	}
	public String getFirstName() {
		return fName;
	}
	public String getMiddleName() {
		return mName;
	}
	public String getLastName() {
		return lName;
	}
}
