FROM openjdk:17-alpine

ENV APP_HOME=/apps

WORKDIR $APP_HOME

COPY build/libs/*.jar api.jar

HEALTHCHECK --interval=30s --timeout=30s \
  CMD curl --location --request GET 'http://127.0.0.1:8080/api/v1/health-check' || exit 1

EXPOSE 8080

# 실행 명령어 설정
ENTRYPOINT ["java", "-jar", "/app/app.jar"]