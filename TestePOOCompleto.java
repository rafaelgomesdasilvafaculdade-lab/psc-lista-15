import java.util.ArrayList;

public class TestePOOCompleto {

    public static void main(String[] args) {

      
        Filme filme = new Filme("Interestelar", 2014, 169, "Christopher Nolan");
        Musica musica = new Musica("Bohemian Rhapsody", 1975, 6, "Queen");

        
        System.out.println("=== TESTE 1: Polimorfismo com ItemMidia ===");

        ArrayList<ItemMidia> listaMidias = new ArrayList<>();
        listaMidias.add(filme);
        listaMidias.add(musica);

        for (ItemMidia item : listaMidias) {
            item.reproduzir(); 
        }

        
        System.out.println("\n=== TESTE 2: Polimorfismo com Avaliavel ===");

        Avaliavel avaliavel;

        avaliavel = filme;
        avaliavel.receberAvaliacao(10);

        avaliavel = musica;
        avaliavel.receberAvaliacao(5);

        
        System.out.println("\n=== TESTE 3: Encapsulamento ===");

        System.out.println("Tentando definir duração do filme para -50...");
        filme.setDuracao(-50); 

        System.out.println("Duração atual do filme: " + filme.getDuracao());
    }
}
