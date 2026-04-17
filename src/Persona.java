public class Persona {

    public String nome;
    public int edad;
    public String dni;
    // Constructor por defecto
    public Persona() {
        nome = "toti";
        edad = 23;
        dni = "Y6607987D";
    }

    // Constructor con parámetros
    public Persona(String nome, int edad, String dni) {
        this.nome = nome;
        this.edad = edad;
        this.dni = dni;
    }
    public int get_edad() {
        return this.edad;
    }
    // Getter y Setter
    public String get_nome() {
        return this.nome;
    }
    public String get_dni() { return this.dni; }

    public void set_nome(String nome) {
        this.nome = nome;
    }
    public void set_dni(String dni) { this.dni = dni; }
    // Método main
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.set_nome("pedrito");
        //Posición en la que esta dicho caracter
        int posicion = p1.nome.indexOf("d");
        //Muestra que caracter esta en dicha posición
        char letra = p1.nome.charAt(0);
        //Muestra el código numérico de la primera letra
        byte[] misBytes = p1.nome.getBytes();
        System.out.println(misBytes[0]);
        //Que imprima el codigo de todos
        for (byte b : misBytes) {
            System.out.print(b + " ");
        }
        System.out.println(letra);
        System.out.println(posicion);
        Persona p2 = new Persona("alan", 24, "Y6607987D");

        System.out.println(p1.get_nome()); // pedrito
        System.out.println(p2.edad);       // 24
        System.out.println(p2.get_dni());
        MembroComunidadeEscolar m1 = new MembroComunidadeEscolar("Alan",21,1,"Hugo", "26623774D");
        System.out.println(m1.nome);
        //Otra vez
        System.out.println(p1.nome.indexOf("e"));
    }
}