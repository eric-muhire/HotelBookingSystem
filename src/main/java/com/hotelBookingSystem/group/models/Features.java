package com.hotelBookingSystem.group.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class Features {


    @DynamoDBAttribute
    private boolean workDesk;
    @DynamoDBAttribute
    private boolean conciergeService;
    @DynamoDBAttribute
    private boolean seaView;
    @DynamoDBAttribute
    private boolean twentyFourSevenRoomService;
    @DynamoDBAttribute
    private boolean smartphoneForRoomControl;

}

