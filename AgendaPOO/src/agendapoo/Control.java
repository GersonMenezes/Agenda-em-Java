/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendapoo;


public class Control {
    
    protected static int contador = 0;
    protected static RegisterBook[] book = new RegisterBook[2];
    
    public int getContador(){
        return contador;
    }
    
    public void setContador(int num){
        contador = contador + num;
    }
    
    public static String getAll(){
        String allThings = "";
        int i = 0;
        if(contador == 0){
           System.out.println("\n\n Empty book\n\n ");
           return "Corno";
        }
        while(i<contador){
            allThings = allThings + book[i].getFirstName() + ";" +
                    book[i].getLastName() + ";" +
                    book[i].getEmail() + ";" +
                    book[i].getAdress() + ";" +
                    (char)book[i].getNumber() + "\n";
            i++;
        }
        return allThings;
    }
    public static void printAll(){
        
        for(int i=0; i<contador;i++){
        System.out.println(book[i].getFirstName() +
                    book[i].getLastName() +
                    book[i].getEmail() +
                    book[i].getAdress() + 
                    (char)book[i].getNumber());
        
        }
    }
    public static void setFileRead(String data){
        String linha;
        String firstName = "Empty";
        String lastName = "Empty";
        String email = "Empty";
        String adress = "Empty";
        int number = 0;
        int i = 0;
        //RegisterBook novo;
        if(data.equals("\n")){
            System.out.println("Empty File: ");
            return;
        }
        while(i<100){
            
            linha = data.split("\n")[i];
            //System.out.println("Linha" + i + linha);
            if(!linha.equals("null")){
                if(book.length <= contador){
                    RegisterBook[] novoVet = new RegisterBook[2*book.length];
                    for(int j = 0; j<book.length; j++){
                        novoVet[j] = book[j];
                    }
                     book = novoVet;
                     }
                firstName = linha.split(";")[0];
                System.out.println("First name:  "+ i + firstName);
                lastName = linha.split(";")[1];
                System.out.println("Last Name: " +i+ lastName);
                email = linha.split(";")[2];
                adress = linha.split(";")[3];
                number = 1;
                book[contador] = new RegisterBook(firstName, lastName, email, adress, number);
                contador++;
            }
            else if(linha.equals("null")){
                System.out.println("Okay baby\n");
                break;
            }
            i++;
        }
    }
}