
import br.com.danielsilva.fibonacci.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTestTest {

    private Fibonacci fibonacci;

    @Test
        public void fibonacciTest(){

           Long fibo = Fibonacci.findElement(20L);
            Assert.assertEquals(6765, fibo , 0 );

        }

}