 
# 📝 BlogSimples

> Um sistema de blog robusto e escalável desenvolvido para demonstrar boas práticas de engenharia de software e arquitetura limpa.

## 📌 Sobre o Projeto

O **BlogSimples** é uma aplicação backend (com potencial integração frontend) desenvolvida para gerenciar publicações, comentários e usuários. O objetivo principal deste projeto é consolidar conhecimentos em desenvolvimento web moderno, aplicando conceitos de **API RESTful**, **Persistência de Dados** e **Injeção de Dependências**.

A aplicação permite que usuários criem, editem e excluam postagens, além de interagir através de comentários, servindo como uma base sólida para sistemas de gerenciamento de conteúdo (CMS).

---

## 🚀 Tech Stack

O projeto foi construído utilizando tecnologias de ponta do ecossistema Java:

* **Linguagem:** Java 17+
* **Framework Principal:** Spring Boot 3.x
* **Gerenciamento de Dependências:** Maven
* **Persistência de Dados:** Spring Data JPA / Hibernate
* **Banco de Dados:** H2 Database (Ambiente de Dev) / PostgreSQL (Produção)
* **Web:** Spring Web (MVC / REST)
* **Ferramentas de Teste:** Postman / Insomnia

---

## 📋 Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

* **Java JDK 17** ou superior: [Download aqui](https://www.oracle.com/java/technologies/downloads/)
* **Maven 3.8+**: [Download aqui](https://maven.apache.org/download.cgi)
* **Git**: [Download aqui](https://git-scm.com/downloads)
* *(Opcional)* **IDE**: IntelliJ IDEA ou Eclipse.

---

## 🔧 Instalação e Execução

Siga o passo a passo abaixo para rodar a aplicação em seu ambiente local:

### 1. Clone o repositório
```bash
git clone [https://github.com/teusluv/BlogSimples.git](https://github.com/teusluv/BlogSimples.git)
cd BlogSimples

2. Configure o Banco de Dados
O projeto está configurado por padrão para usar o banco em memória (H2). Caso queira usar um banco externo, edite o arquivo:
src/main/resources/application.properties
3. Compile o projeto
Baixe as dependências e faça o build da aplicação:
mvn clean install

4. Execute a aplicação
mvn spring-boot:run

Após iniciar, a API estará acessível em: http://localhost:8080
✨ Funcionalidades
O BlogSimples conta com as seguintes features principais:
 * CRUD de Postagens: Criação, leitura, atualização e remoção de posts.
 * Gerenciamento de Comentários: Adição e visualização de comentários vinculados a posts.
 * Validação de Dados: Tratamento de entradas inválidas para garantir integridade.
 * Paginação e Ordenação: Endpoints otimizados para listagem de grandes volumes de dados.
📂 Estrutura de Pastas
A arquitetura do projeto segue o padrão de camadas (Layered Architecture) para facilitar a manutenção e testabilidade:
BlogSimples/
├── src/
│   ├── main/
│   │   ├── java/com/teusluv/blog/
│   │   │   ├── config/       # Configurações globais (ex: Cors, Beans)
│   │   │   ├── controller/   # Camada de controle (Endpoints REST)
│   │   │   ├── model/        # Entidades do banco de dados (JPA)
│   │   │   ├── repository/   # Interfaces de acesso a dados
│   │   │   ├── service/      # Regras de negócio
│   │   │   └── dto/          # Objetos de transferência de dados (opcional)
│   │   └── resources/
│   │       ├── static/       # Arquivos estáticos (CSS, JS)
│   │       ├── templates/    # Templates HTML (se usar Thymeleaf)
│   │       └── application.properties
└── pom.xml                   # Gerenciador de dependências

🤝 Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir Issues ou enviar Pull Requests para melhorias.
<div align="center">
<sub>Desenvolvido por <a href="https://www.google.com/search?q=https://github.com/teusluv">Matheus</a></sub>
</div>


