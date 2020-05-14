This service provide the REST APIs to access the data through GraphQL.

# How to build & Run

1. Pre-Requisites
- JDK 11
- Maven 3.3.x

2. Build:
```
mvn clean install
```

3. Start the application:
```
java -jar target/demographqlservice-1.0.0-SNAPSHOT.jar
```

The above will start the service which supports the GraphQL query via the following endpoint:
```
http://localhost:8080/graphql
```

4. Run command to verify that the server is up and running:
```
curl http://localhost:8080/graphql/schema.json
```

# GraphQL Query API for TestEntity Data

***It is highly recommended to use [GraphiQL](https://electronjs.org/apps/graphiql) to run GraphQL queries***

This service supports 4 queries in the root level:
- getAllEntities
- getEntitiesByName(name)
- getEntityById(id)

Examples:
GraphQL Endpoint: http://localhost:8080/graphql

{
  getAllEntities{
    id,
    name,
    properties{
      value,
      valueType
    }
  }
}

{
  getEntityById(id:"1"){
    id,
    name,
    properties{
      value,
      valueType
    }
  }
}

{
  getEntitiesByName(name:"name 10"){
    id,
    name,
    properties{
      value,
      valueType
    }
  }
}