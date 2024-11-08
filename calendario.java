public class Calendario {
    int dia;
    int mes;
    int ano;

    public Calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String nomeMes() {
        switch (mes) {
            case 1: return "janeiro";
            case 2: return "fevereiro";
            case 3: return "março";
            case 4: return "abril";
            case 5: return "maio";
            case 6: return "junho";
            case 7: return "julho";
            case 8: return "agosto";
            case 9: return "setembro";
            case 10: return "outubro";
            case 11: return "novembro";
            case 12: return "dezembro";
            default: return "Mês inválido";
        }
    }

    public void mostrarData() {
        System.out.println(dia + " de " + nomeMes() + " de " + ano);
    }

    public void anoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }

    public static void main(String[] args) {
        Calendario data1 = new Calendario(25, 12, 2020);
        Calendario data2 = new Calendario(1, 3, 2023);

        data1.mostrarData();
        data1.anoBissexto();

        data2.mostrarData();
        data2.anoBissexto();
    }
}
