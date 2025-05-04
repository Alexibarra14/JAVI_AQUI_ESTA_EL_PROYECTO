/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beta.pkg0.pkg0;

/**
 *
 * @author Ivan
 */
public class Users extends Bison{
    private String user_name;
    private String password;
    private typeusu tipousu;
    
    public Users(String user_name, String password, Cliente tipousu) {
        this.user_name = user_name;
        this.password = password;
        this.tipousu=tipousu;
        
    }


    public Users() {
        this.user_name = "";
        this.password = "";
        this.tipousu= new typeusu();
        
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
       return "Usuario: "+user_name
               + "\n"+ 
               typeusu.type() + "\n";
            
       
    }
   
}
