/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beta.pkg0.pkg0;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Beta00 {

    /**
     * @param args the command line argumegnts
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        String pass;
        System.out.println("INGRESE SU NOMBRE:");
        String nombre= scan.nextLine();
        System.out.println("INGRESE EL APELLIDO");
        String apellido=scan.nextLine();
        System.out.println("INGRESE SU EDAD:");
        int edad=scan.nextInt();
        scan.nextLine();
        Bison paciente0=new Bison(nombre, apellido, edad);
          System.out.println("Cree su Contraseña");
        pass=scan.nextLine();
        
        System.out.print("¿QUE TIPO DE USUARIO ES?");
        System.out.println(" 1:Cliente, 2: Empleado");
        int tipoUsu= scan.nextInt();
        System.out.println("Cree un nombre de Usuario");
        String usern= scan.nextLine();
        scan.nextLine();
       
        if(tipoUsu==1){
             Users paciente0usu= new Users();
                paciente0usu.setUser_name(usern);
                paciente0usu.setPassword(pass);
                Cliente paciente0client= new Cliente();
                paciente0usu.setTipousu(paciente0client);
                System.out.println(paciente0);
                System.out.println(paciente0usu);
                System.out.print("tipp de usuario: "+paciente0client.registrarUsuario());
        }else if(tipoUsu==2){
             Users paciente0usu= new Users();
                paciente0usu.setUser_name(usern);
                paciente0usu.setPassword(pass);
                Empleado paciente0worker= new Empleado();
                paciente0usu.setTipousu(paciente0worker);
                System.out.println(paciente0);
                System.out.println(paciente0usu);
                System.out.print("tipp de usuario: "+paciente0worker.registrarUsuario());
        }
        }
       
       
       //4 Cliente tipoalex=new Cliente();
       // paciente0usu.setTipousu(tipoalex);
        
    
        
    }
    

