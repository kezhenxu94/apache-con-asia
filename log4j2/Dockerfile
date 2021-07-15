FROM apache/skywalking-java-agent:8.6.0-jdk8

COPY build/libs/log4j2.jar /app.jar

RUN echo 'plugin.toolkit.log.grpc.reporter.server_host=${SW_GRPC_LOG_SERVER_HOST:oap}' >> agent/config/agent.config
RUN echo 'plugin.toolkit.log.grpc.reporter.server_port=${SW_GRPC_LOG_SERVER_PORT:11800}' >> agent/config/agent.config

CMD ["java", "-jar", "/app.jar"]
