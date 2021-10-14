# Cable-Operator-System

sudo apt-get update

sudo apt-get -y upgrade

sudo apt-get install maven

git clone https://github.com/Ayushnda7/Cable-Operator-System

=> setup a postgressql

sudo sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -
sudo apt-get update
sudo apt-get -y install postgresql


change the localhost to Ip of the postgressql instance(if remote) in "application.property"

sudo -u username psql dbname

psql

ALTER USER postgres PASSWORD '7410';

cd Cable-Operator-System

mvn clean

mvn install

java -jar path/abc.jar

vim Dockerfile (to create docker image)
