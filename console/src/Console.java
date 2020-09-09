import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Console extends Telas_Mãe
{

    public void RodarConsole (ArrayList<Item> listinha) throws IOException, ParseException {

        Login login = new Login();
        login.TelaLogin();
        while (true) {

            LimpaTela();
            AddExibir addExibir = new AddExibir();
            String addOuMod;
            addOuMod = addExibir.AddouExibir();

            if (addOuMod.trim().toUpperCase().equals("ADD")) {
                Adicionar adicionar = new Adicionar();
                adicionar.Cadastrar(listinha);
            } else {
                ExibirItens exibirItens = new ExibirItens();
                exibirItens.ListarItens(listinha);
            }

            ModDel modDel = new ModDel();
            String modificardeletar = modDel.ModificarDeletar();

            if (modificardeletar.trim().toUpperCase().equals("SIM")) {

                EditarProdutos editarProdutos = new EditarProdutos();
                String código = editarProdutos.deletarOuEditar(listinha);

            } else {
                System.out.println("Okay, vamos salvar tudinho, fique tranquile :D");
                Export.write(listinha);
                FecharTela();
            }
        }

    }

}
