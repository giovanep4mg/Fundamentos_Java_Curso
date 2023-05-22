/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposdedados;

import javax.swing.JOptionPane;

/**
 * Esses tipos de dados são mais usados no Java.
 * ( int, float, double, char, String );
 * @author giova
 */
public class TiposDeDados {

    public static void main(String[] args) {
        // demostração de alguns tipos de dados
        int numero;
        float decimalCurto;
        double decimalLongo ;
        char caracter;
        String cadeiaCaracteres ;
        boolean ativado;
        
        // variáveis separadas pelos seu tipo e inicializadas.
        numero = 12;
        // usa o ponto ( . ) para separar números decimais
        decimalCurto = 12.34f;
        decimalLongo = 12.34443;
        // para não dá erro, tem que usar aspas simples não dupla.
        caracter = 'a';
        cadeiaCaracteres = " **Meu curso de Java Fundamentos** "; 
        ativado = true;
        
        System.out.println(" O valor da variável número é : "+numero);
        
        System.out.println(" O valor da variável decimal curto é : "+decimalCurto);
        
        System.out.println(" O valor da variável decimalLongo é : "+decimalLongo);
        
        System.out.println(" O valor da variável caracter é : "+caracter);
        
        System.out.println(" O valor da variável cadeia caracteres é : "+cadeiaCaracteres);
        
        System.out.println(" O valor da variável ativado é : "+ativado);
        
        
        
    }
    
}
