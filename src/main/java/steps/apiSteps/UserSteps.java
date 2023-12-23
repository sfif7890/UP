package steps.apiSteps;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import models.responseModels.*;


import static io.restassured.RestAssured.given;

public class UserSteps {

    @Step
    public Response getResponseList () {
        return given()
                .baseUri("https://api.demoblaze.com")
                .contentType(ContentType.JSON)
                .get("/entries")
                .then()
                .assertThat()
                .statusCode(200)
                .extract().response().as(Response.class);
    }

}