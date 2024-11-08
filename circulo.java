public class Circulo {
    float raio;
    final float PI = 3.141516f;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float calcularArea() {
        return PI * raio * raio;
    }

    public float calcularPerimetro() {
        return 2 * PI * raio;
    }

    public void imprimir() {
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(4.0f);
        circulo.imprimir();
    }
}
