import java.util.Scanner;

public class ModDel extends Telas_Mãe
{
    Scanner in = new Scanner(System.in);
    String resposta;
    boolean entradaCorreta = false;
    public String  ModificarDeletar ()
    {
        System.out.println("Gostaria de deletar um produto ou modificar-lo? [SIM/NÃO]");
        do {

            resposta = in.next();
            if (resposta.trim().toUpperCase().equals("SIM"))
            {
                System.out.println("Okay! Vamos editar seus produtos!");
                EnterParaContinuar();
                entradaCorreta = true;

            }
            else if (resposta.trim().toUpperCase().equals("NÃO"))
            {
                System.out.println("Okay! Vamos para a tela inicial :D");
                EnterParaContinuar();
                entradaCorreta = true;
            }
            else
            {
                System.out.println("Por favor digite um valor válido! SIM para deletar ou editar um produto" +
                        " ou NÃO para salvar todas as alterações voltar a tela inicial");

                entradaCorreta = false;
            }
        }
        while (!entradaCorreta);
        FinalizarTela();
        return resposta;
    }
}
