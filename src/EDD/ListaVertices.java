/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Grafo.Vertice;

/**
 *
 * @author Admin
 */
public class ListaVertices {
    private Vertice pFirst;
    private Vertice pLast;
    private int size;

    public ListaVertices() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public Vertice getpFirst() {
        return pFirst;
    }

    public void setpFirst(Vertice pFirst) {
        this.pFirst = pFirst;
    }

    public Vertice getpLast() {
        return pLast;
    }

    public void setpLast(Vertice pLast) {
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
    
    public void addVertice (Vertice myVertice){
        if (isEmpty()){
            setpFirst(myVertice);
            setpLast(myVertice);
        } else{
            getpLast().setpNext(myVertice);
            pLast = myVertice;
        }
        setSize(getSize()+1);
    }
    
    public void addLast (String[] nombre){
        Vertice NuevoVertice = new Vertice(nombre);
        if (isEmpty()){
            setpFirst(NuevoVertice);
            setpLast(NuevoVertice);
        } else{
            getpLast().setpNext(NuevoVertice);
            setpLast(NuevoVertice);
        }
        setSize(getSize()+1);
    }
    
    public void eliminateVertice(String nombre){
        if(!isEmpty() && nombre != null){
        if (getpFirst().getNombre().equals(nombre)){
            setpFirst(getpFirst().getpNext());
        }else{
            Vertice aux = getpFirst();
            Vertice prev = getpFirst();
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
    
    public Vertice buscarVertice(String nombre){
        Vertice aux = this.getpFirst();
        if(!isEmpty()){
            while(aux!= null){
                String[] names = aux.getNombre();
                for(int i = 0; i < names.length; i++){
                if(names[i].toLowerCase().equals(nombre.toLowerCase())){
                    return aux;
                }
                }
                aux = aux.getpNext();
            }
        }
        return aux;
    }
    
    
    
    public String print(){
        String cadena = "";
        if(!isEmpty()){
            Vertice aux = getpFirst();
            while(aux!= null){
                cadena += aux.getNombre();
                aux = aux.getpNext();
            }
        }
        return cadena;
    }
}
