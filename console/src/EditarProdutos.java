import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;


public class EditarProdutos extends Telas_Mãe
{
    public static String codigo;
    public static String resposta;
    public static boolean entradaCorreta = false;

    public static String deletarOuEditar(ArrayList<Item> listinha)
    {
        System.out.print("Por favor digite o código do produto que deseja editar: ");
        do {
            try {
                codigo = in.nextLine();
                int codigoInt = Integer.parseInt(codigo);
                if (listinha.stream().anyMatch(x -> x.getId() == (Integer.parseInt(codigo))))
                {
                    System.out.println("Ótimo! Vamos revisar o item " + codigo +" antes de modifica-lo");
                    System.out.println(listinha.get(codigoInt - 1).toString());
                    EditarProdutos editar = new EditarProdutos();
                    editar.deletarProduto(listinha);
                    entradaCorreta = true;
                }
                else
                {
                    System.out.println("hum... Não encontramos esse código :( Vamos tentar novamente!");
                }
                entradaCorreta = true;

            } catch (Exception erro) {
                System.out.println("Por favor digite um código válido: ");
                EnterParaContinuar();
            }
        }
        while (!entradaCorreta);
        return  codigo;
    }

    public void  deletarProduto (ArrayList<Item> listinha) throws IOException, ParseException {


        do {
            System.out.println("Gostaria de deletar o produto "+ codigo + " ? [SIM/NÃO]");
            resposta = in.next();

            if (resposta.trim().toUpperCase().equals("SIM"))
            {
                System.out.println("Okay! Tchau tchau produto!");
                listinha.remove((Item)listinha.stream().filter(x -> x.getId() == (Integer.parseInt(codigo))).toArray()[0]);
                EnterParaContinuar();
                entradaCorreta = true;

            }
            else if (resposta.trim().toUpperCase().equals("NÃO"))
            {
                System.out.println("Então vamos modificar o produto :D");
                System.out.println();
                EditarProdutos editar = new EditarProdutos();
                editar.editarProduto(listinha, codigo);
                entradaCorreta = true;
            }
            else
            {
                System.out.println("Por favor digite um valor válido! SIM para deletar ou NÃO editar as informações do produto");
                entradaCorreta = false;
            }
        }
        while (!entradaCorreta);

    }

    public void editarProduto (ArrayList<Item> listinha, String codigo) throws IOException, ParseException {
        try {
            int c = Integer.parseInt(codigo);
            System.out.println("Vamos começar a edição: ");
            Cadastra cd = new Cadastra();
            cd.cadastro((Item) listinha.stream().filter(x -> x.getId() == (Integer.parseInt(codigo))).toArray()[0]);
            System.out.println("Salvamos sua alterações <3");
        }
        catch (Exception erro)
        {
            //Código validado no método deletarOuEditar
        }
    }
}
