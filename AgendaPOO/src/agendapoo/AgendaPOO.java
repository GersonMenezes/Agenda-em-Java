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
                    if(arqLoad.equals("")){
                        System.out.println("Empty file");
                    }
                    else{
                        System.out.println("Os arquivos carregados sao: \n\n" + arqLoad + "\n");
                        //System.out.println("Deseja adiciona-los ao book temporario?");
                        Control.setFileRead(arqLoad);
                        //test = arqLoad.split("\n")[0];
                        //System.out.println(test);
                    }break;
                case 2:
                    arqLoad = Control.getAll();
                    boolean x = Arquivo.Write(caminho, arqLoad);
                    if(x == true)
                        System.out.println("That's okay");
                    else
                        System.out.println("It's not possible to write in the file... try again");
                    break;
                case 3:
                    Add novo = new Add();
                    novo.addNew();
                    break;
                case 4:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Tell the first name: ");
                    string = in.nextLine();
                    Remove.removeItem(string);
                    break;
                case 5:
                    Edit.setEdit();
                    //System.out.println("\n Sorted ;-) \n");
                    break;
                case 6:
                    Sort.sortByFirstName();
                    System.out.println("\n Sorted ;-) \n");
                    break;
                case 10:
                    Control.printAll();
                    break;
                default:
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