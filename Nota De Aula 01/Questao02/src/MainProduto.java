import java.util.Scanner;
public class MainProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();
        Pagamento pa = new Pagamento();
        Controle c = new Controle();

        String x;
        do {
            System.out.println("você deseja realizar cadastro(cadastro), venda(venda) ou controle de estoque(cotrole)");
            p.acao = sc.next();
            switch (p.acao) {
                case "venda":
                    System.out.println("insira o codigo do produto: ");
                    p.setCodigo(sc.nextInt());

                    System.out.println("insira o nome do produto: ");
                    p.setNome(sc2.nextLine());

                    System.out.println("insira o valor do produto: ");
                    pa.setValorP(sc.nextDouble());

                    System.out.println("insira o metodo de pagamento: ");
                    pa.metodo = sc.next();

                    pa.negocio();

                    System.out.println("valor final "+pa.getValor());
                    break;

                case "cadastro" :
                    System.out.println("insira o codigo do produto");
                    p.setCodigo(sc.nextInt());

                    System.out.println("insira o nome do produto");
                    p.setNome(sc2.nextLine());

                    System.out.println("insira o valor do produto");
                    pa.setValorP(sc.nextDouble());

                    System.out.println(" insira a cor do produto");
                    p.setCor(sc.next());

                    System.out.println("insira o peso/tamanho do produto");
                    p.setTamanhopeso(sc.nextDouble());

                    System.out.println("insira o preço do produto");
                    pa.setValorP(sc.nextDouble());

                    System.out.println("cadastro realizado com sucesso ");
                    break;

                case"controle":
                    System.out.println("insira a quantidade total do estoque: ");
                    c.setQuantidade(sc.nextInt());
                    System.out.println("insira a quantidade que foi retirada do estoque: ");
                    c.setQuantidadeR(sc.nextInt());

                    c.quantidadetotal();
            }
            System.out.println("deseja repetir o processo ?(S ou N)");
            x = sc.next();
        }while (x.equalsIgnoreCase("S"));
    }
}