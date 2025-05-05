/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package delivertry;

import java.util.Scanner;

/**
 *
 * @author Javis
 */
public class Delivertry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner cap=new Scanner(System.in);
       
        
        System.out.println("BIENVENIDO A BISONDELIVERY!!");
        System.out.println("`---------------------------");
        System.out.println("Ingrese su nombre: ");
        String nombre_completousu=cap.nextLine();
       
        System.out.println("Ingrese su Apellido: ");
        String last_n=cap.nextLine();
      
        System.out.println("Ingrese su edad: ");
        int age_usu=cap.nextInt();
        cap.nextLine();
      
        System.out.println("Crea un nombre de Usuario: ");
        String usu_name=cap.nextLine();
       cap.nextLine();
       
        
        System.out.println("Crea una llave unica: ");
        String pass=cap.nextLine();
         Usuarios Usu1= new Usuarios(usu_name, pass, nombre_completousu, last_n, age_usu);
     
        
        System.out.println("Ingrese para que quiere usar la aplicacion: ");
        System.out.println("1.-Consumir productos de la cafeteria.");
        System.out.println("2.-Trabjar como repartidor.");
        System.out.println("3.-Trabjar como Empleado de la Cafeteria.");
        int user_choose= cap.nextInt();
        if(user_choose==1){
            Cliente client1= new Cliente();
            System.out.println(Usu1);
      
           System.out.println("Tipo de usuario: "+client1.imprimirRegistro());
        
            
    }
        
    }
    
       
     
       
}
