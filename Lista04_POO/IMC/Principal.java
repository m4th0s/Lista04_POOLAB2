import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        String sobrenome;
        int idade;
        double altura;
        double peso;

        System.out.println("Digite seu nome:");
        nome = sc.nextLine();

        System.out.println("Digite seu sobrenome:");
        sobrenome = sc.nextLine();

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();

        System.out.println("Digite sua altura:");
        altura = sc.nextDouble();

        System.out.println("Digite seu peso:");
        peso = sc.nextDouble();

        Pessoa pessoa = new Pessoa(nome, sobrenome, idade, altura, peso);

        pessoa.CalculaIMC();

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.printf("IMC: %.2f%n", pessoa.getImc());
        System.out.println("Classificacao: " + pessoa.InformaObesidade());

        sc.close();
    }
}
