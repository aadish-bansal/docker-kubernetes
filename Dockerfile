FROM openjdk:17

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8082

CMD ["java","-jar" ,"app.jar"]


