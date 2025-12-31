@echo off
call mvn clean package
call docker build -t br.com.trixti/toupeira .
call docker rm -f toupeira
call docker run -d -p 9080:9080 -p 9443:9443 --name toupeira br.com.trixti/toupeira