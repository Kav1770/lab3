import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] i = {5, 4, 3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(i);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, i);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] i = {5, 4, 3, 2, 1};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ArrayExamples.reversed(i));
  }
}
