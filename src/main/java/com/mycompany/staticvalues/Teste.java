/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.staticvalues;

/**
 *
 * @author khali
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User us=new User("teste", "teste");
        System.out.println(us.id);
        User us2=new User("teste2", "teste2");
        
        System.out.println(us2.id);
        UserStatic uss=new UserStatic("teste3", "test3");
         System.out.println("affichage static1 id="+UserStatic.id);
         
         UserStatic uss2=new UserStatic();
         System.out.println("affichage static2 id="+UserStatic.id);
         UserStatic.id++;
         System.out.println("Appel directe id= "+UserStatic.id);


        
    }
    
}
