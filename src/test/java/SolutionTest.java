import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void countGoodStringsTest1(){
        Assert.assertEquals(8, new Solution().countGoodStrings(3, 3, 1, 1));
    }

    @Test
    public void countGoodStringsTest2(){
        Assert.assertEquals(5, new Solution().countGoodStrings(2, 3, 1, 2));
    }
    @Test
    public void countGoodStringsTest3(){
        Assert.assertEquals(764262396, new Solution().countGoodStrings(200, 200, 10, 1));
    }

    @Test
    public void countGoodStringsTest4(){
        Assert.assertEquals(873327137, new Solution().countGoodStrings(500, 500, 5, 2));
    }
}

