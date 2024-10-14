/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Admin
 */
public class Grafo {
    private Aristas pFirst;
    private Aristas pLast;

    public Grafo(Aristas pFirst, Aristas pLast) {
        this.pFirst = pFirst;
        this.pLast = pLast;
    }

    public Aristas getpFirst() {
        return pFirst;
    }

    public void setpFirst(Aristas pFirst) {
        this.pFirst = pFirst;
    }

    public Aristas getpLast() {
        return pLast;
    }

    public void setpLast(Aristas pLast) {
        this.pLast = pLast;
    }
    
    
    
    public Aristas busquedaInicial(String nombre){
        Aristas current = getpFirst();
        while (current != null){
        if (current.getNombre().equals(nombre)){
            return current;
        }
        else{
            current = current.getpNext();
        } 
    }
        return current;
    }
}
