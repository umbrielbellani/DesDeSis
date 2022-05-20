import java.util.ArrayList;
public class Impresora {
    int IP;
    String Modelo;
    ArrayList<Impresion> Impresiones;
    ArrayList<Dispositivo> Dispositivos;

    private Impresora(int IP, String modelo, ArrayList<Impresion> impresiones, ArrayList<Dispositivo> dispositivos) {
        this.IP = 1;
        Modelo = "HP Laser Neverstop 1200a";
    }

    public int getIP() {
        return IP;
    }

    public void setIP(int IP) {
        this.IP = IP;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public ArrayList<Impresion> getImpresiones() {
        return Impresiones;
    }

    public void setImpresiones(ArrayList<Impresion> impresiones) {
        Impresiones = impresiones;
    }

    public ArrayList<Dispositivo> getDispositivos() {
        return Dispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        Dispositivos = dispositivos;
    }
}
