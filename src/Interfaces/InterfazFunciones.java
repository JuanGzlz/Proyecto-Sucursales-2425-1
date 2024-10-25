/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Grafo.Grafo;

/**
 * Clase InterfazFunciones
 * @author Macorre21
 * @version 1.0
 */
public class InterfazFunciones {
    
    /**
    * @param grafo variable privada de tipo Grafo que es declarada en un principio como null
    * @param T variable privada de tipo Entero que es declarada en un principio como 0
    * @param paginaprincipal variable privada que es declarada una nueva variable de la clase interfaz Bienvenida
    * @param menu variable privada que es declarada como una nueva variable de la clase interfaz Menu
    * @param cargarjson variable privada que es declarada como una nueva variable de la clase interfaz CargarJson
    * @param agregarsucursal variable privada que es declarada como una nueva variable de la clase interfaz AgregarSucursal
    * @param mostrargrafo variable privada que es declarada como una nueva variable de la clase interfaz MostrarGrafo
    * @param definirrango variable privada que es declarada como una nueva variable de la clase interfaz DefinirRango
    * @param agregarlinea variable privada que es declarada como una nueva variable de la clase interfaz AgregarLinea
    * @param coberturatotal variable privada que es declarada como una nueva variable de la clase interfaz CoberturaTotal
    */
    private static Grafo grafo = null;
    private static int  T = 0;
    private static final Bienvenida paginaprincipal= new Bienvenida(); 
    private static final Menu menu =new Menu();
    private static final CargarJson cargarjson= new CargarJson();
    private static final AgregarQuitarSucursal agregarsucursal= new AgregarQuitarSucursal();
    private static final MostrarGraph mostrargrafo = new MostrarGraph();
    private static final DefinirRango definirrango= new DefinirRango();
    private static final AgregarLinea agregarlinea = new AgregarLinea();
    private static final CoberturaTotal coberturatotal = new CoberturaTotal();
    
    /**
     * Función para que la clase de interfaz Bienvenida sea visible al llamar el método
     */
    public static void openBienvenida(){
        getBienvenida().setVisible(true);
        
    }
    
    /**
     * @return variable interna paginaprincipal
     */      
    
    public static Bienvenida getBienvenida() {
        return paginaprincipal;
    }
    
    /**
     * Función para que la clase de interfaz Menú sea visible al llamar el método
     */
    public static void openMenu() {
        getMenuPrincipal().setVisible(true);
    }
     /**
     * @return variable interna menu
     */  
      public static Menu getMenuPrincipal() {
        return menu;
    }
     
    /**
     * @return variable interna cargarjson
     */    
    public static CargarJson getCargarJson(){
       return cargarjson;
   }
   
    /**
     * Función para que la clase de interfaz CargarJson sea visible al llamar el método
     */
    public static void openCargarJson(){
       getCargarJson().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
   
    /**
     * @return variable interna agregarsucursal
     */  
   public static AgregarQuitarSucursal getAgregarQuitarSucursal(){
       return agregarsucursal;
   }
    
    /**
     * Función para que la clase de interfaz AgregarQuitarSucursal sea visible al llamar el método
     */
   public static void openAgregarQuitarSucursal(){
       getAgregarQuitarSucursal().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
   
    /**
     * @return variable interna mostrargrafo
     */  
   public static MostrarGraph getMostrarGraph(){
       return mostrargrafo;
   }
   
    /**
     * Función para que la clase de interfaz MostraGarph sea visible al llamar el método
     */
   public static void openMostarGraph(){
       getMostrarGraph().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }    
     
    /**
     * @return variable interna definirrango
     */  
    public static DefinirRango getDefinirRango(){
       return definirrango;
   }
    
    /**
     * Función para que la clase de interfaz DefinirRango sea visible al llamar el método
     */   
    public static void openDefinirRango(){
       getDefinirRango().setVisible(true);
       getMenuPrincipal().setVisible(false);   
   }
   
    /**
     * @return variable interna agregarlinea
     */      
    public static AgregarLinea getAgregarLinea() {
        return agregarlinea;
    }
   
    /**
     * Función para que la clase de interfaz AgregarLinea sea visible al llamar el método
     */    
    public static void openAgregarLinea() {
        getAgregarLinea().setVisible(true);
        getMenuPrincipal().setVisible(false);
    }
    
    /**
     * @return variable interna coberturatotal
     */  
    public static CoberturaTotal getCoberturaTotal(){
        return coberturatotal;
    }
    
    /**
     * Función para que la clase de interfaz CoberturaTotal sea visible al llamar el método
     */
    public static void openCoberturaTotal(){
        getCoberturaTotal().setVisible(true);
        getMenuPrincipal().setVisible(false);
    }
    /**
     * @return variable interna T
     */  
    public static int getT() {
        return T;
    }

    /**
     * @param P the T to set
     */
    public static void setT(int P) {
        T = P;
    }
    
    /**
     * @return variable interna grafo
     */  
    public static Grafo getGrafo(){
        return grafo;
    }

    /**
     * @param grafo the grafo to set
     */
    public static void setGrafo(Grafo grafo) {
        InterfazFunciones.grafo = grafo ;
    }
   
    /**
     * Función para que la clase de interfaz Menú sea visible la única visible cuado el usuario salga
     de las otras interfaces y vuelva al origen
     */
    public static void VolverMenu(){
        getMenuPrincipal().setVisible(true);
        getCargarJson().setVisible(false);
        getAgregarQuitarSucursal().setVisible(false);
        getCoberturaTotal().setVisible(false);
        getMostrarGraph().setVisible(false);
        getDefinirRango().setVisible(false);
        getAgregarLinea().setVisible(false);
        
   }


}
