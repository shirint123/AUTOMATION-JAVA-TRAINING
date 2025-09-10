package com.aw.automationtraining;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredTest {
    
    @Test
    public void testReqResApiUsers() {
        // Set base URI
        RestAssured.baseURI = "https://reqres.in";
        
        // Make GET request to /api/users?page=2
        Response response = given()
            .queryParam("page", 2)
            .when()
            .get("/api/users")
            .then()
            .extract().response();
        
        // Assert status code
        Assert.assertEquals(response.getStatusCode(), 200, 
            "Status code should be 200");
        
        // Assert page number
        int pageNumber = response.jsonPath().getInt("page");
        Assert.assertEquals(pageNumber, 2, 
            "Page number should be 2");
        
        // Assert per_page
        int perPage = response.jsonPath().getInt("per_page");
        Assert.assertEquals(perPage, 6, 
            "Per page should be 6");
        
        // Assert total
        int total = response.jsonPath().getInt("total");
        Assert.assertEquals(total, 12, 
            "Total should be 12");
        
        // Assert data array exists and has items
        int dataSize = response.jsonPath().getList("data").size();
        Assert.assertEquals(dataSize, 6, 
            "Data array should contain 6 users");
        
        // Print response for verification
        System.out.println("Response: " + response.asString());
        System.out.println("Page: " + pageNumber);
        System.out.println("Per Page: " + perPage);
        System.out.println("Total: " + total);
        System.out.println("Data Size: " + dataSize);
    }
    
    @Test
    public void testReqResApiUsersWithJsonPath() {
        // Alternative approach using JSON path assertions
        given()
            .queryParam("page", 2)
            .when()
            .get("https://reqres.in/api/users")
            .then()
            .statusCode(200)
            .assertThat()
            .body("page", org.hamcrest.Matchers.equalTo(2))
            .body("per_page", org.hamcrest.Matchers.equalTo(6))
            .body("total", org.hamcrest.Matchers.equalTo(12))
            .body("data.size()", org.hamcrest.Matchers.equalTo(6));
        
        System.out.println("JSON Path assertions passed successfully");
    }
}
