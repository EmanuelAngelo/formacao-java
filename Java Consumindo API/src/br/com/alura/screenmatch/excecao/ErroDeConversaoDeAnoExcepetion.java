package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoExcepetion extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExcepetion(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
