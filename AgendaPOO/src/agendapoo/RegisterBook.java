
package agendapoo;


public class RegisterBook {
    
    String firstName;
    String lastName;
    String email;
    String adress;
    int phoneNumber;
    
    public RegisterBook(String fName, String lName, String mail, String adress, int number){
        firstName = fName;
        lastName = lName;
        email = mail;
        this.adress = adress;
        phoneNumber = number;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public int getNumber(){
        return phoneNumber;
    }
    public void setFirstName(String name){
        firstName = name;
    }
}
