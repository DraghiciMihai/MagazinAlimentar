import java.time.LocalDateTime;
import java.util.Date;

public class Fructe extends Perisabile{
    private String taraOrigine;

    public Fructe(double pret, String nume, String cod, String detalii, String producator, LocalDateTime dataFabricatiei, LocalDateTime dataExpirare, String taraOrigine) {
        super(pret, nume, cod, detalii, producator, dataFabricatiei, dataExpirare);
        this.taraOrigine = taraOrigine;
        this.unitateDeMasura = UnitateDeMasura.kg;
    }
}
