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
class Pessoa {
    // atributos
    public String nomePessoa;
    public int idadePessoa;

    
    
    // métodos de acesso get e setters
    public void setNomePessoa(String nomePessoa) {
        
        this.nomePessoa = nomePessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }
    
    // método mostrar dados
    public void mostrarDados(){
        // vai exibir os dados digitados pelo usuário
        JOptionPane.showMessageDialog(null, "Nome: "+nomePessoa);
        JOptionPane.showMessageDialog(null, "Idade: "+idadePessoa);
        
    }
    
    
}
