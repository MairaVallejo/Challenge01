
package pilas;
public class Principal {
    public static void main(String args[]){
        int cant=4;
        Pilas pila=new Pilas(cant);
        if(!pila.Full())
        pila.push("prueba");
        pila.push("prueba2");
        pila.push("prueba3");
        
          if(!pila.Empty()){
            System.out.println(pila.Views());
        }
        while(!pila.Empty()){
            System.out.println(pila.pop());
        }
        
    }
}
