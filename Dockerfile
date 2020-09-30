FROM openjdk:15
ADD ./target/SpringBootMySQLDockerCompose-2.3.4.RELEASE.jar SpringBootMySQLDockerCompose-2.3.4.RELEASE.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","SpringBootMySQLDockerCompose-2.3.4.RELEASE.jar" ]