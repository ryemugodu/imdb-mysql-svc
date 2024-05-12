FROM openjdk:17
COPY ./target/movies-boot-swagger-4-0.0.1-SNAPSHOT.jar movies-boot-swagger-4-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","movies-boot-swagger-4-0.0.1-SNAPSHOT.jar"]