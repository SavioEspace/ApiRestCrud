# API REST CRUD - Spring Boot + PostgreSQL

## 📌 Descrição
API RESTful com operações CRUD para as entidades `Customer` e `Order`, usando Spring Boot, Spring Data JPA, PostgreSQL e Swagger para documentação.

## 🚀 Tecnologias utilizadas
- Java 17
- Spring Boot 3.5.0
- Spring Data JPA
- PostgreSQL
- SpringDoc OpenAPI (Swagger)

## ⚙️ Como executar
1. Instale PostgreSQL e crie o banco `demo`:
```sql
CREATE DATABASE demo;
```
2. Configure o acesso no arquivo `application.properties`
```
spring.datasource.url=jdbc:postgresql://localhost:5432/demo
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=update
spring.sql.init.mode=always
spring.sql.init.schema-locations=classpath:schema.sql
spring.sql.init.data-locations=classpath:data.sql
```
3. Rode a aplicação:
```bash
mvn spring-boot:run
```
4. Acesse o Swagger UI:
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## 📂 Estrutura do projeto
```
├── controller
│   ├── CustomerController.java
│   └── OrderController.java
├── model
│   ├── Customer.java
│   └── Order.java
├── repository
│   ├── CustomerRepository.java
│   └── OrderRepository.java
├── service
│   ├── CustomerService.java
│   └── OrderService.java
├── resources
│   ├── application.properties
│   ├── schema.sql
│   └── data.sql
└── DemoApplication.java
```

## 📘 Swagger
A documentação interativa pode ser acessada via:
```
http://localhost:8080/swagger-ui.html
```
Você pode realizar chamadas `GET`, `POST`, `PUT`, `DELETE` diretamente na interface.

## 🧩 Relacionamento entre entidades
- `Customer` 1 : N `Order`
- Um cliente pode ter vários pedidos
- O pedido pertence a um único cliente

## ✅ Requisitos atendidos
- CRUD completo com validações
- Relacionamento JPA com @OneToMany/@ManyToOne
- Documentação via Swagger
- Estrutura MVC + Service
- Banco PostgreSQL com scripts SQL
