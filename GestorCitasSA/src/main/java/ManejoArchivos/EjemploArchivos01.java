package ManejoArchivos;

import java.util.List;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploArchivos01 {
    public static void main(String[] args) throws IOException {
        List<String> viveres = new ArrayList<>();
        viveres.add("Arroz");
        viveres.add("Aceite");
        viveres.add("Azucar");
        viveres.add("Mantequilla");
        viveres.add("Leche");
        
        PrintWriter pw;
        String linea;
        pw = new PrintWriter(new FileWriter("D:\\viveres.txt",false));
        
        for(int i=0; i<viveres.size(); i++) {
            linea = viveres.get(i);
            pw.println(linea);
        }
        pw.close();
    }
}
