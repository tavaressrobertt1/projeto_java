import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o seu nome");
        String nome = entrada.nextLine();

        System.out.printf("O nome informado e: %s ", nome);



        entrada.close();
    }
}
