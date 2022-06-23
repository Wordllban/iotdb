FROM maven:3.8.2-jdk-11
WORKDIR /usr/src/backend
COPY . .
RUN mvn clean install