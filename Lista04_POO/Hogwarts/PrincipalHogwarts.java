import java.util.Scanner;

public class PrincipalHogwarts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double coragem;
        double inteligencia;
        double ambicao;
        double lealdade;
        double estrategia;
        double criatividade;
        String continuar;

        do {
            System.out.println("\n===== CHAPEU SELETOR =====");

            System.out.println("Digite o nome do aluno:");
            nome = sc.nextLine();

            System.out.println("Digite a idade:");
            idade = sc.nextInt();

            System.out.println("Digite a pontuacao de coragem:");
            coragem = sc.nextDouble();

            System.out.println("Digite a pontuacao de inteligencia:");
            inteligencia = sc.nextDouble();

            System.out.println("Digite a pontuacao de ambicao:");
            ambicao = sc.nextDouble();

            System.out.println("Digite a pontuacao de lealdade:");
            lealdade = sc.nextDouble();

            System.out.println("Digite a pontuacao de estrategia:");
            estrategia = sc.nextDouble();

            System.out.println("Digite a pontuacao de criatividade:");
            criatividade = sc.nextDouble();

            Aluno aluno = new Aluno(nome, idade, coragem,
                    inteligencia, ambicao, lealdade,
                    estrategia, criatividade);

            aluno.calcularCasa();
            aluno.exibirInformacoes();

            sc.nextLine();

            System.out.println("\nDeseja cadastrar outro aluno? (sim/nao)");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("sim"));

        System.out.println("\nPrograma encerrado!");

        sc.close();
    }
}
