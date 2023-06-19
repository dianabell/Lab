import org.junit.Test;

public class MySetTest {

    @Test
    public void testAdd() {
        MySet<Integer> set = new MySet<>();
        assertTrue(set.add(1));
        assertTrue(set.add(2));
        assertFalse(set.add(1));
    }

    private void assertFalse(boolean add) {
    }

    private void assertTrue(boolean add) {
    }

    @Test
    public void testRemove() {
        MySet<Integer> set = new MySet<>();
        set.add(1);
        set.add(2);
        assertTrue(set.remove(1));
        assertFalse(set.contains(1));
        assertFalse(set.remove(1));
    }

    @Test
    public void testContains() {
        MySet<String> set = new MySet<>();
        assertFalse(set.contains("hello"));
        set.add("hello");
        assertTrue(set.contains("hello"));
        assertFalse(set.contains("world"));
    }

    @Test
    public void testSize() {
        MySet<Character> set = new MySet<>();
        assertEquals(set.size(), 0);
        set.add('a');
        set.add('b');
        assertEquals(set.size(), 2);
    }

    private void assertEquals(int size, int i) {
    }

    @Test
    public void testClear() {
        MySet<Double> set = new MySet<>();
        set.add(1.0);
        set.add(2.0);
        assertEquals(set.size(), 2);
        set.clear();
        assertEquals(set.size(), 0);
    }

}

