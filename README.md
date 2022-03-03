spring-demo-maven
===============
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
