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
public class Search extends Control{
    
    public static void searchByFirstName()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tell the first name to search: ");
        String first = entrada.nextLine();
        if(contador == 0){
            System.out.println("Empty book");
        }
        else{
            for(int i=0; i<contador; i++){
                if(book[i].getFirstName().equals(first)){
                    if(book[i] instanceof RegisterBookPlus){
                        System.out.println("\nThe data of the person that you're looking for is: \n\n" +
                        "Last name: " + book[i].getLastName() + "  " +
                        "First name: " + book[i].getFirstName() + "  " +
                        "Email: " + book[i].getEmail() + "  " +
                        "Adress: " + book[i].getAdress()+ "  " + "Number: " + book[i].getNumber()
                        + " Profession: " + book[i].getProfession() + " Age: "+ book[i].getAge());
                        System.out.println("\nTouch something to continue... ");
                        String inti = entrada.nextLine();
                        return;
                    }
                    else{
                        System.out.println("\nThe data of the person that you're looking for is: \n\n" +
                        "Last name: " + book[i].getLastName() + "  " +
                        "First name: " + book[i].getFirstName() + "  " +
                        "Email: " + book[i].getEmail() + "  " +
                        "Adress: " + book[i].getAdress()+ "  " + "Number: " + book[i].getNumber());
                        System.out.println("\nTouch something to continue... ");
                        String inti = entrada.nextLine();
                        return;
                    }
                }         
            }  
        }
            System.out.println("\nName not found\n");
        
    }
    
    public static void searchByLastName()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tell the last name to search: ");
        String last = entrada.nextLine();
        if(contador == 0){
            System.out.println("Empty book");
        }
        else{
            for(int i=0; i<contador; i++){
                if(book[i].getLastName().equals(last)){
                    if(book[i] instanceof RegisterBookPlus){
                        System.out.println("\nThe data of the person that you're looking for is: \n\n" +
                        "Last name: " + book[i].getLastName() + "  " +
                        "First name: " + book[i].getFirstName() + "  " +
                        "Email: " + book[i].getEmail() + "  " +
                        "Adress: " + book[i].getAdress()+ "  " + "Number: " + book[i].getNumber()
                        + " Profession: " + book[i].getProfession() + " Age: "+ book[i].getAge());
                        System.out.println("\nTouch something to continue... ");
                        String inti = entrada.nextLine();
                        return;
                    }
                    else{
                        System.out.println("\nThe data of the person that you're looking for is: \n\n" +
                        "Last name: " + book[i].getLastName() + "  " +
                        "First name: " + book[i].getFirstName() + "  " +
                        "Email: " + book[i].getEmail() + "  " +
                        "Adress: " + book[i].getAdress()+ "  " + "Number: " + book[i].getNumber());
                        System.out.println("\nTouch something to continue... ");
                        String inti = entrada.nextLine();
                        return;
                    }
                }         
            }  
        }
            System.out.println("\nName not found\n");
    }
    
    public static void searchByEmail()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tell the email to search: ");
        String email = entrada.nextLine();
        if(contador == 0){
            System.out.println("Empty book");
        }
        else{
            for(int i=0; i<contador; i++){
                if(book[i].getEmail().equals(email)){
                    if(book[i] instanceof RegisterBookPlus){
                        System.out.println("\nThe data of the person that you're looking for is: \n\n" +
                        "Last name: " + book[i].getLastName() + "  " +
                        "First name: " + book[i].getFirstName() + "  " +
                        "Email: " + book[i].getEmail() + "  " +
                        "Adress: " + book[i].getAdress()+ "  " + "Number: " + book[i].getNumber()
                        + " Profession: " + book[i].getProfession() + " Age: "+ book[i].getAge());
                        System.out.println("\nTouch something to continue... ");
                        String inti = entrada.nextLine();
                        return;
                    }
                    else{
                        System.out.println("\nThe data of the person that you're looking for is: \n\n" +
                        "Last name: " + book[i].getLastName() + "  " +
                        "First name: " + book[i].getFirstName() + "  " +
                        "Email: " + book[i].getEmail() + "  " +
                        "Adress: " + book[i].getAdress()+ "  " + "Number: " + book[i].getNumber());
                        System.out.println("\nTouch something to continue... ");
                        String inti = entrada.nextLine();
                        return;
                    }
                }         
            }  
        }
            System.out.println("\nName not found\n"); 
    }
    
    public static void searchByAdress()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tell the adress to search: ");
        String adress = entrada.nextLine();
        if(contador == 0){
            System.out.println("Empty book");
        }
        else{
            for(int i=0; i<contador; i++){
                if(book[i].getAdress().equals(adress)){
                    if(book[i] instanceof RegisterBookPlus){
                        System.out.println("\nThe data of the person that you're looking for is: \n\n" +
                        "Last name: " + book[i].getLastName() + "  " +
                        "First name: " + book[i].getFirstName() + "  " +
                        "Email: " + book[i].getEmail() + "  " +
                        "Adress: " + book[i].getAdress()+ "  " + "Number: " + book[i].getNumber()
                        + " Profession: " + book[i].getProfession() + " Age: "+ book[i].getAge());
                        System.out.println("\nTouch something to continue... ");
                        String inti = entrada.nextLine();
                        return;
                    }
                    else{
                        System.out.println("\nThe data of the person that you're looking for is: \n\n" +
                        "Last name: " + book[i].getLastName() + "  " +
                        "First name: " + book[i].getFirstName() + "  " +
                        "Email: " + book[i].getEmail() + "  " +
                        "Adress: " + book[i].getAdress()+ "  " + "Number: " + book[i].getNumber());
                        System.out.println("\nTouch something to continue... ");
                        String inti = entrada.nextLine();
                        return;
                    }
                }         
            }  
        }
            System.out.println("\nName not found\n");
    }
    
    public static void searchByNumber()
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tell the number to search: ");
        String number = entrada.nextLine();
        if(contador == 0){
            System.out.println("Empty book");
        }
        else{
            for(int i=0; i<contador; i++){
                if(book[i].getAdress().equals(number)){
                    if(book[i] instanceof RegisterBookPlus){
                        System.out.println("\nThe data of the person that you're looking for is: \n\n" +
                        "Last name: " + book[i].getLastName() + "  " +
                        "First name: " + book[i].getFirstName() + "  " +
                        "Email: " + book[i].getEmail() + "  " +
                        "Adress: " + book[i].getAdress()+ "  " + "Number: " + book[i].getNumber()
                        + " Profession: " + book[i].getProfession() + " Age: "+ book[i].getAge());
                        System.out.println("\nTouch something to continue... ");
                        String inti = entrada.nextLine();
                        return;
                    }
                    else{
                        System.out.println("\nThe data of the person that you're looking for is: \n\n" +
                        "Last name: " + book[i].getLastName() + "  " +
                        "First name: " + book[i].getFirstName() + "  " +
                        "Email: " + book[i].getEmail() + "  " +
                        "Adress: " + book[i].getAdress()+ "  " + "Number: " + book[i].getNumber());
                        System.out.println("\nTouch something to continue... ");
                        String inti = entrada.nextLine();
                        return;
                    }
                }         
            }  
        }
            System.out.println("\nName not found\n");
        
    }
}
