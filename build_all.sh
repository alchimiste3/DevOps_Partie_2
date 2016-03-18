#!/bin/bash

# ## Building the .Net system
 echo ""
 echo "Compilation du server dotNet"
 echo ""
 cd dotNet
 ./compile.sh
 cd ..

 ## Building the j2e system
 echo ""
 echo "Compilation des composants j2e"
 echo ""
 cd j2e
 mvn -q clean package
 cd ..

## Building the webService system
echo ""
echo "Compilation des web Services"
echo ""
cd webService
mvn -q clean package
cd ..

## Building the webService system
echo ""
echo "Compilation du ServerJ2E"
echo ""
cd serverJ2E
mvn -q clean package
cd ..


## Building the stubs system
echo ""
echo "Compilation des stubs"
echo ""
cd stubs
mvn clean package
cd ..


## Building client
echo ""
echo "Compilation du client-CLI"
echo ""
cd client_CLI
mvn clean package
cd ..

## Building client
echo ""
echo "Compilation du client"
echo ""
cd client
mvn clean package
cd ..
