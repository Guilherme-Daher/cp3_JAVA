/**
 * Classe que representa um voluntário.
 */
public class Voluntario {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private String disponibilidadeDeHorario;
    private String habilidadesOuAreasDeInteresse;

    /**
     * Construtor para inicializar um voluntário com os atributos básicos.
     */
    public Voluntario(String nome, String cpf, String endereco, String contato, String disponibilidadeDeHorario, String habilidadesOuAreasDeInteresse) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.disponibilidadeDeHorario = disponibilidadeDeHorario;
        this.habilidadesOuAreasDeInteresse = habilidadesOuAreasDeInteresse;
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

    public String getDisponibilidadeDeHorario() {
        return disponibilidadeDeHorario;
    }

    public void setDisponibilidadeDeHorario(String disponibilidadeDeHorario) {
        this.disponibilidadeDeHorario = disponibilidadeDeHorario;
    }

    public String getHabilidadesOuAreasDeInteresse() {
        return habilidadesOuAreasDeInteresse;
    }

    public void setHabilidadesOuAreasDeInteresse(String habilidadesOuAreasDeInteresse) {
        this.habilidadesOuAreasDeInteresse = habilidadesOuAreasDeInteresse;
    }
}
