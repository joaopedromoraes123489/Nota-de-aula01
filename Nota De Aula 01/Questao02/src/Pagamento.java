public class Pagamento {
    private double valor;
    private double valorP;


    public double getValor() {
        return valor;
    }

    public double getValorP() {
        return valorP;
    }

    public void setValorP(double valorP) {
        this.valorP = valorP;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    String metodo;
    double valorDESC;
    public void negocio(){
        if (metodo.equalsIgnoreCase("pix")|| metodo.equalsIgnoreCase("especie")|| metodo.equalsIgnoreCase("transferencia")||metodo.equalsIgnoreCase("debito")){
            valor = valorP * 0.95;

            System.out.println("com o desconto de 5% o valor foi de " + valor);
        } else if (metodo .equalsIgnoreCase("credito")) {
            valor = valorP/3;
            System.out.println("parceldo em até 3 vezes"+ valor);


        }


    }
}