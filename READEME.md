
# Biblioteca - Sistema de Gerenciamento de Livros

## Descrição

O projeto "Biblioteca" é um sistema simples de gerenciamento de livros, permitindo adicionar, listar e buscar livros em uma base de dados. Ele é implementado em Java, utilizando boas práticas de programação orientada a objetos, como a separação de responsabilidades em diferentes camadas (Controller, Service, Repository) e a criação de exceções personalizadas para tratamento de erros.

## Proposito do projeto
O proposito desse projeto é criar um sistema de gerenciamento de livros para uma biblioteca. O sistema visa facilitar operações simples como cadasstrar livros, buscar se determinado livro encontra-se no banco de dados da biblioteca e listar todos os livros já cadastrados.

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

- **br.ufrn.imd.biblioteca.controller**: Contém o controlador responsável por gerenciar as operações relacionadas aos livros na biblioteca.
- **br.ufrn.imd.biblioteca.exception**: Define exceções personalizadas para tratamento de erros específicos de negócios.
- **br.ufrn.imd.biblioteca.model**: Contém as classes que representam os modelos de dados, como `Livro` e `ItemBiblioteca`.
- **br.ufrn.imd.biblioteca.repository**: Define as interfaces e implementações para operações de persistência com livros.
- **br.ufrn.imd.biblioteca.service**: Define as interfaces e implementações dos serviços de negócio para gerenciar os livros.
- **br.ufrn.imd.biblioteca.util**: Contém utilitários genéricos para operações comuns no sistema.

## Funcionalidades

- **Adicionar Livro**: Permite adicionar um novo livro à biblioteca, informando título, autor e ISBN.
- **Listar Livros**: Lista todos os livros disponíveis na biblioteca.
- **Buscar Livro por Título**: Permite buscar um livro específico pelo título.

## Tecnologias utilizadas

- JAVA 1.8
- H2 - Banco de dados em memória

## Dependências

O projeto utiliza as seguintes dependências:

- **JDK**: Versão 8 ou superior.
- **JDBC**: Para conexão e operações com a base de dados (H2 Database).

## Configuração do Banco de Dados

O projeto utiliza o banco de dados H2 para persistência dos dados dos livros. O banco de dados é inicializado automaticamente e a tabela `livro` é criada se não existir.



