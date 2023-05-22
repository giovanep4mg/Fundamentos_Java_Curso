/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comandoescolhaswitch;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class ComandoEscolhaSwitch {

    /** Como se fosse um menu te dá somente algumas opções.
     * e você tem uma escolha "switch" entre algumas opções.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        int escolha;
        
        // para pegar o dados que o usuário digitar
        escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu, "
                + " Feijoada => 1,"
                + " Macarronada => 2,"
                + " Sopa => 3 "));
        
        // condicional SWITCH
        switch (escolha) {
            case 1:
                System.out.println("Feijoada");
                JOptionPane.showMessageDialog(null, "Sua escolha foi a número: "+escolha+" Feijoada");
                break;
            case 2:
                System.out.println("Macarronada");
                JOptionPane.showMessageDialog(null, "Sua escolha foi a número: "+escolha+" Macarronada.");
                break;
            case 3:
                System.out.println("Sopa");
                JOptionPane.showMessageDialog(null, "Sua escolha foi a número: "+escolha+" Sopa.");
                break;
            default:
        }
    }
    
}
