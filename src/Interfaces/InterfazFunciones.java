/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Grafo.Grafo;
/**
 *
 * @author María Correa
 */
public class InterfazFunciones {
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
     * Metodo para que la clase de interfaz Bienvenida sea visible al llamar el metodo
     */
    public static void openBienvenida(){
        getBienvenida().setVisible(true);
        
    }
    
    //Metodo para obtener la Bienvenida ya que es un atributo privado
      public static Bienvenida getBienvenida() {
        return paginaprincipal;
    }
    
    //Metodo para que la clase de interfaz Menu sea visible al llamar el metodo
    public static void openMenu() {
        getMenuPrincipal().setVisible(true);
    }
    
    //Metodo para obtener el menu ya que es un atributo privado
      public static Menu getMenuPrincipal() {
        return menu;
    }
     
  //Metodo para que la clase de interfaz CargarJson sea visible al llamar el metodo 
   public static CargarJson getCargarJson(){
       return cargarjson;
   }
    //Metodo para obtener el CargarJson ya que es un atributo privado
   public static void openCargarJson(){
       getCargarJson().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
   
    
    //Metodo para que la clase de interfaz AgregarSucursal sea visible al llamar el metodo 
   public static AgregarQuitarSucursal getAgregarQuitarSucursal(){
       return agregarsucursal;
   }
    //Metodo para obtener el AgregarSucusal ya que es un atributo privado
   public static void openAgregarQuitarSucursal(){
       getAgregarQuitarSucursal().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
     
     //Metodo para que la clase de interfaz MostrarGrafo sea visible al llamar el metodo 
   public static MostrarGraph getMostrarGraph(){
       return mostrargrafo;
   }
    //Metodo para obtener el MostrarGrafo ya que es un atributo privado
   public static void openMostarGraph(){
       getMostrarGraph().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }

   //Metodo para que la clase interfaz DefinirRango sea visible al llamar el metodo
    public static DefinirRango getDefinirRango(){
       return definirrango;
   }
    //Metodo para obtener el DefinirRango ya que es un atributo privado
   public static void openDefinirRango(){
       getDefinirRango().setVisible(true);
       getMenuPrincipal().setVisible(false);   
   }
       
     //Metodo para que la clase de interfaz AgregarLinea sea visible al llamar el metodo 
    public static AgregarLinea getAgregarLinea() {
        return agregarlinea;
    }
   //Metodo para obtener AgregarLinea ya que es un atributo privado
    public static void openAgregarLinea() {
        getAgregarLinea().setVisible(true);
        getMenuPrincipal().setVisible(false);
    }
    
    public static CoberturaTotal getCoberturaTotal(){
        return coberturatotal;
    }
    
    public static void openCoberturaTotal(){
        getCoberturaTotal().setVisible(true);
        getMenuPrincipal().setVisible(false);
    }
     /**
     * @return the T
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
    
    public static Grafo getGrafo(){
        return grafo;
    }

    /**
     * @param grafo the grafo to set
     */
    public static void setGrafo(Grafo grafo) {
        InterfazFunciones.grafo = grafo ;
    }
   
    public static void VolverMenu(){
       //Muestro solamente el menu principal
        getMenuPrincipal().setVisible(true);
       //Logrando que las ventanas abiertas ya no se muestren
        getCargarJson().setVisible(false);
        getAgregarQuitarSucursal().setVisible(false);
        getCoberturaTotal().setVisible(false);
        getMostrarGraph().setVisible(false);
        getDefinirRango().setVisible(false);
        getAgregarLinea().setVisible(false);
        
   }


}
