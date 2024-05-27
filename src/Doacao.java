import java.time.LocalDate;

/**
 * Classe que representa uma doação.
 */
public class Doacao {
    private Doador doador;
    private InstituicaoCaridade instituicaoBeneficiada;
    private String tipoDeDoacao;
    private double valor;
    private LocalDate dataDaDoacao;

    /**
     * Construtor para inicializar uma doação com os atributos básicos.
     */
    public Doacao(Doador doador, InstituicaoCaridade instituicaoBeneficiada, String tipoDeDoacao, double valor, LocalDate dataDaDoacao) {
        this.doador = doador;
        this.instituicaoBeneficiada = instituicaoBeneficiada;
        this.tipoDeDoacao = tipoDeDoacao;
        this.valor = valor;
        this.dataDaDoacao = dataDaDoacao;
    }

    // Getters e Setters
    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public InstituicaoCaridade getInstituicaoBeneficiada() {
        return instituicaoBeneficiada;
    }

    public void setInstituicaoBeneficiada(InstituicaoCaridade instituicaoBeneficiada) {
        this.instituicaoBeneficiada = instituicaoBeneficiada;
    }

    public String getTipoDeDoacao() {
        return tipoDeDoacao;
    }

    public void setTipoDeDoacao(String tipoDeDoacao) {
        this.tipoDeDoacao = tipoDeDoacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataDaDoacao() {
        return dataDaDoacao;
    }

    public void setDataDaDoacao(LocalDate dataDaDoacao) {
        this.dataDaDoacao = dataDaDoacao;
    }
}

