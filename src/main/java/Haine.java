public class Haine extends Produs {
    private String numeMaterial;
    public Haine(double pret, String nume, String cod, String detalii, String producator,
                  String numeMaterial) {
        super(pret, nume, cod, detalii, producator);
        this.numeMaterial = numeMaterial;
        this.unitateDeMasura = UnitateDeMasura.buc;
    }
}
