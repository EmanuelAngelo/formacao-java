package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao()>=4){
            System.out.println("Esta entre os melhores do momento");
        } else if (classificavel.getClassificacao() >=2){
            System.out.println("Bem avaliado no momento");
        } else {
            System.out.println("Coloque para assistir depois.");
        }
    }
}
