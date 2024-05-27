import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um doador.
 */
public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private List<Doacao> historicoDeDoacoes;

    /**
     * Construtor para inicializar um doador com os atributos básicos.
     */
    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDeDoacoes = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<Doacao> getHistoricoDeDoacoes() {
        return historicoDeDoacoes;
    }

    /**
     * Adiciona uma doação ao histórico de doações do doador.
     * @param doacao A doação a ser adicionada.
     */
    public void adicionarDoacao(Doacao doacao) {
        this.historicoDeDoacoes.add(doacao);
    }
}
