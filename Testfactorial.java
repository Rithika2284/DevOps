public class TestFactorial {
    public static void main(String[] args) {

        if (Factorial.compute(0) != 1) {
            System.out.println(" Test failed for input 0");
            throw new AssertionError("Expected 1 but got " + Factorial.compute(0));
        } else {
            System.out.println(" Test passed for input 0");
        }

        if (Factorial.compute(5) != 120) {
            System.out.println(" Test failed for input 5");
            throw new AssertionError("Expected 120 but got " + Factorial.compute(5));
        } else {
            System.out.println(" Test passed for input 5");
        }

        System.out.println(" All tests completed.");
    }
}
