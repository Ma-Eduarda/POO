import java.util.Scanner;

public class Funcionario {
    int codigo;
    String nome;
    String cpf;
    String endereco;
    String telefone;
    int idade;
    float salario;

    public Funcionario(int codigo, String nome, String cpf, String endereco, String telefone, int idade, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public float calculaSalarioLiquido() {
        return salario * 0.89f;
    }

    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Bruto: R$" + salario);
        System.out.println("Salário Líquido: R$" + calculaSalarioLiquido());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario(1, "Ana", "123.456.789-00", "Rua A", "99999-9999", 30, 3000.0f);
        
        funcionario.imprimirDados();

        System.out.print("Digite o novo salário: ");
        funcionario.salario = scanner.nextFloat();

        funcionario.imprimirDados();
        scanner.close();
    }
}
