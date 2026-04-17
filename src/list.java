public class list extends Persona {
    public static void main (String[] args) {
        System.out.println("hola mundo");
        int[] numeros = {1, 2, 3, 4, 5};
        char[] letras = new char[10];
        letras[0] = 'a';
        letras[1] = 'b';
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
        for (int n: numeros ) {
            System.out.println(n);}

        Persona [] equipos;
        equipos = new  Persona[5];
        equipos[1] = new Persona("david",4, "Y6607987D");
        equipos[2] = new Persona("kahn",40, "26623774D");
        equipos[3] = new Persona("isaac",20, "25522567G");
        equipos[4] = new Persona("victor",25, "111111111H");
        equipos[0] = new Persona("ivan",12, "111222222F");
        int cuenta = 0;
        for (int i = 0; i <5; i++) {
            cuenta += equipos[i].edad;
        }
        int resultado = cuenta / 5;
        System.out.println(resultado);


    }
}
