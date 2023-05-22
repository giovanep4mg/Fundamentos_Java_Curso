
package incrementacao_e_decrementacao;

public class Incrementacao_e_Decrementacao {

    /**
     * Incrementar => vai adicionar mais coisas até chegar no " num1++ "
     * Decrementar => vai tirar mais coisas até chegar a " num2-- "
     * @param args
     */
    public static void main(String[] args) {
        // INCREMENTAR
        int num1 = 1;
        while(num1 <= 10){
            System.out.println(num1);
            num1++;
        }
        
        System.out.println("===============================================");
        
        // DECREMENTAÇÃO
        int num2 = 10;
        while(num2 > 0){
            System.out.println(num2);
            num2--;
        }
        
        System.out.println("===============================================");
       
    }
    
}
