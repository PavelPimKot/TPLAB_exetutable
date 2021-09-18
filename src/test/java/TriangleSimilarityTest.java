import TriangleStuffPackage.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TriangleSimilarityTest {

    @Test
    public void twoSimilarTriangleSimilarToEachOtherInAnyDirection() {
        Triangle firstTriangle = Triangle.valueOf(0, 0, 12, 12, 0, 20);
        Triangle secondTriangle = Triangle.valueOf(0, 0, 24, 24, 0, 40);
        assertTrue(firstTriangle.isSimilar(secondTriangle));
        assertTrue(secondTriangle.isSimilar(firstTriangle));
    }

    @Test
    public void twoSimilarTriangleNotSimilarToEachOtherInAnyDirection() {
        Triangle firstTriangle = Triangle.valueOf(0, 0, 12, 12, 0, 20);
        Triangle secondTriangle = Triangle.valueOf(0, 0, 24, 24, 0, 45);
        assertFalse(firstTriangle.isSimilar(secondTriangle));
        assertFalse(secondTriangle.isSimilar(firstTriangle));
    }

    @Test
    public void twoSimilarOrthogonalTriangleSimilarInAnyDirection() {
        Triangle firstTriangle = Triangle.valueOf(0, 0, 5, 0, 0, 4);
        Triangle secondTriangle = Triangle.valueOf(0, 0, 25, 0, 0, 20);
        assertTrue(firstTriangle.isSimilar(secondTriangle));
        assertTrue(secondTriangle.isSimilar(firstTriangle));
    }

    @Test
    public void twoNotSimilarOrthogonalTriangleNotSimilarInAnyDirection() {
        Triangle firstTriangle = Triangle.valueOf(0, 0, 5, 0, 0, 3);
        Triangle secondTriangle = Triangle.valueOf(0, 0, 25, 0, 0, 20);
        assertFalse(firstTriangle.isSimilar(secondTriangle));
        assertFalse(secondTriangle.isSimilar(firstTriangle));
    }

    @Test
    public void triangleSimilarToItSelf() {
        Triangle firstTriangle = Triangle.valueOf(0, 0, 5, 0, 0, 3);
        assertTrue(firstTriangle.isSimilar(firstTriangle));
    }

    @Test
    public void twoIsoscelesSimilarTriangleSimilarToEachOtherInAnyDirection() {
        Triangle firstTriangle = Triangle.valueOf(0, 0, 5, 0, 0, 5);
        Triangle secondTriangle = Triangle.valueOf(0, 0, 50, 0, 0, 50);
        assertTrue(firstTriangle.isSimilar(secondTriangle));
        assertTrue(secondTriangle.isSimilar(firstTriangle));
    }

    @Test
    public void twoIsoscelesNotSimilarTriangleNotSimilarToEachOtherInAnyDirection() {
        Triangle firstTriangle = Triangle.valueOf(0, 0, 5, 0, 0, 5);
        Triangle secondTriangle = Triangle.valueOf(0, 0, 25, 0, 0, 23);
        assertFalse(firstTriangle.isSimilar(secondTriangle));
        assertFalse(secondTriangle.isSimilar(firstTriangle));
    }
}
