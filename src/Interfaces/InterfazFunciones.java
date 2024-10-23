/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author María Correa
 */
public class InterfazFunciones {
    private static final Bienvenida paginaprincipal= new Bienvenida(); 
    private static final Menu menu =new Menu();
    private static final CargarJson cargarjson= new CargarJson();
    private static final EliminarSucursal eliminarsucursal= new EliminarSucursal();
    private static final AgregarSucursal agregarsucursal= new AgregarSucursal();
    private static final MostrarGrafo mostrargrafo = new MostrarGrafo();
    private static final GuardarCambios guardartxt= new GuardarCambios();
    private static final DefinirRango definirrango= new DefinirRango();
    
    
     //Metodo para que la clase de interfaz Bienvenida sea visible al llamar el metodo
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
   
    //Metodo para que la clase de interfaz EliminarSucursal sea visible al llamar el metodo 
   public static EliminarSucursal getEliminarSucursal(){
       return eliminarsucursal;
   }
    //Metodo para obtener el EliminarSucursal ya que es un atributo privado
   public static void openEliminarSucursal(){
       getEliminarSucursal().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
    
    //Metodo para que la clase de interfaz AgregarSucursal sea visible al llamar el metodo 
   public static AgregarSucursal getAgregarSucursal(){
       return agregarsucursal;
   }
    //Metodo para obtener el AgregarSucusal ya que es un atributo privado
   public static void openAgregarSucursal(){
       getAgregarSucursal().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
  
   
     //Metodo para que la clase de interfaz MostrarGrafo sea visible al llamar el metodo 
   public static MostrarGrafo getMostrarGrafo(){
       return mostrargrafo;
   }
    //Metodo para obtener el MostrarGrafo ya que es un atributo privado
   public static void openMostarGrafo(){
       getMostrarGrafo().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
     //Metodo para que la clase de interfaz GuardarCambios sea visible al llamar el metodo 
   public static GuardarCambios getGuardarCambios(){
       return guardartxt;
   }
    //Metodo para obtener el Guardar ya que es un atributo privado
   public static void openGuardarCambios(){
       getGuardarCambios().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
   
    public static DefinirRango getDefinirRango(){
       return definirrango;
   }
    //Metodo para obtener el MostrarGrafo ya que es un atributo privado
   public static void openDefinirRango(){
       getDefinirRango().setVisible(true);
       getMenuPrincipal().setVisible(false);
       
   }
   
   public static void VolverMenu(){
       //Muestro solamente el menu principal
        getMenuPrincipal().setVisible(true);
        //Logrando que las ventanas abiertas ya no se muestren
        getCargarJson().setVisible(false);
        getAgregarSucursal().setVisible(false);
        getEliminarSucursal().setVisible(false);
        getGuardarCambios().setVisible(false);
        getMostrarGrafo().setVisible(false);
        getDefinirRango().setVisible(false);
        
   }
   

}
