# Gerenciamento de Produtos

Este projeto é uma aplicação Java que permite realizar operações CRUD (Criar, Ler, Atualizar, Excluir) em produtos armazenados em um banco de dados PostgreSQL. O projeto utiliza JDBC para conectar-se ao banco de dados e executar as operações necessárias.

## Requisitos

- Java 11 ou superior
- PostgreSQL
- Biblioteca JDBC do PostgreSQL

## Configuração do Banco de Dados

1. **Crie o Banco de Dados:**
   ```sql
   CREATE DATABASE ti02;
   ```

2. **Crie a Tabela de Produtos:**
   ```sql 
   CREATE TABLE produtos (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(255) NOT NULL,
        descricao TEXT
    );
    ```

## Configuração do Projeto

### Adicione o Driver JDBC ao Projeto

1. **Baixe o JAR do driver JDBC para PostgreSQL** [aqui](https://jdbc.postgresql.org/download.html).
2. No Eclipse, adicione o JAR ao seu projeto através de:
   - **"Project Properties"** > **"Java Build Path"** > **"Libraries"** > **"Add External JARs"**.

### Configuração da Conexão com o Banco de Dados

- Edite a classe `ProdutoDAO` para configurar a conexão com o banco de dados PostgreSQL.
- Substitua `"seu_usuario"` e `"sua_senha"` pelas credenciais do seu banco de dados PostgreSQL.

## Classes do Projeto

### `Produto`

Representa um produto com os seguintes atributos:
- `id` (int): Identificador do produto.
- `nome` (String): Nome do produto.
- `descricao` (String): Descrição do produto.

### `ProdutoDAO`

Classe responsável pelas operações CRUD com o banco de dados:
- `inserir(Produto produto)`: Adiciona um novo produto ao banco de dados.
- `listar()`: Retorna uma lista de todos os produtos.
- `atualizar(Produto produto)`: Atualiza as informações de um produto existente.
- `excluir(int id)`: Remove um produto do banco de dados pelo ID.
- `buscarPorId(int id)`: Retorna um produto específico pelo ID.

### `Principal`

Classe com um menu interativo para gerenciar produtos:
- **Listar produtos**: Exibe todos os produtos no banco de dados.
- **Inserir produto**: Adiciona um novo produto ao banco de dados.
- **Atualizar produto**: Atualiza as informações de um produto existente.
- **Excluir produto**: Remove um produto do banco de dados pelo ID.
- **Sair**: Encerra a aplicação.

## Como Executar o Projeto

### Compile e Execute

1. **Compile o projeto no Eclipse** ou use a linha de comando:
   ```sh
   javac -cp postgresql-42.5.1.jar src/*.java -d bin
   ```

2. **Execute a classe Principal:**
   ```sh
   javac -cp postgresql-42.5.1.jar src/*.java -d bin
   ```

## Interaja com o Menu

Siga as instruções no menu para listar, inserir, atualizar ou excluir produtos.

## Contribuições

Se desejar contribuir para este projeto, por favor, envie um pull request com suas alterações.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## Contato

Se você tiver alguma dúvida, entre em contato com [Mariana Almeida](mailto:marianaalmeidafga@gmail.com).



