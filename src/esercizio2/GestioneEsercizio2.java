package esercizio2;

import java.util.List;

public class GestioneEsercizio2 {
    public static void main(String[] args) {
        InserisciNumeri n1 = new InserisciNumeri();
        List<Integer> n1Param = n1.inserisciNuoviNumeri();
        n1.invertiOrdineLista(n1Param);
        n1.stampaPariDispari(n1Param, true);
    }
}
