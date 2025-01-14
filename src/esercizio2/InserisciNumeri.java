package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InserisciNumeri {
    public InserisciNumeri(){};

    public List<Integer> inserisciNuoviNumeri(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire nella lista? ");
        int lunghezzaLista = Integer.parseInt(sc.nextLine());
        int numeroDaAggiungere;
        List<Integer> listaDiNumeri = new ArrayList<Integer>();
        for (int i = 0; i < lunghezzaLista; i++){
            numeroDaAggiungere = (int) Math.floor(Math.random() * 101);
            listaDiNumeri.add(numeroDaAggiungere);
        }
        System.out.println("La lista di numeri è " + listaDiNumeri.toString());
        return listaDiNumeri;
    }

    public List<Integer> invertiOrdineLista(List<Integer> l){
        List<Integer> listaOrdineInvertito = new ArrayList<>(l);
        Collections.shuffle(l);
        listaOrdineInvertito.addAll(l);
        System.out.println("La nuova lista di numeri è " + listaOrdineInvertito);
        return listaOrdineInvertito;
    }

    public void stampaPariDispari(List<Integer> l, boolean b){
        System.out.println("La lista di partenza è " + l);
        List<Integer> listaPariDispari = new ArrayList<Integer>();
        if(b){
            for (Integer n : l){
                if (n % 2 == 0){
                    listaPariDispari.add(n);
                }
            }
            System.out.println("La lista di numeri pari è " + listaPariDispari);
        } else {
            for (Integer n : l){
                if (n % 2 == 1){
                    listaPariDispari.add(n);
                }
            }
            System.out.println("La lista di numeri dispari è " + listaPariDispari);
        }


    }
}
