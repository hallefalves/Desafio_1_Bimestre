import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class  Cadastra {

    public Item cadastro(Item edit) throws ParseException, IOException {

        Scanner scanner = new Scanner(System.in);

        Validacoes valida = new Validacoes();

        Item item = new Item();

        ArrayList<Item> conteudo = Import.read();

        try {
            item.setId(1 + conteudo.get(conteudo.size() - 1).getId());
            if (edit != null){
                item = edit;
            }
        }catch (Exception ex){
            //arquivo vazio
        }

        if (item.getId() == null)
            item.setId(1);

        boolean aux1 = true;
        
        while (aux1) {

            System.out.println("Digite o tipo de item: ");

            String tipoItem = scanner.nextLine();

            if (valida.validacaoExiste(tipoItem)) {
                item.setTipo(tipoItem);
                aux1 = false;
            } else {
                System.out.println("Preencha os dados");
            }

        }

        boolean aux2 = true;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        while (aux2) {

            System.out.println("Digite a data de entrada: ");

            String dataEntrada = scanner.nextLine();

                if (valida.validacaoData(dataEntrada)) {
                    try {
                        item.setDataDeEntrada(format.parse(dataEntrada));
                        aux2 = false;
                    }
                    catch (Exception erro)
                    {
                        System.out.println("huum... achamos que isso não é uma data...");
                    }

                } else {
                    System.out.println("Vamos tentar digitar a data novamente!");
                }

        }

        boolean aux3 = true;

        while (aux3) {

            System.out.println("Digite o local de compra: ");

            String localCompra = scanner.nextLine();

            if (valida.validacaoExiste(localCompra)) {
                item.setLocalDeCompra(localCompra);
                aux3 = false;
            } else {
                System.out.println("Preencha os dados");
            }
        }

        boolean aux4 = true;

        while (aux4) {

            System.out.println("Digite a marca: ");

            String marca = scanner.nextLine();

            if (valida.validacaoExiste(marca)) {
                item.setMarca(marca);
                aux4 = false;
            } else {
                System.out.println("Preencha os dados");
            }
        }

        boolean aux5 = true;

        while (aux5) {

            System.out.println("Digite as características: ");

            String caracteristicas = scanner.nextLine();

            if (valida.validacaoExiste(caracteristicas)) {
                item.setCaracteristicas(caracteristicas);
                aux5 = false;
            } else {
                System.out.println("Preencha os dados");
            }
        }

        String s;

        boolean aux2_5 = true;

        while (aux2_5) {

            System.out.println("Digite o tamanho do item: ");

            System.out.println("PP - P - M - G - GG");

            s = scanner.nextLine().toUpperCase();

            if (valida.validacaoExiste(s)) {
                if (Tamanho.letraTamanho(s) != null) {
                    item.setTamanho(Tamanho.letraTamanho(s));
                    aux2_5 = false;
                }
            } else {
                System.out.println("Preencha os dados");
            }

        }

        String num;

        boolean aux6 = true;

        while (aux6) {

            int n = 0;

            System.out.println("Digite o número da cor: ");

            System.out.println("1 - Azul");
            System.out.println("2 - Amarelo");
            System.out.println("3 - Vermelho");
            System.out.println("4 - Preto");
            System.out.println("5 - Roxo");
            System.out.println("6 - Marrom");
            System.out.println("7 - Branco");
            System.out.println("8 - Rosa");
            System.out.println("9 - Cinza");
            System.out.println("10 - Laranja");

            num = scanner.nextLine();


            if (valida.validacaoInt(num)) {
                n = Integer.parseInt(num);
                if (Cor.numCor(n) != null) {
                    item.setCor(Cor.numCor(n));
                    aux6 = false;
                } else {
                    System.out.println("Opção inválida");
                }
            } else {
                System.out.println("Número inválido");
            }

        }

        boolean aux7 = true;

        while (aux7) {

            System.out.println("Digite o valor de Etiqueta: ");

            String valEtiqueta = scanner.nextLine();

            if (valida.validacaoExiste(valEtiqueta)) {

                if(valEtiqueta.indexOf(",") != -1)
                {
                    valEtiqueta = valEtiqueta.replace(",",".");
                }

                boolean aux71 = true;

                while (aux71) {

                    if (valida.validacaoFloat(valEtiqueta)) {
                        item.setValorEtiqueta(Float.valueOf(valEtiqueta));
                        aux71 = false;
                        aux7 = false;
                    } else {
                        System.out.println("Digite um número");
                        aux71 = false;
                    }
                }
            } else {
                System.out.println("Preencha os dados");
            }
        }

        boolean aux8 = true;

        while (aux8) {

            System.out.println("Digite o valor Pago: ");

            String valPago = scanner.nextLine();

            if (valida.validacaoExiste(valPago)) {

                if(valPago.indexOf(",") != -1)
                {
                    valPago = valPago.replace(",",".");
                }

                boolean aux81 = true;

                while (aux81) {

                    if (valida.validacaoFloat(valPago)) {
                        item.setValorPago(Float.valueOf(valPago));
                        aux81 = false;
                        aux8 = false;
                    } else {
                        System.out.println("Digite um número");
                        aux81 = false;
                    }
                }
            } else {
                System.out.println("Preencha os dados");
            }
        }

        // Faz o lucro ser valorEtiqueta * 2

        item.setValorLucro(item.getValorEtiqueta() * 2);

        boolean aux9 = true;

        while (aux9) {

            System.out.println("Digite o valor do Preço Sugerido: ");

            String precoSugerido = scanner.nextLine();

            if(precoSugerido.indexOf(",") != -1)
            {
                precoSugerido = precoSugerido.replace(",",".");
            }

            try {

                if (precoSugerido != null) {
                    item.setPrecoSugerido(Float.valueOf(precoSugerido));

                    aux9 = false;
                } else
                    throw new Exception();

            } catch (Exception ex) {

                System.out.println("Valor inválido");
            }
        }

        System.out.println("Produto salvo com sucesso! Boas sorte nas vendas :D");
        return item;
    }
}
