#!/bin/bash

echo ""
echo "Execution du client : "
echo ""

pathOfDirectory="/home/user/DevOps/DevOps_Partie_2/"

cd $pathOfDirectory"/modulesMaven/client/client_CLI"
mvn exec:java