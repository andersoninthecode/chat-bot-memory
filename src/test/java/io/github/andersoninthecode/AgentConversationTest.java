package io.github.andersoninthecode;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class AgentConversationTest {
    @Test
    void testHelloEndpoint() {
        given()
                .contentType(ContentType.TEXT)
                .body("Olá")
                .when().post("/chat")
                .then()
                .statusCode(500);
    }

}