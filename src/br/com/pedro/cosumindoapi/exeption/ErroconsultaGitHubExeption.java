package br.com.pedro.cosumindoapi.exeption;

public class ErroconsultaGitHubExeption extends RuntimeException {
    private String mensagem;
    public ErroconsultaGitHubExeption(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
