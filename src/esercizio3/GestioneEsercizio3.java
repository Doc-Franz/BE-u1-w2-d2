package esercizio3;

import java.util.Map;

public class GestioneEsercizio3 {
    public static void main(String[] args) {
        Rubrica r1 = new Rubrica();
        Map<String, Object> r1param = r1.inserisciContatto();
        r1.cancellaContatto(r1param);
        r1.ricercaContatto(r1param);
    }
}

