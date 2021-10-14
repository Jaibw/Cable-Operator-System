# Cable-Operator-System

## Updating System Repo
sudo apt-get update

sudo apt-get -y upgrade

## Installing Github and Cloning Repo
git --version

sudo apt-get install git 

git clone https://github.com/Ayushnda7/Cable-Operator-System

## Installing maven
sudo apt-get install maven

echo 'export M2_HOME=/opt/apache-maven-3.5.4' >> ~/.bashrc

echo 'export PATH=${M2_HOME}/bin:${PATH}' >> ~/.bashrc

echo 'export JAVA_HOME=/usr/lib/jvm/java-8-oracle' >> ~/.bashrc

mvn -v

## Installing a postgressql
sudo sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'

wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -

sudo apt-get update

sudo apt-get -y install postgresql

## Setingup a postgressql
sudo -u postgres psql postgres

ALTER USER postgres PASSWORD '7410';

*Change localhost to ip of the postgresql instance in "application.properties" (if remote) 

## Runing App using maven
cd Cable-Operator-System

mvn clean

mvn install

java -jar path/abc.jar (for testing)

## Generating Docker Image

nano Dockerfile (create docker file to create a docker image)
```
FROM openjdk:11

EXPOSE 8080

ADD target/App-Tata-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","App-Tata-0.0.1-SNAPSHOT.jar"]
```

docker login

docker build -t myapp-ayush:1 .

docker run -it --rm myapp-ayush:1

docker push ayushnda7/myapp-ayush:1
