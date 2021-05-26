/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author ronaltecno
 */
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;


public class rmi extends UnicastRemoteObject implements calculadora {
     public rmi () throws RemoteException{
         int a,b;
         
     } 
     @Override
     public int sum(int a, int b) throws RemoteException{
         return a +b;
         
     } 
     @Override
     public int res(int a, int b) throws RemoteException{
         return a - b;
         
     } 
     @Override
     public int mul(int a, int b) throws RemoteException{
         return a* b;
         
     } 
     public int div(int a , int b) throws RemoteException{
        if( a == 0 || b==0){
        
          JOptionPane.showMessageDialog(null, "servidor esta conectado ");
        }else{
           return a / b;
        }
         return 0;
     } 

     
}
