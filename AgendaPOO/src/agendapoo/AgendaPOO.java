/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendapoo;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Guilherme
 */
public class AgendaPOO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RegisterBook[] book = new RegisterBook[2];
        Scanner entrada = new Scanner(System.in);
        int getOption = 0;
        String arqLoad = "";
        String caminho = "RegisterBook.txt";
        String arqWrite = "";
        String test = "Testando\n";
        String string = "";
        
        
        while(getOption != 8){
            System.out.println("\n1. Load from the file\n2. Save to file\n3. Add an entry\n"
                    + "4. Remove an entry\n5. Edit an existing entry\n6. Sort the adress book\n"
                    + "7. Search for a especific entry\n8. Quit\n9. More");
            getOption = entrada.nextInt();
            
            switch (getOption) {
                case 1:
                    arqLoad = Arquivo.Read(caminho);
                    if(arqLoad.equals("") || arqLoad.equals("null")){
                        System.out.println("Empty file");
                    }
                    else{
                        //System.out.println("Os arquivos carregados sao: \n\n" + arqLoad + "\n");
                        //System.out.println("Deseja adiciona-los ao book temporario?");
                        Control.setFileRead(arqLoad);
                        Control.printAll();
                        //test = arqLoad.split("\n")[0];
                        //System.out.println(test);
                    }break;
                case 2:
                    System.out.println("\nDo you want to overwrite the existing file?\n1. Yes\n2. No");
                    getOption = entrada.nextInt();
                    arqLoad = Control.getAll();
                    boolean x = false;
                    if(getOption == 1){
                        x = Arquivo.overWrite(caminho, arqLoad);
                    }
                    else if(getOption == 2){
                        x = Arquivo.Write(caminho, arqLoad);
                    }
                    else
                        System.out.println("That's okay");
                    
                    if(x == true)
                        System.out.println("That's okay");
                    else
                        System.out.println("It's not possible to write in the file... try again");
                    break;
                case 3: // Add an entry
                    System.out.println("Do you want a 1. Simple or 2. plus register?");
                    getOption = entrada.nextInt();
                    if(getOption == 1)
                    {
                        Add novo = new Add();
                        novo.addNew();
                    }
                    else if(getOption == 2){
                        Add novo = new Add();
                        novo.addNewPlus();
                    }
                    else{
                        System.out.println("\nWrong Option...\n....");
                    }
                    break;
                case 4: // Remove an entry
                    Scanner in = new Scanner(System.in);
                    System.out.println("Tell the last name: ");
                    string = in.nextLine();
                    Remove.removeItem(string);
                    break;
                case 5: // Edit
                    Edit.setEdit();
                    // System.out.println("\n Sorted ;-) \n");
                    break;
                case 6: // Sort the adress book
                    Sort.sortByFirstName();
                    System.out.println("\n Sorted ;-) \n");
                    break;
                case 7: // Search by last name
                    Search.searchByLastName();
                    break;
                case 8: // Quit
                    return;
                case 9: // More
                    System.out.println("\n10. Show all\n11. Search by\n12. Sort by\n13. Show log information\n14. Clear all records");
                    int getOption2 = entrada.nextInt();
                    if(getOption2 == 10){
                      Control.printAll();  
                    }
                    else if(getOption2 == 11){
                        System.out.println("\nChoose how do you want to search the register: \n1. By first name\n2. By Last name\n"
                                + "3. By email\n4. By adress\n5. By number\n");
                        int getOption3 = entrada.nextInt();
                        switch(getOption3){
                            case 1:
                                Search.searchByFirstName();
                                break;
                            case 2:
                                Search.searchByLastName();
                                break;
                            case 3:
                                Search.searchByEmail();
                                break;
                            case 4:
                                Search.searchByAdress();
                                break;
                            case 5:
                                Search.searchByNumber();
                                break;
                            default:
                                System.out.println("Wrong option...");
                                break;
                        }
                    }
                    else if(getOption2 == 12){
                        System.out.println("Tell how do you want to sort the register: \n1. By first name\n2. By Last name\n"
                                + "3. By email\n4. By adress\n5. By number\n");
                        int getOption3 = entrada.nextInt();
                        switch(getOption3){
                            case 1:
                                Sort.sortByFirstName();
                                break;
                            case 2:
                                Sort.sortByLastName();
                                break;
                            case 3:
                                Sort.sortByEmail();
                                break;
                            case 4:
                                Sort.sortByAdress();
                                break;
                            case 5:
                                Sort.sortByNumber();
                                break;
                            default:
                                System.out.println("Wrong option...");
                                break;
                        }
                    }
                    else if(getOption2 == 13){
                        Control.printControl();
                    }
                    else if(getOption2 == 14){
                        Control.setContador(0);
                    }
                    else
                      System.out.println("\nWrong option...\n");  
                    break;
                case 10:
                    Control.printAll();
                    break;
                case 99:
                    Control.printControl();
                    break;
                default:
                    System.out.println("\nWrong option...\n");
                    break;
            }
        }
        
    }
    
}


/*String caminho = "test.txt";
        String texto = "Ehhhhhhhhhh\nI can do anything\nSo let's set the world in fire...";
        
        if(Arquivo.Write(caminho, texto));
        else System.out.println("Erro ao salvar arquivo");
    
    String text = Arquivo.Read(caminho);
    if(text.isEmpty()){
        System.out.println("Erro ao carregar arquivo");
    }
    else
        System.out.println(text);
    }*/