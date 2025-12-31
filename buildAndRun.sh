#!/bin/sh
if [ $(docker ps -a -f name=toupeira | grep -w toupeira | wc -l) -eq 1 ]; then
  docker rm -f toupeira
fi
mvn clean package && docker build -t br.com.trixti/toupeira .
docker run -d -p 9080:9080 -p 9443:9443 --name toupeira br.com.trixti/toupeira
