
package agendapoo;


public class RegisterBook implements Register{
    
    String firstName;
    String lastName;
    String email;
    String adress;
    String phoneNumber;
    
    public RegisterBook(String fName, String lName, String mail, String adress, String number){
        firstName = fName;
        lastName = lName;
        email = mail;
        this.adress = adress;
        phoneNumber = number;
    }
    
    @Override
    public String getFirstName(){
        return firstName;
    }
    
    @Override
    public String getLastName(){
        return lastName;
    }
    
    @Override
    public String getEmail(){
        return email;
    }
    
    public String getProfession(){
        return "Empty";
    }
    
  
    public String getAge(){
        return "Empty";
    }
    
    public String getAdress(){
        return adress;
    }
    
    public String getNumber(){
        return phoneNumber;
    }
    public void setFirstName(String name){
        firstName = name;
    }
    public void setLastName(String name){
        lastName = name;
    }
    public void setEmail(String name){
        email = name;
    }
    public void setAdress(String name){
        adress = name;
    }
    public void setNumber(String name){
        phoneNumber = name;
    }

    public void setAge(String name){
        lastName = "Error";
    }
   
    public void setProfession(String name){
        firstName = "error";
    }
}
