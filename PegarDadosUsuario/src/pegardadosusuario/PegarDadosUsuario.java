/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pegardadosusuario;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class PegarDadosUsuario {

    /**Para pegar dados do usuário, em forma de String.
     * 
     * Para pegar dados númericos tem que converter em PARSE.
     * ( integer.parseInt( *JOptionPane.showInputDialog( *mensagem) );
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIÁVEL
        int idade;
        String nome;
        float peso;
            
        // exibi uma caixa de texto, pedindo para colocar algo e salva na variável 
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        
        // para pegar dados que são números inteiros, usa o "Integer.parseInt( *aqui pede* )"
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade! "));
        
        // para pegar dados que são números decimais usa, "Float.parseFloat( *aqui pede* )"
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso:"));
        
        
        // para exibir na tela a idade digitada pelo usuário, de forma simples
        System.out.println("O nome da pessoa é: "+nome);
        System.out.println("A pessoa tem: "+idade+" anos.");
        System.out.println("O seu peso é: "+peso);
        
        
        // para exibir na tela em forma de uma caixinha de texto, janela
        JOptionPane.showMessageDialog(null, "O seu nome é:"+nome);
        JOptionPane.showMessageDialog(null, " A pessoa tem "+idade+" anos");
        JOptionPane.showMessageDialog(null, "O seu peso é: " +peso);
        
        
    }
    
}
