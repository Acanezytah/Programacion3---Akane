/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.palindromos.business;

import mx.itson.palindromo.business.Palindromos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Akane
 */
public class PalindromosTest {
    
    public PalindromosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of esPalindromo method, of class Palindromos.
     */
    @Test
    public void testEsPalindromo() {
        System.out.println("esPalindromo");
        String phrase = "oso";
        boolean expResult = true;
        boolean result = Palindromos.esPalindromo(phrase);
        assertEquals(expResult, result);

    }
    
}
