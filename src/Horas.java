public class Horas {
    public int horas;
    public int minutos;
    public int segundos;

    public Horas(){
        horas = 24;
        minutos = 60;
        segundos = 60;
    }
    public Horas(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public String toString() {
        return String.format("%02d:%02d:%02d",horas,minutos,segundos);
    }
}
