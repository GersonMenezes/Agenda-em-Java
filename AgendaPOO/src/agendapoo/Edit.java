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
        System.out.println("Tell the first name: ");
        String name = ent.nextLine();
        int j=0;
        
            for(int i=0; i<contador; i++){
                
                if(book[i].getFirstName().equals(name)){
                    
                    System.out.println("Os dados da pessoa que desejas editar e: " + book[i].getFirstName());
                    while(j!=6){
                        System.out.println("1. Edit First name\n2. Edit Last name\n3. Edit email\n"
                                + "4. Edit Adress\n5. Edit number\n6. Sair");
                        j = ent.nextInt();
                        switch(j){
                            case 1:
                                System.out.println("Diga que nome desejas: ");
                                Scanner name2 = new Scanner(System.in);
                                name = name2.nextLine();
                                book[i].setFirstName(name);
                                break;
                            case 6:
                                break;

                        }
                    } 
                    return;
            }
                i++;
        }  
            System.out.println("\nName not found\n");
    }
}
            
        
 
