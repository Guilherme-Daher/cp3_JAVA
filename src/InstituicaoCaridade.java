import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma instituição de caridade.
 */
public class InstituicaoCaridade {
    private String nome;
    private String cnpj;
    private String endereco;
    private String contato;
    private String areaDeAtuacao;
    private List<Voluntario> voluntarios;
    private List<Doacao> historicoDeDoacoesRecebidas;

    /**
     * Construtor para inicializar uma instituição de caridade com os atributos básicos.
     */
    public InstituicaoCaridade(String nome, String cnpj, String endereco, String contato, String areaDeAtuacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.areaDeAtuacao = areaDeAtuacao;
        this.voluntarios = new ArrayList<>();
        this.historicoDeDoacoesRecebidas = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public List<Doacao> getHistoricoDeDoacoesRecebidas() {
        return historicoDeDoacoesRecebidas;
    }

    /**
     * Adiciona um voluntário à lista de voluntários da instituição.
     * @param voluntario O voluntário a ser adicionado.
     */
    public void adicionarVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
    }

    /**
     * Adiciona uma doação ao histórico de doações recebidas pela instituição.
     * @param doacao A doação a ser adicionada.
     */
    public void adicionarDoacao(Doacao doacao) {
        this.historicoDeDoacoesRecebidas.add(doacao);
    }
}
