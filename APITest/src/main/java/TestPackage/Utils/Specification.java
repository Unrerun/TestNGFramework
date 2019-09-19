package TestPackage.Utils;

import TestPackage.DataPackage.TestData;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.builder.ResponseSpecBuilder;
import com.jayway.restassured.filter.log.LogDetail;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import com.jayway.restassured.specification.ResponseSpecification;

public class Specification {

    public static RequestSpecification restAssuredRequestConfigs() {
        RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
        requestBuilder.setContentType(ContentType.JSON);
        requestBuilder.setAccept(ContentType.JSON);
        requestBuilder.setBaseUri(TestData.getBaseUrl());
        requestBuilder.setPort(443);
        requestBuilder.setBody(TestData.AuthParams());
        requestBuilder.log(LogDetail.ALL);
        return requestBuilder.build();
    }

    public static ResponseSpecification restAssuredResponseConfigs() {
        ResponseSpecBuilder responseBuilder = new ResponseSpecBuilder();
        responseBuilder.expectStatusCode(200);
        return responseBuilder.build();
    }

}
