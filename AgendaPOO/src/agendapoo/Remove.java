/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendapoo;

/**
 *
 * @author Acer
 */
public class Remove extends Control{
    
    public static void removeItem(String last){
        
        if(contador == 0){
            System.out.println("Empty book");
        }
        else{
            for(int i=0; i<contador; i++){
                if(book[i].getLastName().equals(last)){
                    while((i+1)<contador){
                        book[i] = book[i+1];
                        i++;
                    }
                    contador--;
                    break;
                 }  
             }
            System.out.println("\nName not found\n");
        }
    }
}
