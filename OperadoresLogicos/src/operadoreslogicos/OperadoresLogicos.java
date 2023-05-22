/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class OperadoresLogicos {

    /** 
     *  && => significa => " e " , AND
     *  || => significa => " ou ", OR
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis jeito de ser feito
        int num1 = 10 ;
        int num2 = 5 ;
        int num3 = 20, num4 = 5;
        
        // vai fazer duas verificação, tem que dá as duas opções certa para acionar a "Primeira".
        if((num1 > num3) && (num2 == num4)){
            System.out.println("Primeira opção escolhida, só se as duas verificações derem certo.");
            JOptionPane.showMessageDialog(null, "Primeira opção escolhida, só se as duas verificações derem certo.");
        } else {
            System.out.println("Segunda opção escolhida, nenhuma verificação foi aceita.");
            JOptionPane.showMessageDialog(null, "Segunda opção escolhida, nenhuma verificação foi aceita.");
        }
System.out.println("======================================================");
        
        // vai fazer duas verificações, usando o "or" se dê alguma certo já vai ser a primeira opção.
        if( (num2 == num4) || (num1 > num3) ){
        System.out.println("Primeira opção escolhida, alguma verificação deu certo.");
        JOptionPane.showMessageDialog(null, "Primeira opção escolhida, alguma verificação deu certo.");
    }else{
        System.out.println("Segunda verificação, nenhuma verificação deu certo.");
        JOptionPane.showMessageDialog(null, "Segunda verificação, nenhuma verificação deu certo.");
        
    }
System.out.println("========================================================");

        // para saber se é um triângulo ou não
        // variáveis
        int lado1;
        int lado2;
        int lado3;
        
        // pegar dados do usuário
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do lado 1:"));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do lado 2:"));
        lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do lado 3:"));
        
        // fazer a verificação se é triângulo ou outra coisa
        if((lado1 == lado2) && (lado2 == lado3) && (lado3 == lado1)){
            JOptionPane.showMessageDialog(null, "É um triângulo => equilátero! ");
        } else if ((lado1 == lado2) && (lado3 != lado1) && (lado3 != lado2)) {
            JOptionPane.showMessageDialog(null, "É um triângulo => isósceles");
        } else {
            JOptionPane.showMessageDialog(null, "É um triângulo => escaleno");
        }
System.out.println("========================================================");
       
        
        
    }
    
}
