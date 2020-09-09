import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Export {
    static void write(ArrayList<Item> conteudo) throws IOException {

        PrintWriter pw = new PrintWriter("dados.txt");

        for (int i = 0; i < conteudo.size(); i++) {

            try {
                FileWriter g = new FileWriter("dados.txt", true);

                PrintWriter gravar = new PrintWriter((g));

                gravar.print(conteudo.get(i).getId());
                gravar.print("|");
                gravar.print(conteudo.get(i).getTipo());
                gravar.print("|");
                SimpleDateFormat ss = new SimpleDateFormat("dd/MM/yyyy");
                gravar.print(ss.format(conteudo.get(i).getDataDeEntrada()));
                gravar.print("|");
                gravar.print(conteudo.get(i).getLocalDeCompra());
                gravar.print("|");
                gravar.print(conteudo.get(i).getMarca());
                gravar.print("|");
                gravar.print(conteudo.get(i).getCaracteristicas());
                gravar.print("|");
                gravar.print(conteudo.get(i).getTamanho());
                gravar.print("|");
                gravar.print(conteudo.get(i).getCor());
                gravar.print("|");
                gravar.print(conteudo.get(i).getValorEtiqueta());
                gravar.print("|");
                gravar.print(conteudo.get(i).getValorPago());
                gravar.print("|");
                gravar.print(conteudo.get(i).getValorLucro());
                gravar.print("|");
                gravar.print(conteudo.get(i).getPrecoSugerido());
                gravar.print("\r\n");
                g.close();
            } catch (Exception ex) {
                System.out.println("Erro na gravação do arquivo");
            }
        }
    }
}
