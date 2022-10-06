package ru.netology.DzApi;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class MobileBankTest2 {

     @Test
     void shouldReturnDemoAccounts() {
          // Given - When - Then
          // Предусловия
          given()
                  .baseUri("http://localhost:9999/api/v1")
                  // Выполняемые действия
                  .when()
                  .get("/demo/accounts")
                  // Проверки
                  .then()
                  .statusCode(200)
                  .contentType(ContentType.JSON)
                  .body("[0].currency", equalTo("RUb"));


     }
}