import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public abstract class Perisabile extends Produs {
    private LocalDate dataFabricatiei;
    private LocalDate dataExpirare;

    public Perisabile(double pret, String nume, String cod, String detalii, String producator, LocalDate dataFabricatiei, LocalDate dataExpirare) {
        super(pret, nume, cod, detalii, producator);
        this.dataFabricatiei = dataFabricatiei;
        this.dataExpirare = dataExpirare;
        this.unitateDeMasura = UnitateDeMasura.kg;
    }
}

