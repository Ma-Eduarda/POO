class Quadrado {
    private float lado;
  
    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float calcularArea() {
        return lado * lado;
    }

    public float calcularPerimetro() {
        return 4 * lado;
    }

    public void imprimir() {
        System.out.println("Lado do quadrado: " + lado);
        System.out.println("Área do quadrado: " + calcularArea());
        System.out.println("Perímetro do quadrado: " + calcularPerimetro());
    }
}

public class Principal {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5.75f);
        quadrado.imprimir();
    }
}
