public enum Cor {

    Azul, Amarelo, Vermelho, Preto, Roxo, Marrom, Branco, Rosa, Cinza,
    Laranja;

    public static Cor idCor (String cor)
    {
        switch (cor)
        {
            case "Azul": return Azul;
            case "Amarelo": return  Amarelo;
            case "Vermelho" : return Vermelho;
            case "Preto" : return Preto;
            case "Roxo" : return Roxo;
            case "Marrom" : return Marrom;
            case "Branco" : return Branco;
            case "Rosa" : return Rosa;
            case "Cinza" : return Cinza;
            case "Laranja" : return Laranja;
            default : return null;
        }
    }

    public static Cor numCor (int num){

        switch (num) {
            case 1 -> {
                return Cor.Azul;
            }
            case 2 -> {
                return Cor.Amarelo;
            }
            case 3 -> {
                return Cor.Vermelho;
            }
            case 4 -> {
                return Cor.Preto;
            }
            case 5 -> {
                return Cor.Roxo;
            }
            case 6 -> {
                return Cor.Marrom;
            }
            case 7 -> {
                return Cor.Branco;
            }
            case 8 -> {
                return Cor.Rosa;
            }
            case 9 -> {
                return Cor.Cinza;
            }
            case 10 -> {
                return Cor.Laranja;
            }
            default -> {
                return null;
            }
        }
    }

}
