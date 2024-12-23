# Kaka Automation Framework

The Kaka Automation Framework is a Spring Boot application designed to monitor and check responses in a Kafka queue. It includes sophisticated monitoring logic, an alerting mechanism, and options to integrate with other systems.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [Testing](#testing)
- [Logging](#logging)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)

## Features

- Kafka message consumption
- Sophisticated monitoring logic
- Alerting mechanism (email alerts)
- Integration with external systems
- Detailed logging and metrics

## Prerequisites

- Java 11 or later
- Maven
- Kafka broker
- SMTP server for email alerts

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-repo/kaka-automation-framework.git
    cd kaka-automation-framework
    ```

2. Build the project:
    ```sh
    mvn clean install
    ```

## Configuration

### Application Properties

Create a `application.properties` file in `src/main/resources` with the following content:

```properties
# Kafka Configuration
spring.kafka.bootstrap-servers=localhost:9092
spring.kafka.consumer.group-id=kaka-group
spring.kafka.consumer.auto-offset-reset=earliest
spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer

# Email Configuration
spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=your-email@example.com
spring.mail.password=your-email-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true