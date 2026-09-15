
// Define o pacote onde esta classe está localizada
package com.example.controrller.controller;

// Importa a anotação responsável por mapear requisições HTTP do tipo GET
import org.springframework.web.bind.annotation.GetMapping;

// Importa a anotação que transforma esta classe em um Controller REST
import org.springframework.web.bind.annotation.RestController;


// Informa ao Spring que esta classe receberá requisições HTTP
// e retornará diretamente dados como texto ou JSON
@RestController
public class OlaController {

    // Define que este método será executado quando o usuário
    // acessar o endereço:
    // http://localhost:8080/ola
    //
    // Como estamos utilizando GetMapping,
    // a requisição deve ser do tipo GET.
    @GetMapping("/ola")
    public String ola() {

        // Retorna uma String diretamente para o navegador
        return "Olá, Spring Boot!";
    }

}
