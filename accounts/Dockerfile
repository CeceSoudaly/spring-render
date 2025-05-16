
FROM openjdk:17-jdk-slim
#WORKDIR /accounts
#MAINTAINER eazybytes.com

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
#COPY --from=build /accounts/target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]