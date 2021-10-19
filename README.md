# Cable-Operator-System

## Updating System Repo
sudo apt-get update

sudo apt-get -y upgrade

## Installing Github and Cloning Repo
git --version

sudo apt-get install git 

git clone https://github.com/Ayushnda7/Cable-Operator-System

## change application.properties
```
## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)

spring.datasource.url = jdbc:postgresql://${DBHOST}:${DBPORT}/${DATABASE}

spring.datasource.username = ${DBUSER}

spring.datasource.password = ${DBPASSWORD}

 #jdbc:postgresql://127.0.0.1:5432/dvdrental



## hibernate Properties

# The SQL dialect makes Hibernate generate better SQL for the chosen database

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect

 

# hibernate ddl auto (create, create-drop, validate, update)

#spring.jpa.hibernate.ddl-auto = create

spring.jpa.hibernate.ddl-auto = update

server.port = 8081
```
## Database Env Variables(Linux)
```
export DATABASE=cable-operator-management-system-db
export DBUSER=postgres
export DBPORT=31399
export DBPASSWORD=NTgSEe4uW7AymGWm
export DBHOST=34.237.143.208

```

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

ALTER USER postgres PASSWORD 'Password';## to change password (optional)

*Change localhost to ip of the postgresql instance in "application.properties" (if remote) 

## Runing App using maven
cd Cable-Operator-System

mvn clean

mvn install

java -jar path/abc.jar (for testing)

## Docker Install

sudo apt-get update

 sudo apt-get install -y apt-transport-https ca-certificates curl gnupg lsb-release
 
 curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg
 
 echo "deb [arch=$(dpkg --print-architecture) signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
 
 sudo apt-get update
 
 sudo apt-get install -y docker-ce docker-ce-cli containerd.io docker-compose
 
 sudo usermod -aG docker ubuntu
 
 exit
 
## Generating Docker Image

nano Dockerfile (create docker file to create a docker image)
```
FROM openjdk:11

EXPOSE 8080

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
```

docker login

docker build -t ayushnda7/cos:1 .

docker run -it --rm ayushnda7/cos:1

docker push ayushnda7/cos:1
