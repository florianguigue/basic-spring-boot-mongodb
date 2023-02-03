# basic-spring-boot-mongodb

A basic Spring Boot project with MongoDb and snake case field naming strategy

## Configuration

In application.properties, complete theses lines according to your MongoDB server :

````
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<YOUR_DATABASE_SERVER_URL/?retryWrites=true&w=majority
spring.data.mongodb.database=<YOUR_DATABASE_NAME>
````

The other line of the configuration will set the field naming strategy to snake case, which means that every insert
in your collection will apply nake case on your fields.

````
spring.data.mongodb.field-naming-strategy=org.springframework.data.mapping.model.SnakeCaseFieldNamingStrategy
````
