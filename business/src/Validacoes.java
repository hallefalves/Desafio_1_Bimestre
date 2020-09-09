import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Validacoes {

    public boolean validacaoExiste(String valor) {

        if (valor.isEmpty()) {
            return false;
        } else
            return true;

    }

    public boolean validacaoFloat(String valor) {
        try {
            float convertido;

            if (valor.indexOf(",") != -1) {
                valor = valor.replace(",", ".");
            }
            convertido = Float.parseFloat(valor);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean validacaoInt(String valor) {
        try {
            int convertido;
            convertido = Integer.parseInt(valor);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean validacaoData(String valor) {

        try {

            DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataVerificada = LocalDate.parse(valor, data);
            if (dataVerificada.compareTo(LocalDate.now()) <= 0) {
                return true;
            }
            else {
                System.out.println("huum... Ainda não podemos agendar estoque, se quiser adicionar essa função, contate seu programadore!");
                return false;
            }

        } catch (Exception erro) {
            System.out.println("Algo deu errado :( ");
            return false;
        }

    }



    public boolean existeArquivo() {

        try {
            FileInputStream arq = new FileInputStream("dados.txt");
            System.out.println("O arquivo texto existe, iniciando o programa");
            return true;
        }
        catch (Exception ex){
            System.out.println("O arquivo texto não existe, criando o arquivo e iniciando o programa");
            return false;
        }

    }

}
