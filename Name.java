public class Name {
  private String fName;
  private String mName;
  private String lName;
  
  public Name(){
  }
  
  public Name(String firstName, String middleName, String lastName){
    this.fName = firstName;
    this.mName = middleName;
    this.lName = lastName;
  }

  public String getFirstName(){ //accessor & getter
    return fName;
  }

  public String getMiddleName(){ //accessor & getter
    return mName;
  }

  public String getLastName(){ //accessor & getter
    return lName;
  }

  public void setFirstName(String firstName){ //mutator & setter
    fName = firstName;
  }

  public void setMiddleName(String middleName){ //mutator & setter
    mName = middleName;
  }

  public void setLastName(String lastName){ //mutator & setter
    lName = lastName;
  }

  public String getNormalOrder(){ //method for First, Middle, Last
    return(fName + " " + mName + " " + lName);
  }

  public String getReverseOrder(){ //method for Last, First, Middle
    return(lName + " " + fName + " " + mName);
  }
  
  public String toString(){ //medthod toString for First, Middle, Last
    return(fName + " " + mName + " " + lName);
  }
}
