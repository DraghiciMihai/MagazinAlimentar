import java.time.LocalDateTime;
import java.util.Date;

public abstract class Perisabile extends Produs {
    private LocalDateTime dataFabricatiei;
    private LocalDateTime dataExpirare;

    public Perisabile(double pret, String nume, String cod, String detalii, String producator, LocalDateTime dataFabricatiei, LocalDateTime dataExpirare) {
        super(pret, nume, cod, detalii, producator);
        this.dataFabricatiei = dataFabricatiei;
        this.dataExpirare = dataExpirare;
        this.unitateDeMasura = UnitateDeMasura.kg;
    }
}

