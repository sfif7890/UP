import io.qameta.allure.Step;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class gt {
    /*@Test(description = "Horosho")
    public void test1() {
        checkNumber(1);
    }

    @Test(description = "Hrenovo")
    public void test2() {
        checkStr("Ыуе");
    }

    @Step("Проверяет число")
    public void checkNumber(int num){
        Assert.assertEquals(1,num);

    }
    @Step("Проверяет строку")
    public void checkStr(String str){
        Assert.assertEquals("str",str);
    }*/
    @Test(description = "Равано куражку такому вот -> О")
    public void test3() {
        Assert.assertEquals(Disk(4, 7, 0), 0);
    }

    @Test(description = "Курапнее ноуля")
    public void test4() {
        Assert.assertTrue(Disk(4, 7, 0) > 0);
    }

    @Test(description = "Менишеише нля")
    public void test5() {
        Assert.assertTrue(Disk(4, 7, 0) < 0);
    }

    @Step("Дискриминантация")
    public int Disk(int a, int b, int c) {
        int D = b * b - (4 * a * c);
        return D;
    }
}