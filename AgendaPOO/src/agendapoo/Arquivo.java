package agendapoo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class Arquivo {
    
    public static String Read(String caminho) 
    {
        String conteudo = "";
        
        try {
            FileReader arquivo = new FileReader(caminho); // Ponteiro para o arquivo
            BufferedReader arqBuf = new BufferedReader(arquivo);
            String linha = "";
            
            try {
                linha = arqBuf.readLine();
                while (linha != null) {
                    conteudo += linha + "\n";
                    linha = arqBuf.readLine();  
                }
                conteudo += linha;
                
            } catch (IOException ex) {
                conteudo = "Erro, it can't to read de file";
            }
        } catch (FileNotFoundException e) {
            conteudo = "Erro, it can't to find the path:" + caminho;
        }
        if (conteudo.contains("Erro")) {
            return "";
        } else {
            return conteudo;
        }

    }

    public static boolean Write(String caminho, String texto) {
        try {                                                   // Nao estava conseguindo nao sobrescrever
            FileWriter pont = new FileWriter(caminho, true); // Ponteiro para o arquivo. Segundo argumento faz nao sobrescrever antigo file
            PrintWriter gravador = new PrintWriter(pont);
            gravador.print(texto);
            gravador.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static boolean overWrite(String caminho, String texto) {
        try {
            FileWriter pont = new FileWriter(caminho); // Ponteiro para o arquivo
            PrintWriter gravador = new PrintWriter(pont); // Gravador de arquivo
            gravador.print(texto);
            gravador.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
