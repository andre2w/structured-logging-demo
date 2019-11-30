#! /bin/sh

service filebeat start
service heartbeat-elastic start

java -jar /demo.jar > /var/log/demo.log 2>&1 &

exec $@