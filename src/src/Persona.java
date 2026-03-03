/*
programa: Persona.java
Enunciado: 
Programador: Juarez Maga�a jose david.
Fecha: 23/02/21
*/
package src;
public class Persona {
   private String nombre;
   private String domicilio;
   private String telefono;
   
   public Persona (){
   }
   
   public Persona (String nombre, String domicilio, String telefono){
      this.nombre = nombre;
      this.domicilio = domicilio;
      this.telefono = telefono;
   }
   
   public String getTelefono(){
      return telefono;
   }
   
   public void setTelefono(String telefono){
      this.telefono = telefono;
   }
   
   public String getNombre() {
      return nombre;
   }
   
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   
   public String getDomicilio() {
      return domicilio;
   }
   public void setDomicilio(String domicilio){
      this.domicilio = domicilio;
   }
}