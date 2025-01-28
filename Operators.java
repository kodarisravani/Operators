public class Operators {
        public static void main(String[] args) {
            int a = 10;
            int b = 5;
            int c = 3;

            // Arithmetic Operators
            int sum = a + b;
            int difference = a - b;
            int product = a * b;
            int quotient = a / b;
            int remainder = a % b;
    
            System.out.println("Arithmetic Operations:");
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
    
            // Relational Operators
            boolean isEqual = a == b;
            boolean isNotEqual = a != b;
            boolean isGreater = a > b;
            boolean isLess = a < b;
            boolean isGreaterOrEqual = a >= b;
            boolean isLessOrEqual = a <= b;
    
            System.out.println("\nRelational Operations:");
            System.out.println("Is Equal: " + isEqual);
            System.out.println("Is Not Equal: " + isNotEqual);
            System.out.println("Is Greater: " + isGreater);
            System.out.println("Is Less: " + isLess);
            System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
            System.out.println("Is Less or Equal: " + isLessOrEqual);
    
            // Logical Operators
            boolean andResult = (a > b) && (a > c);
            boolean orResult = (a > b) || (a > c);
            boolean notResult = !(a > b);
    
            System.out.println("\nLogical Operations:");
            System.out.println("AND Result: " + andResult);
            System.out.println("OR Result: " + orResult);
            System.out.println("NOT Result: " + notResult);
        }
    }


