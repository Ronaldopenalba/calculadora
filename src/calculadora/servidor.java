/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.InetAddress;
/**
 *
 * @author ronaltecno
 */import java.rmi.registry.Registry;
   import javax.swing.JOptionPane;

public class servidor {
    public static void main(String[] args)
    {
        try{
                String ipadd = (InetAddress.getLocalHost()).toString();
                Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
                            r.rebind("calculadora", new rmi());
                            JOptionPane.showMessageDialog(null, "servidor esta conectado " +ipadd);
                            
        
        
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null," servciodor no esta conectado"+  ex);
        
        }
    
    }
}

    

