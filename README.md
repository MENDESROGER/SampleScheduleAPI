# SampleScheduleAPI
CRUD (Create,  Read, Update, Delete) de Agendamento de Exames de Certificação

# Observações
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
  
# Todos url deve estar no formato inicial antes do path dos Resource
https://localhost:8080/JAX-RX/?
exemplo:

https://localhost:8080/JAX-RX/candidate/find
  
Exceto as controler AvailabilityController e UserController que estão não padrão RESTFULL
utilizar sem JAX-RX na url

 
  



