## 📚 API REST de Livros

Esta é uma API REST _simples_ para **gerenciar** informações sobre **livros**, criada com **Spring Boot**.

## Endpoints

### 1\. Obter todos os livros

**Requisição:**

```plaintext
curl -X GET http://localhost:8080/api/livros
```

### 2\. Obter um livro pelo ID

**Requisição:**

```plaintext
curl -X GET http://localhost:8080/api/livros/{id}
```

**Exemplo:**

```plaintext
curl -X GET http://localhost:8080/api/livros/1
```

### 3\. Criar um novo livro

**Requisição:**

```plaintext
curl -X POST http://localhost:8080/api/livros -H "Content-Type: application/json" -d '{"titulo": "Livro Exemplo", "autor": "Autor Exemplo", "isbn": "123-456-789"}'
```

### 4\. Atualizar um livro existente

**Requisição:**

```plaintext
curl -X PUT http://localhost:8080/api/livros/{id} -H "Content-Type: application/json" -d '{"titulo": "Livro Atualizado", "autor": "Autor Atualizado", "isbn": "987-654-321"}'
```

**Exemplo:**

```plaintext
curl -X PUT http://localhost:8080/api/livros/1 -H "Content-Type: application/json" -d '{"titulo": "Livro Atualizado", "autor": "Autor Atualizado", "isbn": "987-654-321"}'
```

### 5\. Deletar um livro pelo ID

**Requisição:**

```plaintext
curl -X DELETE http://localhost:8080/api/livros/{id}
```

**Exemplo:**

```plaintext
curl -X DELETE http://localhost:8080/api/livros/1
```

## 🚀 Como Executar

1.  Clone o repositório.
2.  Navegue até o diretório do projeto.
3.  Execute o comando `./gradlew bootRun` para iniciar a aplicação.
4.  Use os exemplos de chamadas `curl` acima para interagir com a API.