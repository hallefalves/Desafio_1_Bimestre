import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Float.parseFloat;

public class Import {

    static ArrayList<Item> read() throws IOException, ParseException {
        FileInputStream fis = new FileInputStream("dados.txt");
        Scanner s = new Scanner(fis);
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()){
            list.add(s.nextLine());
        }
        ArrayList<Item> items = new ArrayList<Item>();
        for(int i = 0; i<list.size(); i++) {
            Item item = new Item();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String[] objeto = list.get(i).split(Pattern.quote("|"));
            item.setId(Integer.valueOf((objeto[0])));
            item.setTipo(objeto[1]);
            item.setDataDeEntrada(format.parse(objeto[2]));
            item.setLocalDeCompra(objeto[3]);
            item.setMarca(objeto[4]);
            item.setCaracteristicas(objeto[5]);
            item.setTamanho(Tamanho.letraTamanho(objeto[6]));
            item.setCor(Cor.numCor(converteCorEmNum(objeto[7])));
            item.setValorEtiqueta(parseFloat(objeto[8]));
            item.setValorPago(parseFloat(objeto[9]));
            item.setValorLucro(parseFloat(objeto[10]));
            item.setPrecoSugerido(parseFloat(objeto[11]));
            items.add(item);
        }
        s.close();
        return items;
    }

    public static int converteCorEmNum(String cor){
        if (cor.toUpperCase().equals("AZUL")){
            return 1;
        }
        else if (cor.toUpperCase().equals("AMARELO")){
            return 2;
        }
        else if (cor.toUpperCase().equals("VERMELHO")){
            return 3;
        }
        else if (cor.toUpperCase().equals("PRETO")){
            return 4;
        }
        else if (cor.toUpperCase().equals("ROXO")){
            return 5;
        }
        else if (cor.toUpperCase().equals("MARROM")){
            return 6;
        }
        else if (cor.toUpperCase().equals("BRANCO")){
            return 7;
        }
        else if (cor.toUpperCase().equals("ROSA")){
            return 8;
        }
        else if (cor.toUpperCase().equals("CINZA")){
            return 9;
        }
        else if (cor.toUpperCase().equals("LARANJA")){
            return 10;
        }
        else{
            return-1;
        }
    }
}

