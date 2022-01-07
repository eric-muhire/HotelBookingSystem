package com.hotelBookingSystem.group.config;//package com.hotelBookingSystem.group.models;
//
//
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.client.builder.AwsAsyncClientBuilder;
//import com.amazonaws.client.builder.AwsClientBuilder;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//    public class DynamoDBConfig {
//
//        @Value("${amazon.dynamodb.endpoint.url}")
//        private String awsDynamoDBEndpoint;
//
//        @Value("${amazon.aws.accesskey}")
//        private String awsAccessKey;
//
//        @Value("${amazon.aws.secretkey}")
//        private String awsSecretKey;
//
//        @Value("${amazon.region}")
//        private String awsRegion;
//
//        @Bean
//        public DynamoDBMapper mapper(){
//            return new DynamoDBMapper(amazonDynamoDBConfig());
//        }
//
//
//    public AmazonDynamoDB amazonDynamoDBConfig() {
//            return AmazonDynamoDBClientBuilder.standard()
//                    .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(awsDynamoDBEndpoint,awsRegion))
//                    .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(awsAccessKey,awsSecretKey)))
//                    .build();
//
//        }
//    }
//

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {
    @Bean
    public DynamoDBMapper dynamoDBMapper(){
        return new DynamoDBMapper(buildAmazonDynamoDB());
}
private AmazonDynamoDB buildAmazonDynamoDB(){
        return AmazonDynamoDBClientBuilder
                .standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration(
                        "dynamodb.eu-north-1.amazonaws.com",
                        "eu-north-1"

                )
                )
                .withCredentials(
                        new AWSStaticCredentialsProvider(
                                new BasicAWSCredentials(
                                        "AKIAWZZIPIWOIJKW2A4C",
                                        System.getenv().getOrDefault("AWS_DB_PASS", "DummyKey")
                                )

                        )

                )
                .build();
    }
}
