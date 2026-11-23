public class Aluno {

    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;
    private double estrategia;
    private double criatividade;
    private String casa;

    public Aluno(String nome, int idade, double coragem,
            double inteligencia, double ambicao, double lealdade,
            double estrategia, double criatividade) {

        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCasa() {
        return casa;
    }

    public void calcularCasa() {

        double grifinoria;
        double sonserina;
        double corvinal;
        double lufalufa;

        grifinoria = (2 * coragem) + lealdade;
        sonserina = (2 * ambicao) + estrategia;
        corvinal = (2 * inteligencia) + criatividade;
        lufalufa = ((2 * lealdade) + coragem) / 3;

        if (grifinoria >= sonserina && grifinoria >= corvinal && grifinoria >= lufalufa) {
            casa = "Grifinoria";
        } else if (sonserina >= corvinal && sonserina >= lufalufa) {
            casa = "Sonserina";
        } else if (corvinal >= lufalufa) {
            casa = "Corvinal";
        } else {
            casa = "Lufa-Lufa";
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n===== RESULTADO DO CHAPEU SELETOR =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Casa escolhida: " + casa);
    }
}
