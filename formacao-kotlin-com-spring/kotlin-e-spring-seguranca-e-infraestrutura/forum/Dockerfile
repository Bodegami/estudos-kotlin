# Seleciona Imagem
FROM adoptopenjdk/openjdk11

# Expoe a porta da aplicacao
EXPOSE 8080

# Indica onde está o .jar da aplicacao e faz uma copia com o nome informado
ADD /target/forum-0.0.1-SNAPSHOT.jar forum.jar

# Comando que deve ser executado ao subir a aplicacao
ENTRYPOINT ["java", "-jar", "forum.jar"]

