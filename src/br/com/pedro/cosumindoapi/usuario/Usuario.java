package br.com.pedro.cosumindoapi.usuario;

import br.com.pedro.cosumindoapi.exeption.ErroconsultaGitHubExeption;

import java.util.Scanner;

public class Usuario {

    private String nome;
    private int id;
    private String url;

    public Usuario(UsuarioRecord usuarioRecord) {
        this.nome = usuarioRecord.login();

        this.id =Integer.valueOf(usuarioRecord.id());
        this.url = usuarioRecord.url();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
