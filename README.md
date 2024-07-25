# Email Microservice
## Uber Backend Challenge

Microserviço desenvolvido como resolução do desafio proposto em:  [Uber Backend Challenge](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md).

## ☕ Tecnologias utilizadas

* Java
* Spring
* AWS Simple Email Service

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/phelipemon/email-service-backend-uber.git
```

2. Instale dependências com Maven

3. Atualize `application.properties` inserindo suas credenciais AWS

```yaml
aws.region=us-east-1
aws.accessKeyId=1111111
aws.secretKey=111111
```

## Como usar

1. Na IDE execute o arquivo EmailServiceApplication
2. A API estará acessível em http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**GET EMAIL**
```markdown
POST /api/email/send - Envie um e-mail do seu remetente para o destino


**BODY**
```json
{
    "to": "phel.dev.projetos@gmail.com",
    "subject": "teste",
    "body": "teste"
}
```


## Contato


<p>Feito por <b>Phelipe Reis</b>  :octocat: | - phel.dev@gmail.com

<a href="https://www.linkedin.com/in/phelipe-reis-3a11011a7/">Entre em contato</a></p>
