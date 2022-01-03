package com.hotelBookingSystem.group.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
@DynamoDBTable(tableName = "customer")
public class Customer {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey()
    private String customerId;
    @DynamoDBAttribute
    private String firstName;
    @DynamoDBAttribute
    private String lastName;
    @DynamoDBAttribute
    private String phoneNumber;
    @DynamoDBAttribute
    private String email;
    @DynamoDBAttribute
    private String address;
    @DynamoDBAttribute
    private String city;
    @DynamoDBAttribute
    private String zipCode;
    @DynamoDBAttribute
    private String country;


}
