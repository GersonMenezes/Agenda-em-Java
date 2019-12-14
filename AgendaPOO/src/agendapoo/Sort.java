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
public class Sort extends Control{
    
    public static void sortByFirstName(){
    int i, j;
    RegisterBook tmp;
    int flag;
        for(i=0; i<(contador-1); i++){
            flag = 1; 
            for(j=0; j < (contador-i-1); j++){
                if((book[j].getFirstName().compareToIgnoreCase(book[j+1].getFirstName())) > 0 ){
                    tmp = book[j];
                    book[j] = book[j+1];
                    book[j+1] = tmp;
                    flag = 0;
                }
            }
            if(flag == 1){
                return;
            }
        }
    }
    
    public static void sortByLastName()
    {
        int i, j;
        RegisterBook tmp;
        int flag;
            for(i=0; i<(contador-1); i++){
                flag = 1; 
                for(j=0; j < (contador-i-1); j++){
                    if((book[j].getLastName().compareToIgnoreCase(book[j+1].getLastName())) > 0 ){
                        tmp = book[j];
                        book[j] = book[j+1];
                        book[j+1] = tmp;
                        flag = 0;
                    }
                }
                if(flag == 1){
                    return;
                }
            }
    }
    
    public static void sortByEmail()
    {
        int i, j;
        RegisterBook tmp;
        int flag;
            for(i=0; i<(contador-1); i++){
                flag = 1; 
                for(j=0; j < (contador-i-1); j++){
                    if((book[j].getEmail().compareToIgnoreCase(book[j+1].getEmail())) > 0 ){
                        tmp = book[j];
                        book[j] = book[j+1];
                        book[j+1] = tmp;
                        flag = 0;
                    }
                }
                if(flag == 1){
                    return;
                }
            }
    }
    
    public static void sortByAdress()
    {
        int i, j;
        RegisterBook tmp;
        int flag;
            for(i=0; i<(contador-1); i++){
                flag = 1; 
                for(j=0; j < (contador-i-1); j++){
                    if((book[j].getAdress().compareToIgnoreCase(book[j+1].getAdress())) > 0 ){
                        tmp = book[j];
                        book[j] = book[j+1];
                        book[j+1] = tmp;
                        flag = 0;
                    }
                }
                if(flag == 1){
                    return;
                }
            }
    }
    public static void sortByNumber()
    {
        int i, j;
        RegisterBook tmp;
        int flag;
            for(i=0; i<(contador-1); i++){
                flag = 1; 
                for(j=0; j < (contador-i-1); j++){
                    if((book[j].getNumber().compareToIgnoreCase(book[j+1].getNumber())) > 0){
                        tmp = book[j];
                        book[j] = book[j+1];
                        book[j+1] = tmp;
                        flag = 0;
                    }
                }
                if(flag == 1){
                    return;
                }
            }
    }
}
    
