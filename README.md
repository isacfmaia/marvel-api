# Marvel API

Thanos destruiu nossos endpoints, voltamos no tempo para reconstruí-los antes que seja tarde demais. Esse é um projeto de demonstração de implementação de parte de uma API Rest utilizando o Spring Boot.

## Iniciando a Aplicação:

Acesse o diretório:
\marvel-api\target\

Execute:
```bash
java -jar marvel-api-0.0.1-SNAPSHOT.jar
```

## Como Utilizar:

`GET`
* `/v1/public/personagens`
* `/v1/public/personagens/{personagemId}`
* `/v1/public/personagens/{personagemId}/eventos`
* `/v1/public/personagens/{personagemId}/historias`
* `/v1/public/personagens/{personagemId}/quadrinhos`
* `/v1/public/personagens/{personagemId}/series`

Acesse: /swagger-ui.html para ver mais detalhes dos modelos.

## Construído em:

- Spring Boot
- H2 Database
- Spring Data JPA
- Lombok
- Swagger
- JUnit

## Licença

[MIT](https://choosealicense.com/licenses/mit/)