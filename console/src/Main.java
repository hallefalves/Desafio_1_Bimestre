import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Console console = new Console();

    public static void main(String[] args) throws IOException, ParseException {


        Scanner scanner = new Scanner(System.in);

        Validacoes valida = new Validacoes();

        FileInputStream arquivo = new FileInputStream("dados.txt");

        ArrayList<Item> conteudo = Import.read();

        console.RodarConsole(conteudo);
    }

}



