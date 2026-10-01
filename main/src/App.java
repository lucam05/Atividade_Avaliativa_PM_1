import java.util.List;
import java.util.Scanner;

public class App {
     private static Scanner sc = new Scanner(System.in);
     private static OrdemPedido ordem = new OrdemPedido();

     private static String lerTexto(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    private static int lerInt(String msg) {
        while (true) {
            try {
                return Integer.parseInt(lerTexto(msg).trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro.");
            }
        }
    }

    private static double lerDouble(String msg) {
        while (true) {
            try {
                return Double.parseDouble(lerTexto(msg).trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        }
    }
    private static void cadastrarAtendimento() {
        int cod  = lerInt("Codigo da ordem: ");
        String nomeCliente = lerTexto("Nome Cliente: ");
        String modelo = lerTexto("Modelo carro: ");
        String data = lerTexto("Data (dd/mm/aaaa): ");
        double valor = lerDouble("Valor:  ");
        Serviço serviço = new Serviço(
                lerTexto("Nome do serviço: "),
                lerInt("Categoria: "),
                lerDouble("Valor: "),
                lerTexto("Nível de complexidade (baixo/médio/alto): "));
        OrdemPedido a = new OrdemPedido(cod, nomeCliente, modelo, data, valor);
        System.out.println("Atendimento cadastrado.");
    }
    

    public static void main(String[] args) throws Exception {


       criarDadosIniciais();
        int opcao;
        do {
            System.out.println("\n===== Oficina Mecanica =====");
            System.out.println("1 - Cadastrar atendimento");
            System.out.println("2 - Associar mecanico a um Box");
            System.out.println("3 - Atribuir atendimento a uma box");
            System.out.println("4 - Exibir ordens de serviço em um Box");
            System.out.println("5 - Total de atendimentos finalizados por box");
            System.out.println("6 - Buscar atendimentos por status");
            System.out.println("7 - Exibir detalhes de uma ordem de serviços");
            System.out.println("8 - Finalizar atendimento");
            System.out.println("0 - Sair");
            opcao = lerInt("Opção: ");
            try {
                switch (opcao) {
                    case 1 -> cadastrarAtendimento();
                    case 2 -> associarmecanico();
                    case 3 -> ordem.atribuirBox(null);
                    case 4 -> exibirAtendimentosBox();
                    case 5 -> totalFinalizadosPorBox();
                    case 6 -> buscarPorStatus();
                    case 7 -> System.out.println(clinica.buscarAtendimento(lerInt("Código do atendimento: ")));
                    case 8 -> ordem.finalizar();
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 0);
    }
}

