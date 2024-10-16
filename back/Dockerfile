# Étape 1 : Compilation avec Maven et Java 17
FROM maven:3.8.7-eclipse-temurin-17 AS build

# Crée un répertoire de travail
WORKDIR /app

# Copie le fichier pom.xml et télécharge les dépendances nécessaires
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copie le reste des fichiers de l'application et compile
COPY src ./src
RUN mvn clean package -DskipTests

# Étape 2 : Exécution avec OpenJDK 17
FROM eclipse-temurin:17-jre-alpine

# Crée un répertoire pour l'application
WORKDIR /app

# Copie le JAR compilé depuis l'étape précédente
COPY --from=build /app/target/backend-0.0.1-SNAPSHOT.jar /app/backend.jar

# Expose le port utilisé par l'application Spring Boot
EXPOSE 8080

# Définit la commande pour exécuter l'application
CMD ["java", "-jar", "/app/backend.jar"]
