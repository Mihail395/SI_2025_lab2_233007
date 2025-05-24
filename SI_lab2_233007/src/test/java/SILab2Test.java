import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.*;

public class SILab2Test {
    @Test
    public void testEveryStatement() {
        RuntimeException ex1 = assertThrows(RuntimeException.class,
                () -> SILab2.checkCart(null, "1234567812345678"));
        assertEquals("allItems list can't be null!", ex1.getMessage());

        List<Item> items1 = List.of(new Item(null, 1, 100, 0));
        RuntimeException ex2 = assertThrows(RuntimeException.class,
                () -> SILab2.checkCart(items1, "1234567812345678"));
        assertEquals("Invalid item!", ex2.getMessage());

        List<Item> items2 = List.of(new Item("Laptop", 2, 100, 0));
        assertEquals(200, SILab2.checkCart(items2, "1234567812345678"));

        List<Item> items3 = List.of(new Item("Laptop", 1, 400, 0));
        assertEquals(370, SILab2.checkCart(items3, "1234567812345678"));

        List<Item> items4 = List.of(new Item("Laptop", 2, 350, 0.5));
        assertEquals(320, SILab2.checkCart(items4, "1234567812345678"));
    }

    @Test
    public void testMultipleCondition() {
        List<Item> a = List.of(new Item("a", 1, 100, 0));
        assertEquals(100, SILab2.checkCart(a, "1234567812345678"));

        List<Item> b = List.of(new Item("b", 1, 400, 0));
        assertEquals(370, SILab2.checkCart(b, "1234567812345678"));

        List<Item> c = List.of(new Item("C", 2, 350, 0.5));
        assertEquals(320, SILab2.checkCart(c, "1234567812345678"));

        List<Item> d = List.of(new Item("D", 11, 100, 0));
        assertEquals(1070, SILab2.checkCart(d, "1234567812345678"));
    }
}
