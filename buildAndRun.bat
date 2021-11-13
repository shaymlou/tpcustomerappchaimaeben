@echo off
call mvn clean package
call docker build -t com.cherry/tpcustomerappchaimaeben .
call docker rm -f tpcustomerappchaimaeben
call docker run -d -p 9080:9080 -p 9443:9443 --name tpcustomerappchaimaeben com.cherry/tpcustomerappchaimaeben