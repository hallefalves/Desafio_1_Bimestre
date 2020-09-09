import java.util.Scanner;

public class Telas_Mãe {

    public static Scanner in = new Scanner(System.in);

    public static void EnterParaContinuar()
    {
        System.out.println("Aperte enter para continuar :D");
        in.nextLine();
    }
    public void LimpaTela ()
    {
        for (int A = 0; A < 50; A++)
        {
            System.out.print("\n");
        }

    }
    public void FecharTela(){

        try {
            finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void FinalizarTela()
    {
        LimpaTela();
        FecharTela();
    }

}
