# Promo API - SDK
The following code was developed on a Mac. Some scripts will require tweaking to run under Windows or Linux.

## Swagger Code Gen
The easiest way to start with swagger code gen on a mac is to install it using Brew:
```bash
 brew install swagger-codegen
```
Other options are available, see the swagger code gen project home here: https://github.com/swagger-api/swagger-codegen

## Java SDK
### Maven
The generated java sources require Maven to compile. For the samples to compile, you must first install the promo-sdk
```bash
cd java/promo-sdk
mvn clean install

cd ../samples
mvn clean compile
```
