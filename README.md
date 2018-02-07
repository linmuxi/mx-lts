# mx-lts
基于lts搭建的分布式调度框架

## step1.先编译所有工程
cd mx-lts-parent
mvn clean install -Dmaven.test.skip=true

## step2.启动jobclient
cd mx-lts-jobclient/target/
java -jar mx-lts-jobclient-1.0.0-SNAPSHOT-jar-with-dependencies.jar

## step3.启动jobtracker
cd mx-lts-jobtracker/target/
java -jar mx-lts-jobtracker-1.0.0-SNAPSHOT-jar-with-dependencies.jar

## step4.启动tasktracker
cd mx-lts-tasktracker/target/
java -jar mx-lts-tasktracker-1.0.0-SNAPSHOT-jar-with-dependencies.jar

## step5.启动lts管理平台
cd mx-lts-admin
mvn tomcat7:run

访问连接： localhost:8081
默认用户名密码admin/admin
