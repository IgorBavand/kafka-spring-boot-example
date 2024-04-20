
# Kafka with Spring Boot

This is a simple example of how to use Apache Kafka with Spring Boot to create an asynchronous messaging system. This project demonstrates how to set up a Kafka producer and consumer in a Spring Boot application.

## What is Apache Kafka?

Apache Kafka is a distributed streaming platform that allows you to publish, store, and process real-time event streams. It is scalable, durable, and fault-tolerant, widely used for use cases such as data streaming, log processing, system integration, and more.

## Kafka Configuration with Spring Boot

To use Apache Kafka in a Spring Boot project, you need to add the `spring-kafka` dependency to your build configuration file. Then, configure Kafka in the `application.properties` or `application.yml` file, providing Kafka server information such as address and port.

Additionally, you can configure Spring Boot to automatically create Kafka topics. In the provided example, a topic is created automatically using the `NewTopic` class in Spring.

## Kafka Message Producer

A Kafka message producer is responsible for sending messages to a Kafka topic. In the provided example, a simple producer is implemented using the `KafkaTemplate` from Spring Kafka. The `sendMessage()` method sends a message to the specified topic.

## Kafka Message Consumer

A Kafka message consumer is responsible for receiving messages from a Kafka topic. In the provided example, a simple consumer is implemented using the `@KafkaListener` annotation from Spring Kafka. The `consumer()` method is invoked whenever a new message is published to the specified topic.

## How to Use This Project

1. Clone this repository.
2. Install the necessary tools with `docker-compose up -d`.
3. Import the project into your preferred IDE.
4. Run the Spring Boot application.
5. Use a tool like cURL, Postman, or an HTTP client to send messages to the producer's exposed API.
6. Observe the application console to see the messages being received by the consumer.

This is just a basic example of using Apache Kafka with Spring Boot. For production environments and more complex use cases, it is recommended to explore additional configurations and features of Kafka and Spring Kafka.

For more information about Apache Kafka, refer to the [official documentation](https://kafka.apache.org/documentation/).
