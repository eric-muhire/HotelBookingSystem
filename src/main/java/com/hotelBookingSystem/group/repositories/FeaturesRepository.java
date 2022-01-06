package com.hotelBookingSystem.group.repositories;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.hotelBookingSystem.group.models.Customer;
import com.hotelBookingSystem.group.models.Features;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class FeaturesRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Features save(Features features){
        dynamoDBMapper.save(features);
        return features;
    }
         public Features getFeaturesById(String featuresId){
        return dynamoDBMapper.load(Features.class, featuresId);
    }
        public String delete(String featuresId) {
        Features features = dynamoDBMapper.load(Features.class, featuresId);
        dynamoDBMapper.delete(features);
            return "Features Deleted";

    }
        public String update(String featuresId, Features features){
        dynamoDBMapper.save(features,
                             new DynamoDBSaveExpression()
                    .withExpectedEntry("featuredId",
                            new ExpectedAttributeValue(
                                    new AttributeValue().withS(featuresId)

                            )));
        return featuresId;

    }

}
