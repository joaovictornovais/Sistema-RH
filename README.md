# Systema RH 👤
Sistema de Recursos Humanos feito com Microserviços

## Tecnologias 🚀
- Spring

## Projeto 💻
> Esse projeto foi desenvolvido como propósito de estudo sobre Microserviços. 

> Trata-se de um sistema de rh na qual o usuário declarará o pagamento de um funcionário.

Existem 2 microserviços nessa aplicação:
1. *User-Api* > API que retorna informações sobre o(s) trabalhador(es)
2. *Payroll-API* > API que a partir de informações do usuário, define o pagamento do trabalhador

Foi utilizado o [Netflix Eureka](https://medium.com/@michellibrito/netflix-eureka-comunica%C3%A7%C3%A3o-entre-microservices-383d32d39506) para a comunicação entre os microserviços.

## Aplicação 🧰
**DISCLAIMER**: O projeto foi criado APENAS p/ estudos de integração entre microserviços, portanto, no momento não possui métodos HTTP como POST, PUT, DELETE, apenas um objeto com [Mock-up](https://tecnoblog.net/responde/o-que-e-mockup/#:~:text=Mockup%20%C3%A9%20o%20que%20os,comunica%C3%A7%C3%A3o%20com%20o%20cliente%20final.). A opção de cadastrar novos funcionários será feita em breve. 

1. Faça um clone do repositório;
2. Baixe o [POSTMAN](https://www.postman.com/)
2. Importe as pastas **_eureka-server_**, **_api-gateway_**, **_users-api_** e **__** na IDE de preferência
3. Execute na seguinte ordem: **Eureka-Server**, **API-GATEWAY** e os 2 restantes.
4. Happy hacking! :)

## Imagens 🖼
|Eureka Server|Informações do Trabalhador|Pagamento trabalhador c/ horas trabalhadas declarada|
|---|---|---|
|![Eureka-server](https://user-images.githubusercontent.com/80803417/210268866-63d6632c-70bb-4848-b2d3-19cd16248821.png)|![informações user](https://user-images.githubusercontent.com/80803417/210268872-585b01a5-4c11-46f7-9b62-e640ca5ea9a4.png)|![payroll-api calculo](https://user-images.githubusercontent.com/80803417/210268880-b2304819-eaca-4a29-b9cc-a0c3ba077553.png)|

