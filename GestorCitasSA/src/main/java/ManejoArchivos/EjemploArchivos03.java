package ManejoArchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class EjemploArchivos03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        StringTokenizer st;
        String linea, nombre, DNI;
        char estadoCivil;
        Integer edad, contador=0;
        
        br = new BufferedReader(new FileReader("D:\\personas.txt"));
        while((linea=br.readLine())!=null) {
            st = new StringTokenizer(linea,";");
            nombre = st.nextToken().trim();
            edad = Integer.valueOf(st.nextToken().trim());
            estadoCivil = st.nextToken().charAt(0);
            DNI = st.nextToken().trim();
            
            contador++;
            Persona personita = new Persona(nombre,edad,estadoCivil,DNI);
            System.out.println("Persona: " + contador);
            System.out.println("Datos:");
            System.out.println("Nombre:" + personita.getNombre());
            System.out.println("Edad:" + personita.getEdad());
            System.out.println("Estado Civil:" + personita.getEstadoCivil());
            System.out.println("DNI:" + personita.getDNI());
            System.out.println("-----------");
        }
        br.close();
    }
}
