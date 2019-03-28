From openjdk:8
ADD target/employee-producer.jar employee-producer.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar" , "employee-producer.jar"]

