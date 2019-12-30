import java.util.*;

public class Magazin {
    private Map<Produs, Integer> stockProduse = new HashMap<Produs, Integer>();

/*    public void incarcaBazaDeDate() throws IOException {
        File file = new File("Alimente.txt");
        scanner = new Scanner(file);
        FileReader fr = new FileReader(file);
        BufferedReader input = new BufferedReader(fr);
        while (input.readLine() != null) {
            String numeProd = scanner.nextLine()
            double pret = scanner.nextDouble();
            scanner.nextLine();
            String nume = scanner.nextLine();
            String cod = scanner.next();
            scanner.nextLine();
            String detalii= scanner.nextLine();
            scanner.nextLine();
            String producator = scanner.nextLine();
            UnitateDeMasura = (UnitateDeMasura)scanner.nextLine();
            Produs(pret, nume, cod, detalii, producator, )
        }
    }*/

    public void adaugaStockProdus(Produs produs, int stoc) {
        if (stockProduse.containsKey(produs))
            stockProduse.replace(produs, stoc);
        else stockProduse.put(produs, stoc);
    }

    public void cumparaProdus(Produs produs) {
        if (stockProduse.containsKey(produs)) {
            int noulStoc = stockProduse.get(produs) - 1;
            stockProduse.replace(produs, noulStoc);
        }
    }

    public void cumparaProduse(List<Produs> listaProduse) {
        int noulStoc = 0;
        for (Produs produs : listaProduse) {
            if (stockProduse.containsKey(produs)) {
                noulStoc = stockProduse.get(produs) - 1;
                stockProduse.replace(produs, noulStoc);
            }
        }
    }

    public void afiseazaStockProduse() {
        Iterator iterator = stockProduse.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Produs, Integer> entry = (Map.Entry<Produs, Integer>) iterator.next();
            String denumireProdus = entry.getKey().getNume();
            int stocProdus = entry.getValue();
            UnitateDeMasura unitateDeMasura = entry.getKey().getUnitateDeMasura();
            System.out.printf("%s : %d %s", denumireProdus, stocProdus, unitateDeMasura);
            if (iterator.hasNext())
                System.out.print(" , ");
        }
        System.out.println();
/*        for (Map.Entry<Produs, Integer> produs : stockProduse.entrySet()) {
            String denumireProdus = produs.getKey().getNume();
            int stocProdus = produs.getValue();
            UnitateDeMasura unitateDeMasura = produs.getKey().getUnitateDeMasura();
            System.out.printf("%s : %d %s , ", denumireProdus, stocProdus, unitateDeMasura);
        }*/
    }

    public Produs cautaProdus(String nume) {
        Produs produsCautat = null;
        for (Map.Entry<Produs, Integer> produs : stockProduse.entrySet())
            if (produs.getKey().getNume().toLowerCase().contains(nume.toLowerCase()))
                produsCautat = produs.getKey();
        return produsCautat;
    }

    public int getStock(String nume) {
        int stock = 0;
        for (Map.Entry<Produs, Integer> produs : stockProduse.entrySet()) {
            if (produs.getKey().getNume().toLowerCase().contains(nume.toLowerCase())) {
                stock = produs.getValue();
            }
        }
        return stock;
    }
}