import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Base {
    String Nombre;

    public Base(String nombre) {
        Nombre = nombre;
    }

    public Base() {
        Nombre = "daada";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int CalcularAmbulancias(){
        ArrayList<Base> Base = Unidad_Administrativa.Bases;

        HashMap<Integer,String> Ambulancias = Base_Normal.Ambulancias;
        return Ambulancias.size();
    }

    public void CalcularTiempos() {

    }
}
