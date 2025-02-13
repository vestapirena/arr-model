# Usar una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Crear un directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el JAR generado al contenedor
COPY target/arr-model-1.0-SNAPSHOT.jar app.jar

# Exponer el puerto que utiliza la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
