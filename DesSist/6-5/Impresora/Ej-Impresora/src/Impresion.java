public class Impresion {
    String Estado;
    String AImprimir;

    public Impresion(String aimprimir) {
        Estado = "pendiente";
        AImprimir = aimprimir;
    }

    public Impresion() {
        Estado = "pendiente";
        AImprimir = "hola";
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getImprimir() {
        return AImprimir;
    }

    public void setImprimir(String aimprimir) {
        AImprimir = aimprimir;
    }
}
