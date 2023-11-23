package accountOpeaning.level0;

import org.testng.annotations.Test;



public class LevelZeroTestClass extends LevelZeroBaseClass {


    @Test(dataProvider = "Step_1")
    public void test(String JsonResponse){
        System.out.println(JsonResponse);
    }

    @Test(dataProvider = "Step_2")
    public void test2(String jsRequest){
        System.out.println(jsRequest);
    }
}
