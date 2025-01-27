## Projeto Gerenciador de lista de Jogos 

### Descrição
Este projeto tem como objetivo criar uma aplicação para gerenciar uma lista ordenada de jogos, permitindo que os usuários alterem a posição dos jogos na lista. A movimentação será realizada trocando os identificadores ou índices no banco de dados, atualizando a ordem conforme as alterações feitas.

Cada jogo incluirá informações como título, ano, gênero, plataforma, descrição pequena e descrição grande. A aplicação permitirá que os jogos sejam movidos para cima ou para baixo na lista, refletindo essas mudanças no banco de dados de forma eficiente.

O sistema garantirá a integridade dos dados durante a movimentação, evitando inconsistências na ordenação. A operação será realizada de maneira rápida e segura.
## Stack utilizada

**Back-end:** Java 21, Spring Boot

**Banco de Dados:** H2(para teste) e PostgreSQL(para produção)

**API:** Spring RESTful

**Testes de Requisições:** Postman

**Containerização:** Docker Compose


## Documentação da API

#### Retorna todos os itens

```http
  GET /localhost:8080/games
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `api_key` | `string` | **Obrigatório**. A chave da sua API |

#### Retorna um item

```http
  GET /localhost:8080/games/${listId}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

#### Realiza a troca de posição do Jogo
```http
  POST /localhost:8080/list/${listId}(1 ou 2)/replacement
```

| Parâmetro| Tipo | Descrição | Body (JSON)                      
| :---------- | :--------- | :------------------------------------------ | :------------------------------------------ 
| `id`      | `string` | **Obrigatório**.  ID do gênero que deseja fazer a troca| {"sourceIndex": índice que deseja trocar(3), "destinationIndex": índice destino(1)} 



## Roadmap

- Adicionar método para adicionar novos jogos

- Adicionar método de deletar jogos

- Realizar o Front-End


