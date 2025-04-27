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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        Bison paciente0=new Bison();
        paciente0.setName("ALEX");       
        paciente0.setL_name("Ibarra");       
        paciente0.setAge(18);   
        Users paciente0usu= new Users();
        System.out.println("Cree su Contraseña");
        String pass;
        pass=scan.nextLine();
        paciente0usu.setPassword(pass);
       // Cliente tipoalex=new Cliente();
       // paciente0usu.setTipousu(tipoalex);
        System.out.println(paciente0);
        System.out.println(paciente0usu);
    
        
    }
    
}
