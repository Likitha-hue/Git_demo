package mvn_1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void testGreet() {
        Mainclasss obj = new Mainclasss();
        String result = obj.greet("TestyyNG");
        Assert.assertEquals(result, "Hello, TestyyNG!");
    }
}
