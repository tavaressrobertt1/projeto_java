import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner inUser = new Scanner(System.in);
       ArrayList<String> listaCompras = new ArrayList<>();
       
       int opcaoLista = 0;
       int opcao = 0;
       String novoItem = ""; 
       
       
            do{
                try{
                    System.out.println("""
                    Bem vindos ao programa lista de compras

                    Escolha a opção desejada:

                    1 - Criar uma nova lista de compras
                    2 - Sair

                    """);
                    opcaoLista = inUser.nextInt();
                    inUser.nextLine();

                    switch(opcaoLista){
                        case 1 -> {
                            System.out.println("Lista Criada com sucesso");

                            do{
                                System.out.println("""
                                        Escolha a opção desejada:
                                        1 - Adicionar um item da lista
                                        2 - Ver a sua lista
                                        3 - Sair
                                        """);
                                    
                                opcao = inUser.nextInt();
                                inUser.nextLine();
                                    
                                switch(opcao){
                                case 1 -> {
                                    System.out.println("Você escolheu criar um item da lista ");
                                    System.out.println("Digite o nome do produto: ");                                    

                                    novoItem = inUser.nextLine();
                                    listaCompras.add(novoItem);

                                }
                                case 2 ->{
                                    System.out.println("Você escolheu ver a lista");
                                    for(String item : listaCompras){
                                        System.out.printf("%s \n", item);
                                    }
                                }

                                }
                           
                             }while(opcao !=3);                    


                            
                        }
                        case 2 -> System.out.println("Obrigado por usar o nosso sistema");
                        default -> System.out.println("opção invalida");
                    }
            
                }catch(Exception erro){
                    System.out.println("Erro!!! Entrada invalida");
                    inUser.nextLine();
                    opcaoLista = 1;
                }
            
            }while(opcaoLista != 2);        
       
       inUser.close();
    }
}