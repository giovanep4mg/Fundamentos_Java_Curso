/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciousandocondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class ExercicioUsandoCondicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variáveis
        String nome;
        int num;
        int num1;
        
        // pegar dados do usuário
        nome = JOptionPane.showInputDialog("Digite seu nome:");
       
System.out.println("============ Condicionais Exemplos =======================");   

        // condicional usando o if e else
        if (nome == ""){
            System.out.println("A variável nome está vazio, nome => "+nome);
            JOptionPane.showMessageDialog(null, "A variável nome não foi preenchida!");
            num = 1 ;
        } else {
            System.out.println("A variável nome foi preenchida, nome =>"+nome);
            JOptionPane.showMessageDialog(null, "A variável nome foi preenchida => "+nome);
            num = 10;
        }
System.out.println("=======================================================");        
        // condicional usando o switch
        switch (num) {
            case 1:
                System.out.println("SWITCH => O nome está null."+nome);
                JOptionPane.showMessageDialog(null, "SWITCH => Caso 1, variável nome não foi preenchida!");
                break;
            case 10:
                System.out.println("SWITCH => O nome está preenchido."+nome);
                JOptionPane.showMessageDialog(null, "SWITCH => Caso 2, variável nome foi preenchida!");
                break;
            default:
                throw new AssertionError();
        }
System.out.println("======================================================="); 

        // condicional operadores lógicos
        if ((nome == "giovani") && (num == 10)){
            System.out.println("O nome foi preenchido corretamente, nome =>"+nome);
            JOptionPane.showMessageDialog(null, "A variável nome foi preenchida corretamente!");
        } else if ((nome == null) || (num == 1)){
            System.out.println("A variável nome não foi preenchida!");
            JOptionPane.showMessageDialog(null, "A variável nome não foi preenchida!");
        } else {
            System.out.println("O nome foi preenchido, mas não é Giovani");
            JOptionPane.showMessageDialog(null, "O nome foi preenchido, mas não é Giovani!");
        }
System.out.println("=======================================================");         
        
    }
    
}
