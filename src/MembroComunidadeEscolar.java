public class MembroComunidadeEscolar extends Persona{
    private int codigoCentro;
    private String nomeCentro;

    public MembroComunidadeEscolar (String nom, int ed,int codCentro, String nomCentro, String dn) {
        super(nom,ed, dn);
        this.codigoCentro = codCentro;
        this.nomeCentro = nomCentro;
    }
    public int getCodigoCentro(){
        return this.codigoCentro;
    }
    public void setCodigoCentro(int novoCodCentro) {
        if (novoCodCentro>0) codigoCentro = novoCodCentro;
    }
    public String get_nombreCentro(){ return this.nomeCentro;}

}
