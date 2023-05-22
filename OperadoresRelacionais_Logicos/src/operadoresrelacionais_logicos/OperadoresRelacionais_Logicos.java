
package operadoresrelacionais_logicos;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class OperadoresRelacionais_Logicos {

    /**
     * maior que => " > "
     * maior ou igual => " >= "
     * menor que => " < "
     * menor ou igual => " <= "
     * diferente =>  " != "
     * igual => " == "
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 0PERADORES RELACIONAIS
        
        // variáveis
        int num1;
        int num2;
        
        // pegar dados do usuário
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A :"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número B :"));
        
        // testando uma igualdade
        if(num1 == num2){
            System.out.println(" O número A => "+num1+" é Igual ao número B => "+num2+" !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" é Igual ao número B => "+num2+" !");
        } else {
            System.out.println(" O número A => "+num1+" não é Igual ao número B => "+num2+" !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" não é Igual ao número B => "+num2+" !");
        }
        System.out.println("===================================================");
        
        // testando uma desigualdade
        if(num1 != num2){
            System.out.println(" O número A => "+num1+" é Diferente do número B => "+num2+ " !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" é Diferente do número B => "+num2+" !");
        } else {
            System.out.println(" O número A => "+num1+"  não é Diferente do número B => "+num2+ " !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" não é diferente do número B => "+num2+" !");
        }
        System.out.println("===================================================");
        // testando se o "num1" é maior que "num2"
        if(num1 > num2){
            System.out.println(" O número A => "+num1+" é Maior que o número B => "+num2+ " !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" é Maior que o número B => "+num2+" !");
        } else {
            System.out.println(" O número A => "+num1+" não é Maior que número B => "+num2+ " !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" não é maior que número B => "+num2+" !");
        }
        System.out.println("===================================================");
        
        // testando se o "num1" é menor que "num2"
        if(num1 < num2){
            System.out.println(" O número A => "+num1+" é Menor que o número B => "+num2+ " !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" é menor que o número B => "+num2+" !");
        } else {
            System.out.println(" O número A => "+num1+" não é maior que o número B => "+num2+"!");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" não é maior que o número B => "+num2+" !");
        }
        System.out.println("===================================================");
        
        // testando se o "num1" é maior ou igual a "num2"
        if(num1 >= num2){
            System.out.println(" O número A => "+num1+" é Maior ou Igual ao número B => "+num2+ " !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" é maior ou igual ao número B => "+num2+" !");
        } else {
            System.out.println(" O número A => "+num1+" não é Maior ou Igual ao número B => "+num2+ " !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" não é maior ou igual ao número B => "+num2+" !");
        }
        System.out.println("===================================================");
        
        // testando se o "num1" é menor ou igual a "num2"
        if(num1 <= num2){
            System.out.println(" O número A => "+num1+" é Menor ou Igual ao número B => "+num2+ " !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" é menor ou igual ao número B => "+num2+" !");
        } else {
            System.out.println(" O número A => "+num1+"não é Menor ou Igual ao número B => "+num2+ " !");
            JOptionPane.showMessageDialog(null, " O número A => "+num1+" não é menor ou igual ao número B => "
                    + ""+num2+" !");
        }
        System.out.println("===================================================");
    }
    
}
