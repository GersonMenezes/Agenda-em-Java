/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendapoo;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Edit extends Control{
    
    public static void setEdit(){
        Scanner ent = new Scanner(System.in);
        System.out.println("Say the person's last name: ");
        String name = ent.nextLine();
        
        int j=2;
        
            for(int i=0; i<contador; i++){
                
                if(book[i].getLastName().equals(name)){
                    Scanner name2 = new Scanner(System.in);
                    
                    while(j!=0){
                        
                        if(book[i] instanceof RegisterBookPlus){
                            
                            System.out.println("\nOs dados da pessoa que desejas editar e: \n\n"+
                            "Name: " + book[i].getFirstName() + " " + book[i].getLastName()+ " Email: "+ book[i].getEmail()+
                            " Adress: "+ book[i].getAdress()+ " Phone Number: " + book[i].getNumber() + " Profession: "
                            + book[i].getProfession()+ " Age: " + book[i].getAge() + "\n\n");
                            
                            System.out.println("1. Edit First name\n2. Edit Last name\n3. Edit email\n"
                                    + "4. Edit Adress\n5. Edit number\n6. Edit profission\n7. Edit age\n0. Sair");
                            j = ent.nextInt();
                            switch(j){
                                case 1:
                                    System.out.println("Tell the new first name one: ");
                                    //Scanner name2 = new Scanner(System.in);
                                    name = name2.nextLine();
                                    book[i].setFirstName(name);
                                    break;
                                case 2:
                                    System.out.println("Tell the new last name one: ");
                                    name = name2.nextLine();
                                    book[i].setLastName(name);
                                    break;
                                 case 3:
                                    System.out.println("Tell the new email: ");
                                    name = name2.nextLine();
                                    book[i].setEmail(name);
                                    break;
                                case 4:
                                    System.out.println("Tell the new Adress: ");
                                    name = name2.nextLine();
                                    book[i].setAdress(name);
                                    break;
                                case 5:
                                    System.out.println("Tell the new number: ");
                                    name = name2.nextLine();
                                    book[i].setNumber(name);
                                    break;
                                case 6:
                                    System.out.println("Tell the new profession: ");
                                    name = name2.nextLine();
                                    book[i].setProfession(name);
                                    break;
                                case 7:
                                    System.out.println("Tell the new age: ");
                                    name = name2.nextLine();
                                    book[i].setAge(name);
                                    break;
                                case 0:
                                    break;

                            }
                        }
                        
                        else{
                            System.out.println("\nOs dados da pessoa que desejas editar e: \n\n"+
                            "Name: " + book[i].getFirstName() + " " + book[i].getLastName()+ " Email: "+ book[i].getEmail()+
                            " Adress: "+ book[i].getAdress()+ " Phone Number: " + book[i].getNumber()+ "\n\n");
                            
                            System.out.println("1. Edit First name\n2. Edit Last name\n3. Edit email\n"
                                    + "4. Edit Adress\n5. Edit number\n0. Sair");
                            j = ent.nextInt();
                            switch(j){
                                case 1:
                                    System.out.println("Tell the new first name one: ");
                                    //Scanner name2 = new Scanner(System.in);
                                    name = name2.nextLine();
                                    book[i].setFirstName(name);
                                    break;
                                case 2:
                                    System.out.println("Tell the new last name one: ");
                                    name = name2.nextLine();
                                    book[i].setLastName(name);
                                    break;
                                 case 3:
                                    System.out.println("Tell the new email: ");
                                    name = name2.nextLine();
                                    book[i].setEmail(name);
                                    break;
                                case 4:
                                    System.out.println("Tell the new Adress: ");
                                    name = name2.nextLine();
                                    book[i].setAdress(name);
                                    break;
                                case 5:
                                    System.out.println("Tell the new number: ");
                                    name = name2.nextLine();
                                    book[i].setNumber(name);
                                    break;
                                case 6:
                                    break;

                            }
                        }
                    } 
                    return;
            }
        }  
            System.out.println("\nName not found\n");
    }
}
            
        
 
