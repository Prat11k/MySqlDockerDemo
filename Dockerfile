FROM openjdk:8
ADD target/mysqldocker.jar mysqldocker.jar
ENTRYPOINT ["java","-jar","/mysqldocker.jar"]