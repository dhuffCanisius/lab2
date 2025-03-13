package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        // Student should write tests here
        String test = "banana";
        ArrayList<String> result = task3.removeDuplicates(test);

        assertNotNull(result);
        assertArrayEquals("Expected unique characters [b, a, n]", new String[]{"b", "a", "n"}, result.toArray());
    }

    @Test
    public void test_removeDuplicates_average(){
        // Student should write tests here
        String test = "abcdef";
        ArrayList<String> result = task3.removeDuplicates(test);

        assertNotNull(result);
        assertEquals("Expected list to be [a, b, c, d, e, f]", "[a, b, c, d, e, f]", result.toString());
    }

    @Test
    public void test_removeDuplicates_worst(){
        // Student should write tests here
        String test = null;
        ArrayList<String> result = task3.removeDuplicates(test);

        assertNotNull(result);
        assertEquals("Expected empty list", 0, result.size());

        test = "";
        result = task3.removeDuplicates(test);

        assertNotNull(result);
        assertEquals("Expected empty list", 0, result.size());
    }

    @Test
    public void test_areTheseAnagrams_best(){
        // Student should write tests here
        assertTrue(task3.areTheseAnagrams("listen", "silent"));
        assertTrue(task3.areTheseAnagrams("racecar", "carrace"));
        assertTrue(task3.areTheseAnagrams("evil", "vile"));
    }

    @Test
    public void test_areTheseAnagrams_average(){
        // Student should write tests here
        assertFalse(task3.areTheseAnagrams("hello", "world"));
        assertFalse(task3.areTheseAnagrams("java", "code"));
        assertFalse(task3.areTheseAnagrams("python", "cython"));
    }

    @Test
    public void test_areTheseAnagrams_worst(){
        // Student should write tests here
        assertFalse(task3.areTheseAnagrams(null, "test"));
        assertFalse(task3.areTheseAnagrams("test", null));
        assertFalse(task3.areTheseAnagrams(null, null));
        assertFalse(task3.areTheseAnagrams("abc", "abcd")); // Different lengths
    }

}
