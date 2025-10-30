#!/bin/bash

./gradlew clean build
docker build . -t finepine0430/line-up
#docker compose down
docker compose up -d
docker logs app -f