package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void testAddReturnsCount() {
        PhoneBook pb = new PhoneBook();
        assertEquals(1, pb.add("Alice", "12345"));
        assertEquals(2, pb.add("Bob", "67890"));
        assertEquals(2, pb.add("Alice", "54321"));
    }

    @Test
    void testFindByNumber() {
        PhoneBook pb = new PhoneBook();
        pb.add("Alice", "12345");
        pb.add("Bob", "67890");
        assertEquals("Alice", pb.findByNumber("12345"));
        assertNull(pb.findByNumber("00000")); // несуществующий номер
    }

    @Test
    void testFindByName() {
        PhoneBook pb = new PhoneBook();
        pb.add("Alice", "12345");
        pb.add("Bob", "67890");
        assertEquals("67890", pb.findByName("Bob"));
        assertNull(pb.findByName("Charlie")); // несуществующее имя
    }

}