import java.time.LocalDateTime;
import java.util.Date;

public class Carne extends Perisabile {
    TipCarne tipCarne;

    public Carne(double pret, String nume, String cod, String detalii,
                 String producator,
                 LocalDateTime dataFabricatiei, LocalDateTime dataExpirare, TipCarne tipCarne) {
        super(pret, nume, cod, detalii, producator, dataFabricatiei, dataExpirare);
        this.tipCarne = tipCarne;
    }
}