# Marketplace Feed API Sample Client

To learn more about the Marketplace Feed API please view the documentation at:
https://developer.expediapartnercentral.com/apis/insights/marketplace-feed/quickstart

## Installation & Usage

To install the API client library to your local Maven repository, execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official Maven documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client library is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
    <groupId>com.expedia</groupId>
    <artifactId>marketplace-feed-client</artifactId>
    <version>1.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>

```

## Running the sample program

To run the sample program you can use the following maven command:

```shell
mvn -q exec:java -Dexec.args="<username> <password> <hotelId> <clientId>"
```
