
package pilas;
public class Pilas {
 private int size;
    private String[] array;
    private int top = -1;

    public Pilas(int size) {//indicamos la cantidad de elementos a la pila
        this.size = size;
        array = new String[size];

    }

    public void push(String value) {//agregas elementos
          array[++this.top]=value;
    }
    
    public String pop(){ //sacas elementos
        return array[this.top--];
    }
    
    public boolean Emty(){//nos idica q la pila esta vacia
        return this.top < 0;
    }
    public boolean Full(){//nos indica que esta llena la pila
        return this.top==this.size -1;
    }
    
    
    
}
