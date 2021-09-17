package com.ribs.api;

import com.ribs.api.rest.connection.DBConnect;
import com.ribs.utils.Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Api {

    public static void main(String[] args) {

       // KafkaConnectionHelper kafkaConnectionHelper = new KafkaConnectionHelper();
      //  KafkaConnectionHelper.setKafkaConnectionHelper(kafkaConnectionHelper);
      //  kafkaConnectionHelper.consume();
      //  DBConnect.makeJDBCConnection();
        SpringApplication.run(Api.class, args);
        System.out.println("Hello from API service");
        String Username_Kafka = Utils.fetchProperties().getProperty("Username_Kafka");
        System.out.println("Hello from API service Username_Kafka:"+Username_Kafka);
    }
}
