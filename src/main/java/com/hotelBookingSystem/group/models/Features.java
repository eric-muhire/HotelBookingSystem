package com.hotelBookingSystem.group.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class Features {

    private Long id;

    @DynamoDBAttribute
    private String work_desk;
    @DynamoDBAttribute
    private String concierge_service;
    @DynamoDBAttribute
    private String sea_view;
    @DynamoDBAttribute
    private String twentyFourSeven_room_service;
    @DynamoDBAttribute
    private String smartphone_for_room_control;

}

