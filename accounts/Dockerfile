# Stage 1: Build
FROM maven:3.8.6-openjdk-17 as builder
WORKDIR /accounts
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
WORKDIR /accounts
#MAINTAINER eazybytes.com

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
#COPY --from=build /accounts/target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]