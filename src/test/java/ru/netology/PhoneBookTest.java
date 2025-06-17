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

}