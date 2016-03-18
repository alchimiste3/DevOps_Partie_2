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
cd modulesMaven
mvn -q clean
mvn install
cd ..
