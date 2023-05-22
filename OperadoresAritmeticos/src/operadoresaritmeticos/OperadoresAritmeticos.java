/*
 *Para fazer operações aritméticas:
 SOMA, SUBTRAÇÃO, DIVISÃO, MULTIPLICAÇÃO,PORCENTAGEM.  
 */
package operadoresaritmeticos;

import javax.swing.JOptionPane;

    public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        // quando a variável for do mesmo tipo pode usar uma vírgula para separar.
        // VARIÁVEIS
        int num1, num2, num3;
        
        // pega o valor digitado do usuário e salva na variável
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número A : "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número B : "));
        
        
        // SOMA
        num3= num1 + num2;
        // exibir na tela de forma simples
        System.out.println(" O resultado da SOMA de "+num1+" mais  "+num2+" é :"+num3);
        // exibi uma caixa de mensagem com  o valor da soma
        JOptionPane.showMessageDialog(null, "A soma dos números "+num1+" mais "+num2+" é : "+num3);
System.out.println("=======================================================");


        // SUBTRAÇÃO
        num3 = num1 - num2;
        // exibi na tela do programa simples
        System.out.println("O resultado da SUBTRAÇÃO de  "+num1+" menos o "+num2+" é :"+num3);
        // exibi uma caixa de mensagem com o texto
        JOptionPane.showMessageDialog(null, "O resultado da subtração de "+num1+" menos o "+num2+" é: "+num3);
System.out.println("=======================================================");   

        // DIVISÃO
        num3= num1 / num2;
        // exibir de maneira simples
        System.out.println("O resultado da DIVISÃO de "+num1+" por "+num2+" é :"+num3 );
        // exibir uma caixa de mensagem 
        JOptionPane.showMessageDialog(null, "O resultado da divisão de "+num1+" dividido por "+num2+" é: "+num3);
System.out.println("=======================================================");   


        // MULTIPLICAÇÃO
        num3= num1 * num2;
        // exibir na tela de maneira simples
        System.out.println("O resultado da MULTIPLICAÇÃO de  "+num1+" por "+num2+" é :"+num3);
        // exibir uma caixa de mensagem
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação de "+num1+" vezes o "+num2+" é: "+num3);
System.out.println("=======================================================");        
    }
    
}
