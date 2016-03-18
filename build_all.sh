#!/bin/bash

# ## Building the .Net system
# echo ""
# echo "Copilation du server dotNet"
# echo ""
# cd dotNet
# ./compile.sh
# cd ..

# ## Building the j2e system
# echo ""
# echo "Copilation des composants j2e"
# echo ""
# cd j2e
# mvn -q clean package
# cd ..

## Building the webService system
echo ""
echo "Copilation des web Services"
echo ""
cd webService
mvn -q clean package
cd ..

## Building the webService system
echo ""
echo "Copilation du ServerJ2E"
echo ""
cd serverJ2E
mvn -q clean package
cd ..


## Building the stubs system
echo ""
echo "Copilation des stubs"
echo ""
cd stubs
mvn clean package
cd ..


## Building client
echo ""
echo "Copilation du client-CLI"
echo ""
cd client_CLI
mvn clean package
cd ..

## Building client
echo ""
echo "Copilation du client"
echo ""
cd client
mvn clean package
cd ..
