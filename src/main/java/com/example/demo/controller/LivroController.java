
package com.example.demo.controller;

import com.example.demo.model.Livro;
import com.example.demo.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Esta anotação indica que esta classe é um controlador REST
@RestController
// Esta anotação define a URL base para todos os endpoints deste controlador
@RequestMapping("/api/livros")
public class LivroController {

    // Esta anotação injeta uma instância do serviço nesta classe
    @Autowired
    private LivroService livroService;

    // Este método lida com requisições GET para /api/livros e retorna todos os livros
    @GetMapping
    public List<Livro> obterTodosLivros() {
        return livroService.obterTodosLivros();
    }

    // Este método lida com requisições GET para /api/livros/{id} e retorna um livro pelo ID
    // A anotação @PathVariable indica que o valor da variável id será extraído da URL
    @GetMapping("/{id}")
    public Livro obterLivroPorId(@PathVariable Long id) {
        return livroService.obterLivroPorId(id);
    }

    // Este método lida com requisições POST para /api/livros e cria um novo livro
    // A anotação @RequestBody indica que o corpo da requisição será convertido em um objeto Livro
    @PostMapping
    public Livro criarLivro(@RequestBody Livro livro) {
        return livroService.criarLivro(livro);
    }

    // Este método lida com requisições PUT para /api/livros/{id} e atualiza um livro existente
    // A anotação @PathVariable indica que o valor da variável id será extraído da URL
    // A anotação @RequestBody indica que o corpo da requisição será convertido em um objeto Livro
    @PutMapping("/{id}")
    public Livro atualizarLivro(@PathVariable Long id, @RequestBody Livro detalhesLivro) {
        return livroService.atualizarLivro(id, detalhesLivro);
    }

    // Este método lida com requisições DELETE para /api/livros/{id} e deleta um livro pelo ID
    // A anotação @PathVariable indica que o valor da variável id será extraído da URL
    @DeleteMapping("/{id}")
    public boolean deletarLivro(@PathVariable Long id) {
        return livroService.deletarLivro(id);
    }
}
