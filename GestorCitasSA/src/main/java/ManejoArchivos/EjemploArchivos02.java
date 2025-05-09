package ManejoArchivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class EjemploArchivos02 {
    public static void main(String[] args) throws IOException {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pepe",28,'C',"15487525"));
        listaPersonas.add(new Persona("Juan",32,'V',"15487525"));
        listaPersonas.add(new Persona("Pablo",40,'D',"15487525"));
        listaPersonas.add(new Persona("Julio",45,'C',"15487525"));
        listaPersonas.add(new Persona("Daniel",20,'S',"15487525"));
        listaPersonas.add(new Persona("Sara",18,'S',"15487525"));
        
        PrintWriter pw;
        String linea;
        pw = new PrintWriter(new FileWriter("D:\\personas.docx",false));
        
        for(int i=0; i<listaPersonas.size(); i++) {
            linea = listaPersonas.get(i).toString();
            pw.println(linea);
        }
        pw.close();        
    }
}
