/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancia o objeto Elefante
        Mamifero mamifero1 = new Elefante();
        
        // exibir, chama o método "cotaDiariaLeite" que está na classe "mamifero"
        //  mas foi reaproveitado na classe "Elefante".
        System.out.println("A cota diária de leite do Elefante é: "
                +mamifero1.cotaDiariaLeite()+ " litros.");
        
        // exibir uma caixa de mensagem 
        JOptionPane.showMessageDialog(null,
              "A cota diária de leite do Elefante é "+mamifero1.cotaDiariaLeite()+" litros.");
        
        // instancia o objeto Elefante
        Mamifero mamifero2 = new Rato();
        
        // exibir, chama o método "cotaDiariaLeite" que está na classe "mamifero"
        //  mas foi reaproveitado na classe "Elefante".
        System.out.println("A cota diária de leite do Rato é: "
                +mamifero2.cotaDiariaLeite()+ " litros.");
        
        // exibir uma caixa de mensagem 
        JOptionPane.showMessageDialog(null,
              "A cota diária de leite do Rato é "+mamifero2.cotaDiariaLeite()+" litros.");
        
        
    }
    
}
