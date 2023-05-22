/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacaoobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class OrientacaoObjetos {

    /** Pode aproveita os códigos, os objetos criados.
     * Conceito Classe => um objeto que tem informações, oque é, como é.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // encapsula => você cria os getters e setters para ter acesso as propriedades da classe
        
        // herança => quando uma classe herda algo de outra classe, tipo uma propriedade "nome"
        // você coloca só na Classe Principal, e depois nas outras não irá precisar.
        // se colocar assim => extendes em cima.
        
        
        /*
        
        // instancia um objeto, a classe Pessoa, para poder adicionar dados e pegar dados dela
        
        
        // instanciando a classe Pessoa
        Pessoa pes = new Pessoa();
        
        //pede ao usuário para digitar um nome e seta na variável nome na classe Pessoa
        pes.setNomePessoa(JOptionPane.showInputDialog("Digite o nome da pessoa:"));
        
        // pede ao usuário para digitar uma idade e seta na variável idade na classe Pessoa
        pes.setIdadePessoa(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:")));
        
        // chamar método mostrar dados, vai mostrar os dados digitados
       //  pes.mostrarDados();
        
        */
       
        
       // instanciando um objeto, classe Pessoa1
       Pessoa1 pes1 = new Pessoa1();
       
        // já estou passando os valores para a classe Pessoa1
        pes1.setNomePessoa("Gulherme");
        pes1.setIdadePessoa(23);
        pes1.setTrabalho("Professor");
        pes1.setSalario(2300);
        
        // chamar o método mostrar dados
        pes1.mostrarDados1();
        
        /*
        // exibi na tela o nome e idade adicionados pelo usuário e que está na classe Pessoa.
        JOptionPane.showMessageDialog(null, "O nome da pessoa é: "
                +pes.getNomePessoa()+ " e sua idade é : "+pes.getIdadePessoa());
        */
        
        
    }
    
}
