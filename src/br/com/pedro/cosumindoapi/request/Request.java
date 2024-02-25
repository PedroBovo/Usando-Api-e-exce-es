package br.com.pedro.cosumindoapi.request;

import br.com.pedro.cosumindoapi.exeption.ErroconsultaGitHubExeption;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {

    public String response(String endereco) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode()== 404){
            throw new ErroconsultaGitHubExeption("Usuario nao encontrado tente com outro");

        }
        return response.body();
    }
}
