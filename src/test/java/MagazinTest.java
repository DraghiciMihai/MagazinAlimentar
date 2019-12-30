import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MagazinTest {

    Magazin magazin = new Magazin();
    Produs carnePorc = new Carne(35, "Carne de porc", "154584", "Cal I",
            "Nissara", LocalDate.parse("2019-09-23"), LocalDate.parse("2019-09-23"), TipCarne.PORC);
    Produs peste = new Carne(15, "Peste", "154586", "Cal I",
            "Nissara", LocalDate.parse("2019-09-23"), LocalDate.parse("2019-09-23"), TipCarne.PORC);
    Produs geaca = new Haine(350, "Geaca de ski", "236584", "Geaca de ski",
            "Timberland", "Nylon");
    Produs banane = new Fructe(15, "Banane", "654895", "Cal I",
            "SC Madagascar SRL", LocalDate.parse("2019-09-23"), LocalDate.parse("2019-09-26"), "Madagascar");
    Produs mere = new Fructe(6, "Mere Ionatan", "1545893", "Cal I",
            "Nissara", LocalDate.parse("2019-09-23"), LocalDate.parse("2019-12-01"), "Albania");
    Produs blugi = new Haine(190, "Blugi", "154589", "Blugi regular",
            "H&M", "Cotton");


    @Test
    public void cumparareTest() {
        magazin.adaugaStockProdus(carnePorc, 56);
        magazin.adaugaStockProdus(geaca, 9);
        magazin.adaugaStockProdus(peste, 50);
        magazin.adaugaStockProdus(banane, 50);
        magazin.adaugaStockProdus(mere, 20);
        magazin.adaugaStockProdus(blugi, 10);
        List<Produs> cosCumparaturi = new ArrayList<Produs>();
        Produs produs1 = magazin.cautaProdus("Mere");
        cosCumparaturi.add(produs1);
        cosCumparaturi.add(produs1);
        Produs produs2 = magazin.cautaProdus("Carne");
        cosCumparaturi.add(produs2);
        cosCumparaturi.add(produs2);
        cosCumparaturi.add(produs2);
        Produs produs3 = magazin.cautaProdus("Blugi");
        cosCumparaturi.add(produs3);
        cosCumparaturi.add(produs3);
        cosCumparaturi.add(produs3);
        cosCumparaturi.add(produs3);
        magazin.cumparaProduse(cosCumparaturi);
        int mereInStock = magazin.getStock("Mere");
        Assert.assertEquals(18, mereInStock);
        int blugiInStock = magazin.getStock("Blugi");
        Assert.assertEquals(6, blugiInStock);
        int carneInStock = magazin.getStock("Carne");
        Assert.assertEquals(53, carneInStock);
    }
}