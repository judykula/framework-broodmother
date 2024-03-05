FROM java:8

WORKDIR /home/ubuntu/app

COPY target/${artifactId}.jar /home/ubuntu/app

CMD ["java", "-Duser.timezone=Asia/Shanghai","-Denv=DEV","-Dfile.encoding=utf8", "-Xms64m","-Xmx125m","-jar","${artifactId}.jar"]