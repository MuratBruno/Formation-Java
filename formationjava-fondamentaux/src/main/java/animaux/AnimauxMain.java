/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

import java.util.*;

/**
 *
 * @author oandrade
 */
public class AnimauxMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //création d'un tableau de 4 animaux
        Animal[] animaux = new Animal[4];
        animaux[0]=new Chat(Sexe.FEMELLE);
        animaux[1]=new Chien(Sexe.MALE);
        animaux[2]=new Cochon(Sexe.FEMELLE);
        animaux[3]=new Escargot(Sexe.HERMAPHRODITE);
        
        System.out.println("Nombre d'animaux : "+Animal.getCount());
        
        
        try {
            System.out.println("Accès au 5 ième élément ...");
            Animal yenapas = animaux[4];
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            aioobe.printStackTrace();
            
            System.out.println("A bin oui c'est vrai ... il n'y a pas de 5 ième élément !");
        } catch (Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("finalement on passe toujours ici...");
        }
        
        CageGenerique<Chat> enclosDesChats = new CageGenerique<>();
        enclosDesChats.addAnimal(new Chat());
/*        
        for (Animal animal : animaux) {
            animal.crier();
            System.out.println(animal.getSexe().toString());
        }
        
        System.out.println("Test Array List");
        //Test de la ArrayList
        List<Animal> listeAnimaux = new ArrayList<>();
        listeAnimaux.addAll(Arrays.asList(animaux));
        Iterator<Animal> it = listeAnimaux.iterator();
        while (it.hasNext()) {
            Animal animal = it.next();
            animal.crier();
        }
        List l = new ArrayList();
        l.add(new Chat());
        Iterator it2 = l.iterator();
        while (it2.hasNext()) {
 //           Animal animal = it2.next();
            Object o = it2.next();
     
            Animal animal = null;
            if (o instanceof Animal){
                animal = (Animal)o;
                System.out.println("Pour Sylvain !");
                animal.crier();
            }
        }
        
        
        System.out.println("Test HashMap");*/
        
        Map<String,Animal> animauxHt = new HashMap<>();
        animauxHt.put("minet", new Chat());
        animauxHt.put("mitsy", new Chat(Sexe.FEMELLE));
        animauxHt.put("Slupy", new Escargot(Sexe.HERMAPHRODITE));
        animauxHt.put("Babe", new Cochon(Sexe.MALE));
        Set<String> set = animauxHt.keySet();
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()){
            animauxHt.get(it2.next()).crier();
        }
        for (Map.Entry<String, Animal> entry : animauxHt.entrySet()) {
            String string = entry.getKey();
            Animal animal = entry.getValue();
        }
        animauxHt.get("Babe").crier();
        
    }
}
