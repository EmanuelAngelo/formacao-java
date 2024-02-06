public class Main {
    public static void main (String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de lançamento: "+ ano);

        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                    Filme de aventura com galã dos anos 80
                    Filme Top Gun Maverick
                    Filmaço    
                """;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);

    }

}