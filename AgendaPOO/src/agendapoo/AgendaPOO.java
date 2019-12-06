/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendapoo;

/**
 *
 * @author Guilherme
 */
public class AgendaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String caminho = "test.txt";
        String texto = "Ehhhhhhhhhh\nI can do anything\nSo let's set the world in fire...";
        
        if(Arquivo.Write(caminho, texto));
        else System.out.println("Erro ao salvar arquivo");
    
    String text = Arquivo.Read(caminho);
    if(text.isEmpty()){
        System.out.println("Erro ao carregar arquivo");
    }
    else
        System.out.println(text);
    }
    
}
