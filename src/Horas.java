public class Horas {
    public int horas;
    public int minutos;
    public int segundos;

    public Horas (int hh, int mm, int ss) {
        this.horas = hh;
        this.minutos = mm;
        this.segundos = ss;
    }

    public Horas(double tiempo) {
        int parteEntera = (int) tiempo;
        this.horas = parteEntera;

        double min = (tiempo - parteEntera) * 60;
        this.minutos = (int) min;

        double seg = (min - this.minutos) * 60;
        this.segundos = (int) seg;
    }
    public Horas(String momento){
        String[] partes = momento.split(":");
        int hora = Integer.parseInt(partes[0]);
        int mins = Integer.parseInt(partes[1]);
        int seg = Integer.parseInt(partes[2]);

        this.horas = hora;
        this.minutos = mins;
        this.segundos = seg;
    }


    public int get_horas() {
        return this.horas;
    }

    public void set_horas(int horas) {
        this.horas = horas;
    }

    public int get_minutos() {
        return this.minutos;
    }

    public void set_minutos(int minutos) {
        this.minutos = minutos;
    }

    public int get_segundos() {
        return this.segundos;
    }

    public void set_segundos(int segundos) {
        this.segundos = segundos;
    }

    public static void main(String[] args) {
        Horas toti = new Horas(1.78);
        System.out.println(toti.get_horas());
        System.out.println(toti.get_minutos());
        System.out.println(toti.get_segundos());
        Horas alan = new Horas("16:45:23");
        System.out.println(alan.get_horas());
        System.out.println(alan.get_minutos());
        System.out.println(alan.get_segundos());

    }
}