public class Controle {
    private int quantidadeR;
    private int quantidade;
    int total;

    public int getQuantidadeR() {
        return quantidadeR;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setQuantidadeR(int quantidadeR) {
        this.quantidadeR = quantidadeR;

    }

    public void quantidadetotal(){
        total = quantidade - quantidadeR;

        System.out.println("a quantidade total de produtos no estoque é de: " + total);
    }
}
