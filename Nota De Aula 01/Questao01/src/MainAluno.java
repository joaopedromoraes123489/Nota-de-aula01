import java.util.Scanner;
public  class MainAluno {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        System.out.println("insira a sua primeira nota : ");
        a.setNota1(sc.nextDouble());

        System.out.println("insira a sua segunda nota : ");
        a.setNota2(sc.nextDouble());

        System.out.println("insira a sua terceira nota : ");
        a.setNota3(sc.nextDouble());


        a.geradordemedia();
        System.out.println( " a sua media foi : " + a.media);

    }
}