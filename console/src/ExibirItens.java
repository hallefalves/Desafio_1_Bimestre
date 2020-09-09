import java.util.ArrayList;

public class ExibirItens extends Telas_Mãe
{
    public void ListarItens (ArrayList<Item> listinha)
    {
        System.out.println("Segue todos os itens do seu estoque: ");
        System.out.println();
        for (int i = 0; i < listinha.size(); i++) {
            System.out.println(listinha.get(i).toString());
        }
    }
}
