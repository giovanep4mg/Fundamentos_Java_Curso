/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laçosrepeticaowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class LaçosRepeticaoWHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        int qtasVezes = 1;// vai iniciar aparti do 1
        int num;
        
        //pegar dados do usuário
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos vezes deseja que seja repetido:"));
        
        //laço[
        while(qtasVezes <= num){
            System.out.println("Estou fazendo a "+qtasVezes+" vezes.");
            qtasVezes++; // qtasVezes + 1 
        }
        System.out.println("Sai do laço e executei "+qtasVezes);
        
System.out.println("=======================================================");        
    }

}
