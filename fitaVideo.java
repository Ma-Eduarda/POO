public class FitaDeVideo {
    String titulo;
    float precoPorDia;

    public FitaDeVideo(String titulo, float precoPorDia) {
        this.titulo = titulo;
        this.precoPorDia = precoPorDia;
    }

    public float getValorAluguel(int numeroDeDiasAlugada) {
        return precoPorDia * numeroDeDiasAlugada;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Preço por Dia: R$" + precoPorDia;
    }

    public static void main(String[] args) {
        FitaDeVideo fita1 = new FitaDeVideo("Matrix", 5.0f);
        FitaDeVideo fita2 = new FitaDeVideo("Star Wars", 4.0f);

        System.out.println(fita1);
        System.out.println("Valor do Aluguel por 3 dias: R$" + fita1.getValorAluguel(3));
        
        System.out.println(fita2);
        System.out.println("Valor do Aluguel por 5 dias: R$" + fita2.getValorAluguel(5));
    }
}
