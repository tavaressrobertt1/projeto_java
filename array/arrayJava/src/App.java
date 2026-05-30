import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        // Adiciona elementos a lista >>--->> add()
        // nomes.add("Robert");
        // nomes.add("Tavares");

        // Acessar um elemento get(indice)
        // System.out.println(nomes.get(2));


        // Alterar um item >>---->> .set()
        // nomes.set(0, "rob");
        

        // Remover um item da lista >>---->> .remove()
        // nomes.add("remover este");
        // nomes.remove(3);
        
        // tamanho da lista >>--->> size()
        // System.out.println(nomes.size());

        // apagar lista .clear()
        // nomes.clear();
        // System.out.println(nomes);

        // verificar se existe 
        System.out.println(nomes.contains("Tavares"));
    }
}
