/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meuprimeiroprojeto;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class MeuPrimeiroProjeto {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Bem vindo, ao primeiro programa em java.");
        
        int numero = 10;
        String resultado = "";
        
        if(numero >= 10 ){
            resultado = "positivo";
        }else {
            resultado = "negativo";
        }
        
        System.out.println(" O resultado é : "+resultado);
    }
    
}
