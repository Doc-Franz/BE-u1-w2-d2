package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rubrica {
    public Rubrica() {
    }

    Scanner sc = new Scanner(System.in);
    String rispostaUtente;

    ;

    public Map<String, Object> inserisciContatto() {
        String nomeContatto;
        int telefonoContatto;
        boolean nuovoContatto = true;
        Map<String, Object> rubricaTelefonica = new HashMap<>();
        while (nuovoContatto) {
            System.out.print("Vuoi inserire un contatto? Digita 1 per il sì e 0 per il no: ");
            rispostaUtente = sc.nextLine();
            if (rispostaUtente.equals("1")) {
                System.out.print("Inserire il nome del nuovo contatto: ");
                nomeContatto = sc.nextLine();
                System.out.print("Inserire il numero di telefono: ");
                telefonoContatto = Integer.parseInt(sc.nextLine());
                rubricaTelefonica.put(nomeContatto, telefonoContatto);
            } else {
                nuovoContatto = false;
            }
        }
        System.out.println("Numeri in rubrica inseriti correttamente");
        System.out.println("Rubrica: " + rubricaTelefonica.toString());
        return rubricaTelefonica;

    }

    public Map<String, Object> cancellaContatto(Map<String, Object> r) {
        boolean continuaAdEliminare = true;
        String contattoDaEliminare;
        while (continuaAdEliminare) {
            System.out.print("Vuoi eliminare un contatto in rubrica? Digita 1 per eliminare oppure 0 se non vuoi eliminare nulla: ");
            rispostaUtente = sc.nextLine();
            if (rispostaUtente.equals("1")) {
                System.out.print("Inserisci il nome del contatto da eliminare: ");
                contattoDaEliminare = sc.nextLine();
                r.remove(contattoDaEliminare);
            } else {
                continuaAdEliminare = false;
            }

        }
        System.out.println("La rubrica aggiornata è: " + r.toString());
        return r;

    }

    public void ricercaContatto(Map<String, Object> r) {
        System.out.print("Che contatto vuoi cercare? ");
        String numeroRicercato = sc.nextLine();
        String nomeRicercato = null;
        for (String key : r.keySet()) {
            if (key.equals(numeroRicercato)) {
                nomeRicercato =key;
                break;

            }
        }
        if (nomeRicercato != null) {
            Object numeroAssociato = r.get(numeroRicercato);
            System.out.println("Il contatto cercato è " + nomeRicercato + " e il numero è " + numeroAssociato);
        } else {
            System.out.println("Contatto non trovato...");
        }

    }

}

