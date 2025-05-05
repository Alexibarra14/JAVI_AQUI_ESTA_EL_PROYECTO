/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delivertry;

/**
 *
 * @author Javis
 */
public final class Usuarios extends Personas{
    private String user_name;
     private String password;
     private typeusu tipousu;
     
        public Usuarios() {
         this.user_name = "";
         this.password = "INGRESE AQUI SU PASSWORD";
         this.tipousu= new typeusu();
         
     }
     
     public Usuarios(String user_name, String password, String name, String l_name, int age) {
      super(name, l_name, age);
         this.user_name = user_name;
         this.password = password;
         
      
                 
         
     }
     
 
     public String getUser_name() {
         return user_name;
     }
 
     public void setUser_name(String user_name) {
         this.user_name = user_name;
     }
 
     public String getPassword() {
         return password;
     }
 
     public void setPassword(String password) {
         this.password = password;
     }
 
     public typeusu getTipousu() {
         return tipousu;
     }
 
     public void setTipousu(typeusu tipousu) {
         this.tipousu = tipousu;
     }
     
     @Override
     public String toString(){
         return "Nombre: "+getName()+"\n"+
                 "Apellidos: "+getL_name()+"\n"+
                 "Nombre de Usuario: "+user_name
                 ;
     }
 

}
