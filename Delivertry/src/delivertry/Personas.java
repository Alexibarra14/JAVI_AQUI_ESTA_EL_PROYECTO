/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delivertry;

/**
 *
 * @author Javis
 */
public class Personas {
    private String name;//declaramos el nombre del usuario.
     private String l_name;//declaramos los apellidos del usuario.
     private int age;//declaramos la edad del usuario.
   
     
 
     public Personas (String name, String l_name, int age){
         this.name = name;
         this.l_name = l_name;
         this.age = age;
 
        
     }
 
     public Personas() {
          this.name = "INGRESA TU NOMBRE AQUI";
         this.l_name = "INGRESA TUS APELLIDOS AQUI";
         this.age = 0;
        
     }
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
 
     public String getL_name() {
         return l_name;
     }
 
     public void setL_name(String l_name) {
         this.l_name = l_name;
     }
 
     public int getAge() {
         return age;
     }
 
     public void setAge(int age) {
         this.age = age;
     }
     @Override  
     public String toString(){
         return "Nombre: "+ name+"\n"
                 + "Apellido: "+ l_name+"\n"+
                 "EDAD: "+age;
                 
     }
}
