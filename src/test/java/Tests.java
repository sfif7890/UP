
import io.restassured.http.ContentType;
import models.responseModels.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Tests extends BaseTest {
    @Test(description = "Получение списка")
    public void responseList() {
        Response user = USER_STEPS.getResponseList();
        System.out.println(user);
    }
    @Test(description = "Получение  информации об одном")
    public void responseSingle() {
        Response user = USER_STEPS.getResponseList();
        System.out.println(user.getItems()[0]);
    }
    @Test(description = "Является ли самсунгом")
    public void isSamsung() {
        Response user = USER_STEPS.getResponseList();
        System.out.println(user.getItems()[0]);
        Assert.assertTrue(user.getItems()[0].toString().contains("Samsung"));
    }
    @Test(description = "Является ли телефоном")
    public void isPhone() {
        Response user = USER_STEPS.getResponseList();
        System.out.println(user.getItems()[1]);
        Assert.assertTrue(user.getItems()[1].toString().contains("phone"));
    }
    @Test(description = "Является ли картинка jpg")
    public void isJpg() {
        Response user = USER_STEPS.getResponseList();
        System.out.println(user.getItems()[1]);
        Assert.assertTrue(user.getItems()[1].toString().contains("jpg"));
    }
}
