# Utiliser une image Java officielle comme base
FROM openjdk:21-jdk-slim

# Définir le répertoire de travail
WORKDIR /app

# Copier le fichier JAR de l'application dans le conteneur
COPY build/libs/quoteapi-0.0.1-SNAPSHOT.jar /app/quoteapi.jar

# Exposer le port de l'application
EXPOSE 8080

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "quoteapi.jar"]
