
package com.example.demo.service;

import com.example.demo.model.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Esta anotação indica que esta classe é um serviço Spring
@Service
public class LivroService {
    // Lista para armazenar os livros em memória
    private List<Livro> livros = new ArrayList<>();
    // Variável para gerar IDs incrementais
    private long contador = 0;

    // Método para obter todos os livros
    public List<Livro> obterTodosLivros() {
        return livros;
    }

    // Método para obter um livro pelo ID
    public Livro obterLivroPorId(Long id) {
        // Loop para encontrar o livro pelo ID
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId().equals(id)) {
                return livros.get(i);
            }
        }
        // Retorna null se o livro não for encontrado
        return null;
    }

    // Método para criar um novo livro
    public Livro criarLivro(Livro livro) {
        // Define o ID do livro como contador + 1
        livro.setId(contador + 1);
        // Incrementa o contador
        contador++;
        // Adiciona o livro à lista
        livros.add(livro);
        return livro;
    }

    // Método para atualizar um livro existente
    public Livro atualizarLivro(Long id, Livro detalhesLivro) {
        // Obtém o livro pelo ID
        Livro livro = obterLivroPorId(id);
        if (livro != null) {
            // Atualiza os detalhes do livro
            livro.setTitulo(detalhesLivro.getTitulo());
            livro.setAutor(detalhesLivro.getAutor());
            livro.setIsbn(detalhesLivro.getIsbn());
            return livro;
        }
        // Retorna null se o livro não for encontrado
        return null;
    }

    // Método para deletar um livro pelo ID
    public boolean deletarLivro(Long id) {
        // Loop para encontrar e remover o livro pelo ID
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId().equals(id)) {
                livros.remove(i);
                return true;
            }
        }
        // Retorna false se o livro não for encontrado
        return false;
    }
}
