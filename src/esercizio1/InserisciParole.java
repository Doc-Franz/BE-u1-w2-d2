package esercizio1;

import java.util.*;

public class InserisciParole {
    public InserisciParole(){
    }

    public void inserisciNuovaParola(){
        Scanner sc = new Scanner(System.in);
        String nuovaParola;
        Set<String> setParole = new HashSet<String>();
        List<String> paroleDuplicate = new ArrayList<String>();
        System.out.print("Quante parole nuove vuoi inserire? ");
        int numeroParole = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numeroParole; i++){
            System.out.print("Inserisci la parola: ");
            nuovaParola = sc.nextLine();
            if (setParole.contains(nuovaParola)){
                paroleDuplicate.add(nuovaParola);
            } else{
                setParole.add(nuovaParola);
            }
        }
        if (paroleDuplicate.toArray().length > 0){
            System.out.println("Le parole duplicate sono:");
            for (int i = 0; i < paroleDuplicate.toArray().length; i++){
                System.out.println(paroleDuplicate.get(i));
            }
        } else {
            System.out.println("Non ci sono parole duplicate");
        }

        System.out.println("Il numero di parole distinte è " + setParole.toArray().length);
        System.out.println("Le parole distine sono:");
        for (int i = 0; i < setParole.toArray().length; i++){
            System.out.println(setParole.toArray()[i]);
        }
    }
}
