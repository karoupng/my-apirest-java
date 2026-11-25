#  API RESTful — Kalu Doces

API RESTful desenvolvida em **Java com Spring Boot** para o gerenciamento de clientes, produtos e pedidos da **Kalu Doces**. O projeto segue uma arquitetura *Headless* (sem camada visual/*View*), expondo *endpoints* HTTP que recebem e retornam dados estruturados no formato **JSON**.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17** — Linguagem de programação principal
* **Spring Boot** — *Framework* para criação da aplicação e servidor web embutido
* **Spring Data JPA / Hibernate** — Mapeamento Objeto-Relacional (ORM) e persistência de dados
* **H2 Database** — Banco de dados relacional em memória (`in-memory`) para testes e desenvolvimento
* **Maven** — Gerenciador de dependências e *build* do projeto
* **Postman** — Cliente HTTP utilizado para validação dos *endpoints*

---

## Arquitetura do Projeto

A aplicação organiza suas responsabilidades em três camadas principais:

```text
[ Cliente HTTP (Postman) ] ──▶ [ Controller ] ──▶ [ Repository ] ──▶ [ Model / Banco H2 ]
