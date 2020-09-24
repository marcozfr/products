package org.example.sample.service.impl;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import io.quarkus.arc.profile.IfBuildProfile;
import org.example.sample.domain.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Qualifier;
import java.util.Arrays;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
@IfBuildProfile("")
public class ProductsServiceImpl {

    public ProductsServiceImpl(){
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder
                .standard().build();

        DynamoDBMapper mapper = new DynamoDBMapper(client);
    }

    public List<Product> getProducts(){
        return Arrays.asList(new Product());
    }

    public String toString() {
        return "ProductsServiceImpl{}";
    }
}
