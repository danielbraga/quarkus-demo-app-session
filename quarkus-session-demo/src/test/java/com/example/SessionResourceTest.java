package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class SessionResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/session")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}