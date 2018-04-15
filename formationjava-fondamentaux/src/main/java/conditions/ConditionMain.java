/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conditions;

/**
 *
 * @author oandrade
 */
public class ConditionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean b = false;
        boolean c = true;
        if (b){
            System.out.println("B est vrai...");
        }else if(c){
            System.out.println("C est vrai...");
        }else{
            System.out.println("Tout est faux...");
        }
        
        //une condition ternaire pour trouver le max
        int n1 = 12;
        int n2 = 13;
        int max = (n1>n2)?n1:n2;
        System.out.println("Le max de n1 et n2 est : "+max);
        
    }
}
