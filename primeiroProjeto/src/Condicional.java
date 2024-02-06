public class Condicional {
    public static void main(String[] args) {
       int anoDeLancamento = 2022;
       boolean incluidoNoPlano = false;
       double notaDoFilme = 8.1;
       String tipoPlano = "plus";

       if(anoDeLancamento >= 2022){
           System.out.println("Lançamento que os clientes estao curtindo!");
       }
       else {
           System.out.println("Nao tem");
       }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("pague locação");
            }
        }
    }

