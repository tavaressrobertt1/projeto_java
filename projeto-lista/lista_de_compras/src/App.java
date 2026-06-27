import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
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
                    opcaoLista = entrada.nextInt();
                    entrada.nextLine();

                    switch(opcaoLista){
                        case 1 -> {
                            System.out.println("Lista Criada com sucesso");

                            do{
                                System.out.println("""
                                        Escolha a opção desejada:
                                        1 - Adicionar um item da lista
                                        2 - Ver a sua lista
                                        3 - Remover um item da lista
                                        4 - Alterar um item da lista
                                        5 - Sair
                                        """);
                                    
                                opcao = entrada.nextInt();
                                entrada.nextLine();
                                    
                                switch(opcao){
                                    case 1 -> {
                                        System.out.println("Você escolheu criar um item da lista ");
                                        System.out.println("Digite o nome do produto: ");                                    

                                        novoItem = entrada.nextLine();
                                        listaCompras.add(novoItem);
                                    }
                                    case 2 -> {
                                        System.out.println("Você escolheu ver a lista");
                                        if (listaCompras.isEmpty()) {
                                            System.out.println("Não há nenhuma lista criada.");
                                        } else {
                                            for (int i = 0; i < listaCompras.size(); i++) {
                                                System.out.println((i + 1) + " - " + listaCompras.get(i));
                                            }
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Você escolheu remover um item da lista");

                                        if (listaCompras.isEmpty()) {
                                            System.out.println("A lista está vazia, não há nada para remover.");
                                        } else {
                                            for (int i = 0; i < listaCompras.size(); i++) {
                                                System.out.println((i + 1) + " - " + listaCompras.get(i));
                                            }

                                            System.out.println("Digite o número do item que deseja remover: ");
                                            int numeroRemover = entrada.nextInt();
                                            entrada.nextLine();
                                            int indiceRemover = numeroRemover - 1;

                                            if (indiceRemover >= 0 && indiceRemover < listaCompras.size()) {
                                                String itemRemovido = listaCompras.remove(indiceRemover);
                                                System.out.println("\"" + itemRemovido + "\" foi removido da lista!");
                                            } else {
                                                System.out.println("Número inválido.");
                                            }
                                        }
                                    }
                                    case 4 -> {
                                        System.out.println("Você escolheu alterar um item da lista");
                                        if (listaCompras.isEmpty()) {
                                            System.out.println("A lista está vazia, não há nada para alterar.");
                                        } else {
                                            for (int i = 0; i < listaCompras.size(); i++) {
                                                System.out.println((i + 1) + " - " + listaCompras.get(i));
                                            }

                                            System.out.println("Digite o número do item que deseja alterar: ");
                                            int numeroAlterar = entrada.nextInt();
                                            entrada.nextLine();
                                            int indiceAlterar = numeroAlterar - 1;

                                            if (indiceAlterar >= 0 && indiceAlterar < listaCompras.size()) {
                                                System.out.println("Digite o novo nome do item: ");
                                                String novoNome = entrada.nextLine();
                                                String nomeAntigo = listaCompras.get(indiceAlterar);
                                                listaCompras.set(indiceAlterar, novoNome);

                                                System.out.println("\"" + nomeAntigo + "\" foi alterado para \"" + novoNome + "\"!");
                                            } else {
                                                System.out.println("Número inválido.");
                                            }
                                        }
                                    }
                                    case 5 -> System.out.println("Voltando ao menu principal...");
                                    default -> System.out.println("Opção inválida");
                                }
                            } while(opcao != 5);
                        }
                        case 2 -> System.out.println("Obrigado por usar o nosso sistema");
                        default -> System.out.println("opção invalida");
                    }
            
                }catch(Exception erro){
                    System.out.println("Erro!!! Entrada invalida");
                    entrada.nextLine();
                    opcaoLista = 1;
                }
            
            }while(opcaoLista != 2);        
       
       entrada.close();
    }
}
