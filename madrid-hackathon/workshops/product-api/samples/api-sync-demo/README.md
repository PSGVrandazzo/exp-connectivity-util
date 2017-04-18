# Madrid Hackathon 2017 Workshop
 
## What is this repo?

This is a Java-based application that demonstrates the Expedia Connectivity APIs: Property API, Product API and Image API.
 
## How do I build and run the demo?

### Requirements
This demo requires at minimum:

* Java 8+
* Maven 3.x+

This demo also relies on [Docker](http://www.docker.com) to run examples using a [Kafka](https://kafka.apache.org/) cluster with a single broker. Before you proceed, make sure you have Docker installed on your platform of choice.

### Starting the Kafka cluster

Once you have docker installed, you can run:

```bash
docker-compose up -d
```

To start the single-broker Kafka cluster required by the application. The `-d` option will put the docker process on the background; You can run it from a separate terminal if you want to browse the logs, or altenatively:

```bash
# List the running containers, printing their name
docker ps

# Check the logs
docker logs apisyncdemo_kafka_1 # name listed from previous command
```

### Running the examples
 
 Once you have the cluster setup, you can navigate to the samples on the test packages of the `product-synchronizer` module. If you want to build the demo, you can simply run:
 
 ```bash
 mvn clean install
 ```
 
 This will produce all required artifacts. Then, you can start the demo application by running:
 
 ```bash
java -jar product-synchronizer/target/product-synchronizer.jar
```

This will bring up all registered Kafka producers/consumers.
 
