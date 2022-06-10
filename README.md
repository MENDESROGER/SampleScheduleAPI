# SampleScheduleAPI
CRUD (Create,  Read, Update, Delete) de Agendamento de Exames de Certificação

# Observações

# Documentação Swagger
Url: http://localhost:8080/swagger-ui.html
API REST - Spring
API REST - JAX-RS não implementada

# Autenticação com spring security e JWT
1- criar um novo usuário : localhost:8080/login
formato post abaixo, o retorn será gerado um hash no fromato "Bearer" que possui limite para expirar

{
	"login":"login",
	"password":"password"
}


# Autenticação com spring security e JWT
para liberar a autenticação assim que gerado o tocken atribuir no header 
Authorization 
Bearer <hash gerado>
  
Todos url deve estar no formato inicial path JAX-RS para as controler usando JAX-RS nas classes Resource exceto os conroladores AvailabilityController e UserController que estão não padrão RESTFUL utilizar sem JAX-RS na url
https://localhost:8080/JAX-RS/? exemplo:

https://localhost:8080/JAX-RS/candidate/find


para os conroladores no padrão REST usar a url
exemplo
http://localhost:8080/api/user/listAll

http://localhost:8080/availability

 
  



