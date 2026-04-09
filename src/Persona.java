public class Persona {

    public String nome;
    public int edad;

    // Constructor por defecto
    public Persona() {
        nome = "toti";
        edad = 23;
    }

    // Constructor con parámetros
    public Persona(String nome, int edad) {
        this.nome = nome;
        this.edad = edad;
    }

    // Getter y Setter
    public String get_nome() {
        return this.nome;
    }

    public void set_nome(String nome) {
        this.nome = nome;
    }
    // Método main
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.set_nome("pedrito");

        Persona p2 = new Persona("alan", 24);

        System.out.println(p1.get_nome()); // pedrito
        System.out.println(p2.edad);       // 24
    }
}