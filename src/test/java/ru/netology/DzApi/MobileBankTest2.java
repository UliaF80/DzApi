package ru.netology.DzApi;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class MobileBankTest2 {

    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("http://localhost:9999/api/v1")

                .when()
                .get("/demo/accounts")

                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("[0].currency", equalTo("RUB"));


    }
    @Test
    void shouldReturnDemoAccounts2() {
        given()
                .baseUri("http://localhost:9999/api/v1")

                .when()
                .get("/demo/accounts")

                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("[1].currency", equalTo("USD"));
    }
}