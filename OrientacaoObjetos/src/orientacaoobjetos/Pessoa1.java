/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
class Pessoa1 extends Pessoa {
    // atributos
    public String trabalho;
    public int salario;

    
    
    // métodos de acesso get e setters
    public void setSalario(int salario){
        this.salario = salario;
        
    }

    public int getSalario() {
        return salario;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public String getTrabalho() {
        return trabalho;
    }
    

    // método mostrar dados
    public void mostrarDados1() {
        
        // vai exibir os dados digitados pelo usuário
        JOptionPane.showMessageDialog(null, "Nome: "+nomePessoa);
        JOptionPane.showMessageDialog(null, "Idade: "+idadePessoa);
        JOptionPane.showMessageDialog(null, "Trabalho: "+trabalho);
        JOptionPane.showMessageDialog(null, "Salário: "+salario);
    }

    
    
    
}
