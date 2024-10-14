/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Admin
 */
public class Lista {
    private Aristas pFirst;
    private Aristas pLast;
    private int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return getpFirst() == null;
    }
    
    public void addArista (Aristas myArista){
        if (isEmpty()){
            setpFirst(myArista);
            setpLast(myArista);
        } else{
            getpLast().setpNext(myArista);
            setpLast(myArista);
        }
        setSize(getSize()+1);
    }
    
    public void addLast (String nombre){
        Aristas NuevoNodo = new Aristas(nombre);
        if (isEmpty()){
            setpFirst(NuevoNodo);
            setpLast(NuevoNodo);
        } else{
            getpLast().setpNext(NuevoNodo);
            setpLast(NuevoNodo);
        }
        setSize(getSize()+1);
    }
    
    public void eliminate(String nombre){
        if (getpFirst().getNombre().equals(nombre)){
            setpFirst(getpFirst().getpNext());
        }else{
            Aristas aux = getpFirst();
            Aristas prev = getpFirst();
            while (!aux.getNombre().equals(nombre)){
                prev = aux;
                aux = aux.getpNext();
            }
            prev.setpNext(aux.getpNext());
            aux.setpNext(null);
        }
        setSize(getSize()-1);
    }
}
