FROM openjdk:17-jdk-alpine 

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

COPY src ./src
RUN chmod a+x mvnw
RUN ./mvnw package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java","-jar","target/common-pos-0.0.1-SNAPSHOT.jar"] 
