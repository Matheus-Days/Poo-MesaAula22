package MesaAula22;

import java.util.ArrayList;

public class Trem extends Figura {
    private ArrayList<Figura> figuras = new ArrayList<>();

    public void addFigura(Figura o) {
        figuras.add(o);
    }

    @Override
    public double calcularArea() {
        double area = 0;
        for (Figura figura: figuras) {
            area += figura.calcularArea();
        }
        return area;
    }
}
