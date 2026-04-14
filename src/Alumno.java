public class Alumno extends MembroComunidadeEscolar {
    public String curso;
    public Alumno(String curso, String nom, int ed, String nomCentro, int codCentro) {
        super(nom, ed, codCentro, nomCentro);
        this.curso = curso;
    }
    public String get_curso() {
        return this.curso;
    }
    public void set_curso(String curso) {
        this.curso = curso;
    }
    public static void main(String[] args) {
        Alumno p1 = new Alumno("DAM", "Alan", 20,"Castelao",1234);
        System.out.println(p1.get_curso());
        System.out.println(p1.get_nome());
        System.out.println(p1.get_edad());
        System.out.println(p1.get_nombreCentro());
        System.out.println(p1.getCodigoCentro());
    }
}
