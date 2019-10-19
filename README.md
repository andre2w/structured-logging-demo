# Structured Logging 

This is a sample application to demonstrate how to use structured logs with Spring Boot.

## Configuring the logger

You can see the configuration for the logger in the file `src/main/resources/logback-spring.xml`. The documentation for the Logback encoder [here](https://github.com/logstash/logstash-logback-encoder)

The demonstration code is in `src/main/java/com/example/demo/DemoApplication.java`. 

## Build and Running

You can build the application by running 

```
./mvnw clean package 
```

and to run

```
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

To see how the logs interact with Elastic Stack just run:

```
docker-compose up -d
```

and then access `localhost:5601` to see the Kibana dashboard. 
