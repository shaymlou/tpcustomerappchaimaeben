#!/bin/sh
mvn clean package && docker build -t com.cherry/tpcustomerappchaimaeben .
docker rm -f tpcustomerappchaimaeben || true && docker run -d -p 9080:9080 -p 9443:9443 --name tpcustomerappchaimaeben com.cherry/tpcustomerappchaimaeben