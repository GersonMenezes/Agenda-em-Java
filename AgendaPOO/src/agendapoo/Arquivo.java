package agendapoo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedReader;
                

public class Arquivo {
    public static String Read(String caminho){
        String conteudo = "";
       try{
            FileReader arquivo = new FileReader(caminho);
            BufferedReader arqBuf = new BufferedReader(arquivo);
            String linha = "";
            try{
                linha = arqBuf.readLine();
                while(linha != null){
                    conteudo += linha + "\n";
                    linha = arqBuf.readLine();
                }
            }
            catch(IOException ex){
                conteudo = "Erro, it can't to read de file";
            }
         }
       catch(FileNotFoundException e){
           conteudo = "Erro, it can't to find the path:" + caminho;
       }
        if(conteudo.contains("Erro"))
            return "";
        else
            return conteudo;
            
    }
    
}
