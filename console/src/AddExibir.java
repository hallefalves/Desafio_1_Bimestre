import java.util.Scanner;

public class AddExibir extends Telas_Mãe
{
    Scanner in = new Scanner(System.in);
    String resposta;
    boolean entradaCorreta = false;
    public String  AddouExibir ()
    {
        System.out.println("Gostaria de adicionar um produto ou consultar a lista de produtos?");
        System.out.println("Digite ADD para adicionar e LISTAR consultar a lista");
        do {
                System.out.print("Digite sua resposta: ");
                resposta = in.next();

                if (resposta.trim().toUpperCase().equals("ADD")) {
                    System.out.println("Okay! Vamos adicionar um novo produto!");
                    EnterParaContinuar();
                    entradaCorreta = true;

                } else if (resposta.trim().toUpperCase().equals("LISTAR")) {
                    System.out.println("Okay! Vamos Listar todos os produtos!");
                    entradaCorreta = true;
                } else {
                    System.out.println("Por favor digite um valor válido! ADD para adicionar um novo produto ou LISTAR para visualizar os produtos");
                    entradaCorreta = false;
                }
        }
        while (!entradaCorreta);
        FinalizarTela();
        return resposta;
    }


}
