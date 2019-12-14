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
    
    public static void setContador(int num){
        contador = num;
    }
    
    public static String getAll(){
        String allThings = "";
        int i = 0;
        if(contador == 0){
           System.out.println("\n\n Empty book\n\n ");
           return "";
        }
        while(i<contador){
            
            if(book[i] instanceof  RegisterBookPlus){
            allThings = allThings + book[i].getFirstName() + ";" +
                    book[i].getLastName() + ";" +
                    book[i].getEmail() + ";" +
                    book[i].getAdress() + ";" +
                    book[i].getNumber() + ";" + book[i].getProfession() + ";" + book[i].getAge() + "\n";
            
            }
            
            else{
            allThings = allThings + book[i].getFirstName() + ";" +
                    book[i].getLastName() + ";" +
                    book[i].getEmail() + ";" +
                    book[i].getAdress() + ";" +
                    book[i].getNumber() + "\n";     
            }
            
            i++;
        }
            
        return allThings;
    }
    
    public static void printAll(){
        
        if(contador == 0){
            System.out.println("\nThe register book is empty\n");
            return;
        }
        else{
            for(int i=0; i<contador;i++){
                
                if(book[i] instanceof  RegisterBookPlus){
                        System.out.println(book[i].getFirstName() + " " +
                        book[i].getLastName() + " - " +
                        book[i].getEmail() + " - " +
                        book[i].getAdress() + " - " +
                        book[i].getNumber() + " - " + 
                        book[i].getProfession() + " - " + 
                        book[i].getAge()); 
                }
                else{
                        System.out.println(book[i].getFirstName() + " " +
                        book[i].getLastName() + " - " +
                        book[i].getEmail() + " - " +
                        book[i].getAdress() + " - " +
                        book[i].getNumber()); 
                }
                
            }
        }
    }
    
    public static void printControl(){
        
        System.out.println("\nNumber of records: " + contador + "  Register capacity: " + book.length + "\n");
    }
    public static void setFileRead(String data){
        String linha;
        String firstName = "Empty";
        String lastName = "Empty";
        String email = "Empty";
        String adress = "Empty";
        String number = "Zero";
        String profession;
        String age;
        int i = 0;
        //RegisterBook novo;
        
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
                int total = 0;
                for(int q=0; q < linha.length();q++){  
                      char ch = linha.charAt(q);    
                       //System.out.println("ch  : "+ ch);
                       if(ch == ';'){  
                          total=total+1;  

		            }  
		        }  
	   
                System.out.println("Total: " + total);
                
                    if(total==4){
                        firstName = linha.split(";")[0];
                        lastName = linha.split(";")[1];
                        email = linha.split(";")[2];
                        adress = linha.split(";")[3];
                        number = linha.split(";")[4];
                        book[contador] = new RegisterBook(firstName, lastName, email, adress, number);
                        contador++;
                    }
                    else if(total==6){
                        firstName = linha.split(";")[0];
                        lastName = linha.split(";")[1];
                        email = linha.split(";")[2];
                        adress = linha.split(";")[3];
                        number = linha.split(";")[4];
                        profession = linha.split(";")[5];
                        age = linha.split(";")[6];
                        book[contador] = new RegisterBookPlus(firstName, lastName, email, adress, number, profession,age);
                        contador++;
                    }
            }
            else if(linha.equals("null")){
                System.out.println("\nThat's okay\n");
                break;
            }
            i++;
        }
    }
}

                       /* int total=0;  
	   
		        for(int i=0; i<x.length();i++){  
                              char ch = x.charAt(i);  
		            String x1 = String.valueOf(ch);  
		              
                             if(x1.equalsIgnoreCase("a")){  
		                total=total+1;  
	   
		            }  
		        }  
	   
                          System.out.println(total); */