FROM openjdk:11-jdk

WORKDIR /home/spring

COPY build/libs/*.jar /home/spring/app.jar

CMD ["java", "-jar", "/home/spring/app.jar"]
