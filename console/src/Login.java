/** @author Julia **/
/** Placeholder Login **/
import java.util.Scanner;
public class Login extends Telas_Mãe
{

    public void TelaLogin ()
    {
        Boolean LoginCorreto;
        System.out.println("Bom dia usuárie :D");
        System.out.println("Por Favor informe as suas credenciais");

        do {
            Scanner in = new Scanner(System.in);
            LoginCorreto = false;
            System.out.print("Usuário: ");
            String user = in.nextLine();
            System.out.print("Senha: ");
            String senha = in.nextLine();
            System.out.print("\n");

            if (user.trim().toLowerCase().equals("admin") && senha.trim().toLowerCase().equals("admin"))
            {
                System.out.println("Bem vinde! Vamos começar :D");
                LoginCorreto = true;
                EnterParaContinuar();

            }
            else {
                System.out.println("Por Favor informe as suas credenciais Corretamente");
            }
        }
        while (!LoginCorreto);

        FinalizarTela();

    }
}
