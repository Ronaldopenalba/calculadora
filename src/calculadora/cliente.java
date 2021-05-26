/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.net.InetAddress;

/**
 *
 * @author ronaltecno
 */
public class cliente {
            
    
    
     public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        try{
        
        Registry miRegistro = LocateRegistry.getRegistry("localhost", 1099);
        calculadora c= (calculadora)Naming.lookup("//localhost/calculadora");
        
        while(true){
        
        String menu = JOptionPane.showInputDialog("Calculadora\n"
                + "suma..(1)\n"
                + "Resta..(2)\n"
                + "multiplicacion..(3)\n"
                + "divicion...(4)\n"
                + "salir...(5)\n");
        switch(menu){
        
            case "1":{
                    int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese en primer numero"));
                    int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese en primer numero")); 
                           
                    JOptionPane.showMessageDialog(null, "La suma es:  " +c.sum(x, y));
                            break;
            }
              case "2":{
                    int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese en primer numero"));
                    int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese en primer numero")); 
                           
                    JOptionPane.showMessageDialog(null, "La resta es:  " +c.res(x, y));
                            break;
              }    
             case "3":{
                           
             int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese en primer numero"));
                    int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese en primer numero")); 
                           
                    JOptionPane.showMessageDialog(null, "La multiplicacion es:  " +c.mul(x, y));
                       
                    break;
             }
             case "4":{
                    int x = Integer.parseInt(JOptionPane.showInputDialog("ingrese en primer numero"));
                    int y = Integer.parseInt(JOptionPane.showInputDialog("ingrese en primer numero")); 
                           
                    JOptionPane.showMessageDialog(null, "La divicion"+c.div(x,y));
                            break;
               }
             case "5":
                 System.exit(0);
            }
        
           }
        
        }catch(Exception ex){
            
         JOptionPane.showMessageDialog(null, "servidor no conectado" + ex);
        
        }
    
    
    
    
    }
}
