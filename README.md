# Teste de TDD em Java: LoginScreen
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

Este projeto em Java, consiste na implementação de testes de unidade para a classe LoginScreen, que representa a tela de login de um sistema. A classe permite aos usuários realizar login e adicionar novos usuários ao banco de dados simulado. Os testes são desenvolvidos utilizando a abordagem de Desenvolvimento Orientado a Testes (TDD), onde os testes são escritos antes da implementação do código.

## Pré-requisitos:

- Linguagem de programação: `Java`
- Bibliotecas: `JUnit 5`
- IDE: `NetBeans`

## Estrutura do Projeto
O projeto está estruturado da seguinte forma:

### A classe LoginScreen, que representa a tela de login do sistema.

Métodos:

`public LoginScreen():` Construtor da classe LoginScreen. Inicializa o banco de dados de usuários com valores padrão.

`public boolean login(String username, String password):` Verifica se o usuário pode fazer login com o nome de usuário e senha fornecidos.

`public void addUser(String username, String password):` Adiciona um novo usuário ao banco de dados.

### A classe LoginScreenTest contém os testes de unidade para a classe LoginScreen.

Métodos de Teste:

`public void testSucessfulLogin():` Testa se o login é bem-sucedido com credenciais corretas.

`public void testFaleidLogin():` Testa se o login falha com credenciais incorretas.

`public void testAddUser():` Testa se é possível adicionar um novo usuário ao banco de dados.
Pacote calculadora.loginscreen
Este pacote agrupa as classes relacionadas à funcionalidade de login.

## Implementação
A implementação dos testes de unidade é realizada utilizando o framework de testes JUnit 5. Cada método de teste na classe LoginScreenTest verifica um aspecto específico da funcionalidade da classe LoginScreen. Os testes incluem casos de sucesso e falha para o método de login, além de verificar a adição de novos usuários.
