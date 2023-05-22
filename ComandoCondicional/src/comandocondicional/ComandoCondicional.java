/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comandocondicional;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class ComandoCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
        
        
        // condicional
        if (num1 < num2){
            System.out.println("O número "+num1+" é menor que o número "+num2+" . ");
            JOptionPane.showMessageDialog(null, "O número "+num1+" é menor que o número "+num2+" .");
        }
        // outra condicional
        if (num1 > num2){
            System.out.println("O número "+num1+" é maior que o número "+num2+".");
            JOptionPane.showMessageDialog(null, "O número "+num1+" é maior que o número "+num2+" .");
        } else {
            System.out.println("O número "+num1+" é menor que o número "+num2+".");
            JOptionPane.showMessageDialog(null, "O número "+num1+" é menor que o número "+num2+" .");
        }
System.out.println("======================================================");
        // condicional 
        int prova;
        prova = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota que tirou na prova:"));
        
        if( prova <= 4){
            System.out.println("Você tirou 4 pontos ou menos");
            JOptionPane.showMessageDialog(null, "Você tirou 4 pontos ou menos");
        } else if (prova == 5) {
            System.out.println("Você tirou 5 pontos.");
            JOptionPane.showMessageDialog(null, "Você tirou  5pontos.");
        } else if (prova == 6){
            System.out.println("Você tirou 6 pontos.");
            JOptionPane.showMessageDialog(null, "Você tirou 6 pontos.");
        } else if (prova == 7){
            System.out.println("Você tirou 7 pontos.");
            JOptionPane.showMessageDialog(null, "Você tirou 7 pontos.");
        } else if (prova == 8){
            System.out.println("Você tirou 8 pontos.");
            JOptionPane.showMessageDialog(null, "Você tirou 8 pontos.");
        } else if (prova == 9){
            System.out.println("Você tirou 9 pontos.");
            JOptionPane.showMessageDialog(null, "Você tirou 9 pontos.");
        } else {
            System.out.println("Você tirou 10 pontos.");
            JOptionPane.showMessageDialog(null, "Você tirou 10 pontos.");
        }
System.out.println("======================================================");
        
    }
    
}
