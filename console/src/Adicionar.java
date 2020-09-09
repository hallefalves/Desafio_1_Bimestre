import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Adicionar  extends Telas_Mãe
{
    public void Cadastrar (ArrayList<Item> listinha) throws IOException, ParseException {
        System.out.println("Vamos começar o cadastro :D");
        Cadastra x = new Cadastra();
        listinha.add(x.cadastro(null));

    }

}
