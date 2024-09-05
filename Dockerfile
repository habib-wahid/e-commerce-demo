FROM openjdk:17
MAINTAINER habib-wahid
COPY target/e-commerce-0.0.1-SNAPSHOT.jar e-commerce-demo-1.0.jar
ENTRYPOINT ["java", "-jar", "e-commerce-demo-1.0.jar"]
