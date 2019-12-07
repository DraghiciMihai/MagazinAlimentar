import sun.util.calendar.BaseCalendar;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Magazin magazin = new Magazin();
        Produs carnePorc = new Carne(35, "Carne de porc", "154584", "Cal I", "Nissara", LocalDateTime.of(2019, Month.AUGUST,23,06,00), LocalDateTime.of(2019,Month.SEPTEMBER, 23, 06, 00), TipCarne.PORC);
        Produs carnePasare = new Carne(25.6, "Carne de pui", "154585", "Cal I", "Nissara", LocalDateTime.of(2019, Month.AUGUST,23,06,00), LocalDateTime.of(2019,Month.SEPTEMBER, 23, 06, 00), TipCarne.PUI);
        Produs peste = new Carne(15, "Peste", "154586", "Cal I", "Nissara", LocalDateTime.of(2019, Month.AUGUST,23,06,00), LocalDateTime.of(2019,Month.SEPTEMBER, 23, 06, 00), TipCarne.PORC);
        Produs geaca = new Haine(350, "Geaca de ski", "236584", "Geaca de ski", "Timberland", "Nylon");
        Produs banane = new Fructe(15, "Banane", "654895", "Cal I", "SC Madagascar SRL", LocalDateTime.of(2019, Month.AUGUST,23,06,00), LocalDateTime.of(2019,Month.SEPTEMBER, 23, 06, 00), "Madaascar");

/*        Produs geaca = new Produs(50.0, "Geaca de Iarna", "458966", "De iarna", "Adidas", UnitateDeMasura.bucata );
        Produs peste = new Produs(15.9, "Peste", "458967", "Macrou", "S.C. Pescaria S.R.L.", UnitateDeMasura.kg);
        Produs carnePasare = new Produs(20.5,"Carne de pasare", "458969", "Calitate I", "Nissara", UnitateDeMasura.kg);
        Produs carnePorc = new Produs(25.5,"Carne de porc", "458965", "Calitate I", "Nissara", UnitateDeMasura.kg);
        Produs carnePorc = new Produs(25.5,"Carne de porc", "458965", "Calitate I", "Nissara", UnitateDeMasura.kg);
        Produs carnePorc = new Produs(25.5,"Carne de porc", "458965", "Calitate I", "Nissara", UnitateDeMasura.kg);
        Produs carnePorc = new Produs(25.5,"Carne de porc", "458965", "Calitate I", "Nissara", UnitateDeMasura.kg);
        Produs carnePorc = new Produs(25.5,"Carne de porc", "458965", "Calitate I", "Nissara", UnitateDeMasura.kg);
        Produs carnePorc = new Produs(25.5,"Carne de porc", "458965", "Calitate I", "Nissara", UnitateDeMasura.kg);*/

        magazin.adaugaStockProdus(carnePorc, 56);
        magazin.adaugaStockProdus(geaca,9);
        magazin.adaugaStockProdus(peste, 50);
        magazin.adaugaStockProdus(carnePasare, 82);
        magazin.afiseazaStockProduse();
        System.out.println(magazin.cautaProdus("carne"));
        System.out.println(magazin.getStock("peste"));
    }
}
