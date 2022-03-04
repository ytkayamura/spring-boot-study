spring-demo-maven
===============
Spring initializrより作成。Spring Boot 2.6.3:Jar  
dependencyのspring-boot-starterをspring-boot-starter-webに変更。  
SpringJDBC(MySQL)、Thymeleafを導入。

- セットアップ  
MySQLを起動。ユーザーとデータベース=testdbを作成しておく。中身は空でOK。
接続情報はapplication.propertiesに記載する。
```
# application.properties
 :
spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=piyo
 :
```

- 実行
```
./mvnw spring-boot:run
```

- Jarビルド
```
./mvnw package spring-boot:repackage
```

- Jar実行
```
java -jar ./target/demo-0.0.1-SNAPSHOT.jar
```
