import java.time.LocalDate;

/**
 * Classe principal que demonstra a usabilidade do sistema.
 */
public class Main {
    public static void main(String[] args) {
        // Criação de doadores
        Doador doador1 = new Doador("João Silva", "123.456.789-00", "Rua A, 123", "joao@example.com");

        // Criação de voluntários
        Voluntario voluntario1 = new Voluntario("Maria Souza", "987.654.321-00", "Rua B, 456", "maria@example.com", "Manhã", "Distribuição de alimentos");

        // Criação de instituições de caridade
        InstituicaoCaridade instituicao1 = new InstituicaoCaridade("Instituição A", "12.345.678/0001-99", "Rua C, 789", "contato@instituicaoA.org", "Assistência Social");
        instituicao1.adicionarVoluntario(voluntario1);

        // Criação de doações
        Doacao doacao1 = new Doacao(doador1, instituicao1, "Alimentos", 200.0, LocalDate.now());

        // Registro das doações
        doador1.adicionarDoacao(doacao1);
        instituicao1.adicionarDoacao(doacao1);

        // Exibição dos dados
        System.out.println("Doador: " + doador1.getNome());
        System.out.println("Doações do Doador: ");
        for (Doacao doacao : doador1.getHistoricoDeDoacoes()) {
            System.out.println("Tipo de Doação: " + doacao.getTipoDeDoacao() + ", Valor: " + doacao.getValor());
        }

        System.out.println("\nInstituição: " + instituicao1.getNome());
        System.out.println("Voluntários da Instituição: ");
        for (Voluntario voluntario : instituicao1.getVoluntarios()) {
            System.out.println("Nome: " + voluntario.getNome() + ", Habilidade: " + voluntario.getHabilidadesOuAreasDeInteresse());
        }

        System.out.println("Doações Recebidas pela Instituição: ");
        for (Doacao doacao : instituicao1.getHistoricoDeDoacoesRecebidas()) {
            System.out.println("Tipo de Doação: " + doacao.getTipoDeDoacao() + ", Valor: " + doacao.getValor());
        }
    }
}
