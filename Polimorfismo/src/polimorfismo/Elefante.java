/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author giova
 */
public class Elefante extends Mamifero {
    
    // polimorfismo sobrescrever o valor no método já criado NA CLASSE MAMIFERO
    @Override
    public double cotaDiariaLeite() {
        return 30.0;
    }
    
    
}
