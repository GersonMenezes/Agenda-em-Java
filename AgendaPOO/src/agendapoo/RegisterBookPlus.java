/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendapoo;


public class RegisterBookPlus extends RegisterBook implements Register{
   
    String profession;
    String age;
    
    public RegisterBookPlus(String fName, String lName, String mail, String adress, String number,String profissao,String age){
        super(fName, lName, mail, adress, number);
        this.profession = profissao;
        this.age = age;
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
    
   @Override
    public String getProfession(){
        return profession;
    }
    
    @Override
    public String getAge(){
        return age;
    }
    @Override
    public void setAge(String name){
        age = name;
    }
    @Override
    public void setProfession(String name){
        profession = name;
    }
}
