import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {
@Test
@DisplayName("")
void BubbleSortTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class};
        Method method = testClass.getDeclaredMethod("bubbleSortString", cArg);
  // Enter code here
  String[] unsorted = {"1"};
	String[] sorted = {"1"};
  	method.invoke(null, new Object[]{unsorted});
	assertArrayEquals(sorted, unsorted);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void BubbleSortTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class};
        Method method = testClass.getDeclaredMethod("bubbleSortString", cArg);
  // Enter code here
  String[] unsorted = {};
	String[] sorted = {};
  	method.invoke(null, new Object[]{unsorted});
	assertArrayEquals(sorted, unsorted);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void bubbleSortTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {String[].class};
        Method method = testClass.getDeclaredMethod("bubbleSortString", cArg);
  // Enter code here
  String[] unsorted = {"a", "b", "D", "c", "help", "me", "you", "fool"};
	String[] sorted = {"a", "b", "c", "D", "fool", "help", "me", "you"};
  	method.invoke(null, new Object[]{unsorted});
	assertArrayEquals(sorted, unsorted);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
