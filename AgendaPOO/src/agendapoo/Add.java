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
public class Add extends Control{

    
    public void addNew(){
        if(book.length <= contador){
            RegisterBook[] novoVet = new RegisterBook[2*book.length];
            for(int i = 0; i<book.length; i++){
                novoVet[i] = book[i];
            }
            this.book = novoVet;
        }
        Scanner entrada = new Scanner(System.in);
        String firstName;
        String lastName = "Empty";
        String email = "Empty";
        String adress = "Empty";
        int number = 0;
        System.out.println("Tell the first name: ");
        firstName = entrada.nextLine();
        /*System.out.println("Tell the last name: ");
        lastName = entrada.nextLine();
        System.out.println("Tell the email: ");
        email = entrada.nextLine();
        System.out.println("Tell the adress: ");
        adress = entrada.nextLine();
        System.out.println("Tell the number: ");
        number = entrada.nextInt();*/
        book[contador] =  new RegisterBook(firstName, lastName, email, adress, number);
        contador = contador + 1;
        
    }
}
