
package paisesciudades;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        public String paises;
        public String ciudades;
        
        Scanner sn= new Scanner(System.in);
        PaisesCiudades matriz[][]= new PaisesCiudades[5][3];
        // Guardar objetos Paises ciudades en matriz 
        for(int f=0; f<3; f++){
            System.out.println("Ingrese pais");
            paises = sn.nextLine();
            for(int c=0; c<5; c++){
                System.out.println("Ingrese ciudad");
                ciudades = sn.nextLine();
                
            PaisesCiudades obj= new PaisesCiudades(paises,ciudades);
            matriz[f][c]= obj;
        }
            
}   }
        
        }
}
