public class MembroComunidadeEscolar extends Persona{
    private int codigoCentro;
    private String nomeCentro;

    public MembroComunidadeEscolar (String nom, int ed,int codCentro, String nomCentro) {
        super(nom,ed);
        this.codigoCentro = codCentro;
        this.nomeCentro = nomCentro;
    }
}
