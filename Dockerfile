FROM adoptopenjdk:11-jre-hotspot

COPY target/demo-0.0.1-SNAPSHOT.jar /demo.jar
COPY docker-scripts/entrypoint.sh /

RUN curl -L -O curl -L -O https://artifacts.elastic.co/downloads/beats/filebeat/filebeat-7.3.2-amd64.deb && \
    dpkg -i filebeat-7.3.2-amd64.deb

ENTRYPOINT ["/entrypoint.sh"]

CMD ["tail", "-f", "/dev/null"]