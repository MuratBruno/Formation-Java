/*                                                  JEU DU PLUS OU MOIN
                                                 
													@author= Samy Chaabi

*/

package jeuplusoumoins;

// Importation des classes Scanner et Random 

import java.util.Scanner;
import java.util.Random;


// Définition de la classe PlusOuMoins
 
public class PlusOuMoins {
	
    static public void main(String[] args) {
    	
// Affect variable sc pour entrée clavier
        
    Scanner sc = new Scanner(System.in);
    
// Affect variable name et retry
    
    String name = null;
    int retry = 1;
    
// Utilisation de la methode println pour écrire les règles du jeu
 
    System.out.println("Bienvenue dans le Jeu du Plus ou du Moins");
    System.out.println("Le but du jeu est de trouver le nombre mystere entre 0 et 100 avec le moins d'essais possibles !");

    
// Demande du nom au joueur et affectation dans la variable name
    
    System.out.println("Veuillez entrez votre nom pour commencer : ");
    name = sc.nextLine();
    

// Début de la boucle do while permettant de définir les conditions de victoire et de répétitions en cas d'erreur    
    
    do {
    	
// Init nouvel objet Random
        
        Random rand = new Random();
        
// Affect variable NbRand
        
        int NbRand = rand.nextInt(101);
    	
        int nb=0,essais=0;

// Debut de boucle do while pour le retry
        
    	do {
    	
// Demande du chiffre et affectation dans variable nb
    	
        System.out.println("Veuillez entrer un nombre...");     
        nb = sc.nextInt();
        essais++;
        
// Conditions de victoire ou de répétitions
        

        if (nb<NbRand)
            {
            System.out.println("C est plus, recommence encore !!! ");
            }
        else if (nb>NbRand)
            {
            System.out.println("C est moins, recommence encore !!!");
            }
        else
            {
            System.out.println("Tu as trouvé en " + essais + " essais ! Bravo et bien joué " + name + " !!!");
            }
        
    	
// Validation de la boucle ou pas en vérifiant si nb est différent de NbRand  
    
    }while(nb!=NbRand);
 
// Demande si retry        
    
    System.out.println("Voulez vous recommencer (0 = non / 1 = oui) ?"); 
    
    retry = sc.nextInt();
    
     
// Boucle pour recommencer le jeu si O en bas 
    
    	}while (retry == 1);
    } 
}
// FIN DU JEU