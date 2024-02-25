package br.com.pedro.cosumindoapi;

import br.com.pedro.cosumindoapi.exeption.ErroconsultaGitHubExeption;
import br.com.pedro.cosumindoapi.request.Request;
import br.com.pedro.cosumindoapi.usuario.Usuario;
import br.com.pedro.cosumindoapi.usuario.UsuarioRecord;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class ConsumindoApiGitHub {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome do usuario que você quer achar: " );
        String nome= s.nextLine();
        String endereco = "https://api.github.com/users/" + nome;
        try {
            Request request = new Request();
            Gson gson = new Gson();
            UsuarioRecord usuarioRecord = gson.fromJson(request.response(endereco), UsuarioRecord.class);
            Usuario usuario = new Usuario(usuarioRecord);
            System.out.println(usuario);
        }catch (ErroconsultaGitHubExeption e){
            System.out.println(e.getMessage());
        }



    }
}
