public abstract class Produs {
    private double pret;
    private String nume;
    private String cod;
    private String detalii;
    private String producator;
    protected UnitateDeMasura unitateDeMasura;

    public Produs(double pret, String nume, String cod, String detalii, String producator) {
        this.pret = pret;
        this.nume = nume;
        this.cod = cod;
        this.detalii = detalii;
        this.producator = producator;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public UnitateDeMasura getUnitateDeMasura() {
        return unitateDeMasura;
    }

    public void setUnitateDeMasura(UnitateDeMasura unitateDeMasura) {
        this.unitateDeMasura = unitateDeMasura;
    }

    @Override
    public String toString(){
        return this.getNume();
    }
}
