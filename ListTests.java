import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
 class Checker implements StringChecker{
    public boolean checkString(String s){
        if(s.length()> 3){
            return true;
        }
        return false;
    }
}
public class ListTests {
    @Test 
	public void filter() {
        StringChecker ex = new Checker();
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("ban");
        list.add("orange");
        list.add("d");
        //assertEquals

    }
    
}
