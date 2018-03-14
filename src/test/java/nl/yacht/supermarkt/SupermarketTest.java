package nl.yacht.supermarkt;

import junit.framework.TestCase;

public class SupermarketTest extends TestCase {

    public void testIsProductInStock() {
        // Arrange
        String name = "cola";
        boolean expected = false;

        // Act
        Supermarket s = new Supermarket();
        boolean result = s.isProductInStock(name);

        // Assert
        assertFalse(result);
    }
}