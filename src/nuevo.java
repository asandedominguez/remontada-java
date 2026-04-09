import java.util.Scanner;
public class nuevo {
    public static void main (String[] args) {
        int contador = -1;
        while (contador != 5){
            System.out.println(contador);
            contador++;
        }
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (opcion !=3) {
            System.out.println("Elige una opción: ");
            System.out.println("1. Saudar");
            System.out.println("2. Despedir");
            System.out.println("3. Sair");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Hola");
                    opcion = 3;
                    break;
                case 2:
                    System.out.println("Adios Andres Ivan Peraza do Nascimento");
                    opcion = 3;
                    break;
                case 3:
                    System.out.println("Saliendo de René Chamorro");
                    break;
                default:
                    System.out.println("Opcion no valida Isaac");
            }
            //for (inicicializacion;expresion condicional; incremento)
            for (int i = 5; i < 20; i+=3) {
                System.out.println("INDICE:"+i);
            }
            int i = 5;
            for (;;){
                System.out.println(+i);
                i+=1;
                if (i>19) break;
            }
        }
        teclado.close();
    }
}
