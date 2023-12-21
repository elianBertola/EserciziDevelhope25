import java.util.*;

public class Main {
    public static void main(String[] args) {
        Articoli articolo1 = new Articoli("Coca cola",0.59);
        Articoli articolo2 = new Articoli("Prosciutto cotto",1.05);
        Articoli articolo3 = new Articoli("Kinder",1.99);

        //inizializzazione HashMap
        Map<String, Articoli> mappaArticoli = new HashMap<>();
        mappaArticoli.put("Bevande", articolo1);
        mappaArticoli.put("Cibo", articolo2);
        mappaArticoli.put("Dolce",articolo3);

        //nel video non spiega come ordinare gli elementi con HashMap quindi utilizzo ArrayList
        //conversione a ArrayList per ordinare gli elementi
        Collection<Articoli> values = mappaArticoli.values();

        ArrayList<Articoli> listaOrdinata = new ArrayList<>(values);

        listaOrdinata.sort(Comparator.comparing(Articoli::getPrezzo));

        System.out.println("Elementi ordinati per prezzo:");
        for(Articoli elemento: listaOrdinata){
            System.out.println(elemento);
        }
    }
}