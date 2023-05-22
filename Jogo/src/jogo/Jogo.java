/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Jogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciando os jogadores
        jogador jo = new jogador();
        jogador1 jo1 = new jogador1();
        
        JOptionPane.showConfirmDialog(null, "Vai começar a grande luta, coloque o nome dos lutadores:");
        
        jo.setNomeJogador(JOptionPane.showInputDialog("Digite o nome do lutador numero 1: "));
     //   jo.setIdadeJogador(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        
        jo1.setNomeJogador(JOptionPane.showInputDialog("Digite o nome do lutador número 2: "));
     //   jo1.setIdadeJogador(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        
        JOptionPane.showMessageDialog(null, "Aqui está nome dos nossos lutadores:"
                +jo.getNomeJogador()+ " , tem: "+jo.getIdadeJogador()+ " anos."
                + " E o segundo lutador é o: "+jo1.getNomeJogador()+
                " que tem a idade de: "+jo1.getIdadeJogador()+" anos.");
                
        // Primeiro round da luta
        JOptionPane.showMessageDialog(null, "Primeiro Round, "
                +jo.getNomeJogador()+" pode dá o primeiro golpe!"
                + "Escolha a força do golpe de acordo com o número:");
        
        int golpe = Integer.parseInt(JOptionPane.showInputDialog("Número 1, Número 2, Número 3"));
        
        if (golpe ==1){
            JOptionPane.showMessageDialog(null, "Você acertou um golpe muito forte !!");
        } else if (golpe == 2){
           JOptionPane.showMessageDialog(null, "Você acertou um golpe muito fraco !!"); 
        }else if(golpe ==3){
            JOptionPane.showMessageDialog(null, "Você acertou um golpe médio !!");
        } else {
            JOptionPane.showMessageDialog(null, "Você digitou algo errado !");
        }
        
        switch (golpe) {
            case 1:
                JOptionPane.showMessageDialog(null,
                 "Seu golpe tirou 40% da vida do: "+jo1.getNomeJogador());
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                 "Seu golpe tirou 5% da vida do: "+jo1.getNomeJogador());
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                 "Seu golpe tirou 20% da vida do: "+jo1.getNomeJogador());
                break;
            default:
                throw new AssertionError();
        }
        
        JOptionPane.showMessageDialog(null,
            "Agora é a vez do lutador "+jo1.getNomeJogador()+" , se segura que lá vem o golpe!!");
        
        if (golpe ==1){
            JOptionPane.showMessageDialog(null, "Você tomou um golpe médio !!");
        } else if (golpe == 2){
           JOptionPane.showMessageDialog(null, "Você tomou um golpe muito forte !!"); 
        }else if(golpe ==3){
            JOptionPane.showMessageDialog(null, "Você tomou um golpe muito fraco!!");
        } else {
            JOptionPane.showMessageDialog(null, "Você digitou algo errado !");
        }
        
        switch (golpe) {
            case 1:
                JOptionPane.showMessageDialog(null,
                 "Você tomou um golpe que tirou 20% da sua vida.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                 "Você tomou um golpe que tirou 40% da sua vida.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                 "Você tomou um golpe que tirou 5% da sua vida.");
                break;
            default:
                throw new AssertionError();
        }
        
 ///////////////////////////////////////////////////////////////////////////////       
        // Segundo round da luta
        JOptionPane.showMessageDialog(null, "Segundo Round, "
                +jo1.getNomeJogador()+" agora quem começa dando o primeiro golpe!"
                + "Escolha a força do golpe de acordo com o número:");
        
        int golpe1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1, Número 2, Número 3"));
        
        if (golpe1 ==2){
            JOptionPane.showMessageDialog(null, "Você acertou um golpe muito forte !!");
        } else if (golpe1 == 1){
           JOptionPane.showMessageDialog(null, "Você acertou um golpe muito fraco !!"); 
        }else if(golpe1 ==3){
            JOptionPane.showMessageDialog(null, "Você acertou um golpe médio !!");
        } else {
            JOptionPane.showMessageDialog(null, "Você digitou algo errado !");
        }
        
        switch (golpe1) {
            case 1:
                JOptionPane.showMessageDialog(null,
                 "Seu golpe tirou 40% da vida do: "+jo.getNomeJogador());
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                 "Seu golpe tirou 5% da vida do: "+jo.getNomeJogador());
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                 "Seu golpe tirou 20% da vida do: "+jo.getNomeJogador());
                break;
            default:
                throw new AssertionError();
        }
        
        JOptionPane.showMessageDialog(null,
            "Agora é a vez do lutador "+jo.getNomeJogador()+" , se segura que lá vem o golpe!!");
        
        if (golpe1 ==2){
            JOptionPane.showMessageDialog(null, "Você tomou um golpe médio !!");
        } else if (golpe1 == 1){
           JOptionPane.showMessageDialog(null, "Você tomou um golpe muito forte !!"); 
        }else if(golpe1 ==3){
            JOptionPane.showMessageDialog(null, "Você tomou um golpe muito fraco!!");
        } else {
            JOptionPane.showMessageDialog(null, "Você digitou algo errado !");
        }
        
        switch (golpe1) {
            case 1:
                JOptionPane.showMessageDialog(null,
                 "Você tomou um golpe que tirou 20% da sua vida.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                 "Você tomou um golpe que tirou 40% da sua vida.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                 "Você tomou um golpe que tirou 5% da sua vida.");
                break;
            default:
                throw new AssertionError();
        }
        
        ///////////////////////////////////////////////////////////////////////////////       
        // Terceiro round da luta
        JOptionPane.showMessageDialog(null, "Terceiro Round, "
                +jo.getNomeJogador()+" começa dando o primeiro golpe!"
                + "Escolha a força do golpe de acordo com o número:");
        
        int golpe2 = Integer.parseInt(JOptionPane.showInputDialog("Número 1, Número 2, Número 3"));
        
        if ( golpe2 ==2){
            JOptionPane.showMessageDialog(null, "Você acertou um golpe muito forte !!");
        } else if (golpe2 == 1){
           JOptionPane.showMessageDialog(null, "Você acertou um golpe muito fraco !!"); 
        }else if(golpe2 ==3){
            JOptionPane.showMessageDialog(null, "Você acertou um golpe médio !!");
        } else {
            JOptionPane.showMessageDialog(null, "Você digitou algo errado !");
        }
        
        switch (golpe2) {
            case 2:
                JOptionPane.showMessageDialog(null,
                 "Seu golpe tirou 40% da vida do: "+jo1.getNomeJogador());
                break;
            case 1:
                JOptionPane.showMessageDialog(null,
                 "Seu golpe tirou 5% da vida do: "+jo1.getNomeJogador());
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                 "Seu golpe tirou 20% da vida do: "+jo1.getNomeJogador());
                break;
            default:
                throw new AssertionError();
        }
        
        JOptionPane.showMessageDialog(null,
            "Agora é a vez do lutador "+jo1.getNomeJogador()+" , se segura que lá vem o golpe!!");
        
        if (golpe2 ==2){
            JOptionPane.showMessageDialog(null, "Você tomou um golpe médio !!");
        } else if (golpe2 == 1){
           JOptionPane.showMessageDialog(null, "Você tomou um golpe muito forte !!"); 
        }else if(golpe2 ==3){
            JOptionPane.showMessageDialog(null, "Você tomou um golpe muito fraco!!");
        } else {
            JOptionPane.showMessageDialog(null, "Você digitou algo errado !");
        }
        
        switch (golpe2) {
            case 2:
                JOptionPane.showMessageDialog(null,
                 "Você tomou um golpe que tirou 20% da sua vida.");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,
                 "Você tomou um golpe que tirou 40% da sua vida.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                 "Você tomou um golpe que tirou 5% da sua vida.");
                break;
            default:
                throw new AssertionError();
        }
        // jo.
        if((golpe == 1) && (golpe2 == 2)){
            JOptionPane.showMessageDialog(null,
                 jo.getNomeJogador()+" deu um golpe especial, que derrubou o "+jo1.getNomeJogador());
        } else if ((golpe == 2) && (golpe2 == 1) ){
            JOptionPane.showMessageDialog(null,
                 jo1.getNomeJogador()+" deu um golpe especial, que derrubou o "+jo.getNomeJogador());
        } else {
            JOptionPane.showMessageDialog(null," Deu empate !!");
        }
            
        
        
        
        
    }
    
}
