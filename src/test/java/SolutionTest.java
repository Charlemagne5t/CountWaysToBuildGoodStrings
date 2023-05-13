import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void countGoodStringsTest1(){
        Assert.assertEquals(8, new Solution().countGoodStrings(3, 3, 1, 1));
    }
}
