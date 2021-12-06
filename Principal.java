package MesaAula22;

public class Principal {
    public static void main(String[] args) {
        // Vagão com um retângulo de 5X4 e três círculos de raio 1.
        Circulo c1 = new Circulo(1);
        Retangulo r1 = new Retangulo(4, 5);
        Trem trem1 = new Trem();

        trem1.addFigura(c1);
        trem1.addFigura(c1);
        trem1.addFigura(c1);
        trem1.addFigura(r1);

        System.out.println((trem1.calcularArea()));

        // Locomotiva com um retângulo 6X4, dois círculos de raio 1, um triângulo de 2X2
        Retangulo r2 = new Retangulo(4, 6);
        Triangulo t1 = new Triangulo(2, 2);
        Trem trem2 = new Trem();

        trem2.addFigura(r2);
        trem2.addFigura(c1);
        trem2.addFigura(c1);
        trem2.addFigura(t1);

        System.out.println(trem2.calcularArea());
    }
}
