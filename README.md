# Cable-Operator-System

sudo apt-get install maven

git clone https://github.com/Ayushnda7/Cable-Operator-System

setup a postgressql

change the localhost to Ip of the postgressql instance(if remote) in "application.property"

sudo -u username psql dbname

psql

ALTER USER postgres PASSWORD '7410';

cd Cable-Operator-System

mvn clean

mvn install

java -jar path/abc.jar

vim Dockerfile (to create docker image)
