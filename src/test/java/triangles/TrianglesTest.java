package triangles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TrianglesTest {
    @Test
    public void threeEqualSidesIsAnEquilateralTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 3, 3);
        assertThat(triangleType).isEqualTo("Equilateral");
    }
    @Test
    public void twoEqualSidesIsAnIsoscelesTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(2, 3, 3);
        assertThat(triangleType).isEqualTo("Isosceles");
    }
    @Test
    public void aSquaredPlusBSquaredEqualsRightTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(3, 4, 5);
        assertThat(triangleType).isEqualTo("Right Triangle");
    }
    @Test
    public void ifNotOthersThenIsScaleneTriangle() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(2, 3, 4);
        assertThat(triangleType).isEqualTo("Scalene Triangle");
    }
    @Test
    public void notATriangleAtAll() {
        TriangleSorter underTest = new TriangleSorter();
        String triangleType = underTest.analyze(2, 2, 5);
        assertThat(triangleType).isEqualTo("Not A Triangle");
    }
}
