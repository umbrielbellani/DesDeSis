public class Transportista {
    String Empresa;
    String Calculo;

    public Transportista(String empresa, String calculo) {
        Empresa = empresa;
        Calculo = calculo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getCalculo() {
        return Calculo;
    }

    public void setCalculo(String calculo) {
        Calculo = calculo;
    }
}
