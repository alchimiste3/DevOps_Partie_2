#!/bin/bash

## Building the .Net system
cd dotNet
./compile.sh
cd ..

## Building the j2e system
cd j2e
mvn clean package
cd ..

# ## Building the j2e system
# cd WebService
# mvn clean package
# cd ..

# ## Building the j2e system
# cd stubs
# mvn clean package
# cd ..


# ## Building client
# cd client
# mvn clean package
# cd ..


