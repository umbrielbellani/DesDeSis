public class Dispositivo {
    String Nombre;
    String Direccionip;

    public Dispositivo(String nombre, String direccionip) {
        Nombre = nombre;
        Direccionip = direccionip;
    }

    public Dispositivo(){
        Nombre = "PC";
        Direccionip = "172.54.16.9";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccionip() {
        return Direccionip;
    }

    public void setDireccionip(String direccionip) {
        Direccionip = direccionip;
    }
}
