#!/bin/bash

## Building the .Net system
echo ""
echo "Copilation du server dotNet"
echo ""
cd dotNet
./compile.sh
cd ..

## Building the webService system
echo ""
echo "Copilation des module maven"
echo ""
cd modules
mvn -q clean
mvn package
cd ..
