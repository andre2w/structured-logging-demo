#! /bin/sh

service filebeat start
service heartbeat-elastic start

java -jar /demo.jar > /var/log/app/demo.jsonl 2>&1 &

exec $@