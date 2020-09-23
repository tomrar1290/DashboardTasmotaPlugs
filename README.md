# Dashboard Tasmota Plugs

This idea came to my mind already some time ago. I bought some "Smart Plugs" and I flashed them with Tasmota firmware. It allowed me to overview and control powert usage. One problem - each plug was separate. That is the main reason I decided to launch this project.

## Pre-Configuration

You need some PC or similar device to run Java application.

You need plugs with Tasmota firmware, where the host is configured to Java application mentioned above.

## Installation

- MQTT Broker
- Java
- Maven
- Angular

## Running Application

You can run app simple with:

    mvn spring-boot:run
    
or
    
    mvn package
    java -jar target/dashboardtasmota-0.0.1-SNAPSHOT.jar

    
To be continued...
