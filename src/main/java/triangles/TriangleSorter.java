package triangles;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            if (sideA == sideB && sideB == sideC && sideA == sideC) {
                return "Equilateral";
            } else if (sideA == sideB || sideA == sideB || sideB == sideC) {
                return "Isosceles";
            } else if ((Math.pow(sideA, 2)) + (Math.pow(sideB, 2)) == (Math.pow(sideC, 2))
                    || (Math.pow(sideB, 2)) + (Math.pow(sideC, 2)) == (Math.pow(sideA, 2))
                    || (Math.pow(sideA, 2)) + (Math.pow(sideC, 2)) == (Math.pow(sideB, 2))) {
                return "Right Triangle";
            }
            return "Scalene Triangle";
        }
        return "Not A Triangle";
    }
}