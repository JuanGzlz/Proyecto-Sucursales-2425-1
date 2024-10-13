/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Admin
 */
public class Nodo {
    private Nodo pNext;
    private Object data;

    public Nodo(Object data) {
        this.pNext = null;
        this.data = data;
    }

    public Nodo getpNext() {
        return pNext;
    }

    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    
}
