public class Horas {
    public int horas;
    public int minutos;
    public int segundos;

    public Horas() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor principal con validación
    public Horas(int hora, int minutos, int segundos) {
        if (hora >= 0 && hora < 24) {
            this.horas = hora;
        } else {
            this.horas = 0;
        }

        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        } else {
            this.minutos = 0;
        }

        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }

    // Constructor desde double (horas decimales)
    public Horas(double tiempo) {
        int h = (int) tiempo;
        double restoHoras = tiempo - h;

        int m = (int) (restoHoras * 60);
        double restoMin = (restoHoras * 60) - m;

        int s = (int) (restoMin * 60);

        this.horas = h;
        this.minutos = m;
        this.segundos = s;

        normalizar();
    }

    // Constructor desde String "hh:mm:ss"
    public Horas(String momento) {
        String[] partes = momento.split(":");

        this.horas = Integer.parseInt(partes[0]);
        this.minutos = Integer.parseInt(partes[1]);
        this.segundos = Integer.parseInt(partes[2]);

        normalizar();
    }

    // Normaliza por si hay overflow (ej: 70 min -> 1h 10m)
    private void normalizar() {
        if (segundos >= 60) {
            minutos += segundos / 60;
            segundos = segundos % 60;
        }

        if (minutos >= 60) {
            horas += minutos / 60;
            minutos = minutos % 60;
        }

        horas = horas % 24;
    }

    public int get_horas() {
        return this.horas;
    }

    public int get_minutos() {
        return this.minutos;
    }

    public int get_segundos() {
        return this.segundos;
    }

    public void set_horas(int horas) {
        this.horas = horas;
        normalizar();
    }

    public void set_minutos(int minutos) {
        this.minutos = minutos;
        normalizar();
    }

    public void set_segundos(int segundos) {
        this.segundos = segundos;
        normalizar();
    }

    public static void main(String[] args) {
        Horas toti = new Horas();
        System.out.println(toti.get_horas());
        System.out.println(toti.get_minutos());
        System.out.println(toti.get_segundos());

        Horas alan = new Horas("16:45:23");
        System.out.println(alan.get_horas());
        System.out.println(alan.get_minutos());
        System.out.println(alan.get_segundos());
    }
}