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
        Alumno p1 = new Alumno();
        System.out.println();

    }
}
