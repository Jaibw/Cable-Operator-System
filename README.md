# Cable-Operator-System

## Updating System Repo
sudo apt-get update
sudo apt-get -y upgrade

## Installing Github and Cloning Repo
sudo apt-get install git 
git clone https://github.com/Ayushnda7/Cable-Operator-System

## Installing maven
sudo apt-get install maven

## Installing a postgressql
sudo sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -
sudo apt-get update
sudo apt-get -y install postgresql

## Setingup a postgressql
sudo -u postgres psql postgres
ALTER USER postgres PASSWORD '7410';
*Change localhost to ip of the postgresql instance in "application.properties" (if remote) 

# Runing App using maven
cd Cable-Operator-System
mvn clean
mvn install
java -jar path/abc.jar

nano Dockerfile (create docker file to create a docker image)
docker login

