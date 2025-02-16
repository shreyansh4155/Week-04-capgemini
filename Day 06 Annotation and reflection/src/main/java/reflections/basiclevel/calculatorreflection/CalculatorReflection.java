package reflections.basiclevel.calculatorreflection;
import java.lang.reflect.Method;
public class CalculatorReflection {
    public static void main(String[] args) {
        try {

            Calculator calculator = new Calculator();


            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);  // Allow access to private method


            int result = (int) multiplyMethod.invoke(calculator, 5, 4);

            // Display the result
            System.out.println("Multiplication Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}