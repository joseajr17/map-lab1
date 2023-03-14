package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest { 
	 
    @Test 
    public void equilateralTriangleHaveEqualSides() throws Exception { 
        Triangle triangle = new Triangle(2, 2, 2); 
 
        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind()); 
    }
    
    @Test 
    public void isoscelesTriangle() throws Exception { 
        Triangle triangle = new Triangle(10, 10, 12); 
 
        assertEquals(TriangleKind.ISOSCELES, triangle.getKind()); 
    }
    
    @Test 
    public void scaleneTriangle() throws Exception { 
        Triangle triangle = new Triangle(6, 8, 10); 
 
        assertEquals(TriangleKind.SCALENE, triangle.getKind()); 
    }
    
    @Test
    void allSidesAreZero() {
        assertThrows(TriangleException.class, () -> new Triangle(0, 0, 0));
    }
    
    @Test
    void hasImpossibleSides() {
        assertThrows(TriangleException.class, () -> new Triangle(-1, 0, 0));
    }

    
}