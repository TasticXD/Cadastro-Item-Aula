package produtos;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item foi cadastrado.");
        } else {
            for (Item item : itens) {
                System.out.println(item);
            }
        }
    }
}
