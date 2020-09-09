public enum Tamanho {

    PP, P, M, G, GG;

    public static Tamanho letraTamanho(String letra){

        switch (letra) {
            case "PP" -> {
                return Tamanho.PP;
            }
            case "P" -> {
                return Tamanho.P;
            }
            case "M" -> {
                return Tamanho.M;
            }
            case "G" -> {
                return Tamanho.G;
            }
            case "GG" -> {
                return Tamanho.GG;
            }
            default -> {
                System.out.println("Tamanho inválido");
                return null;
            }
        }
    }
}
