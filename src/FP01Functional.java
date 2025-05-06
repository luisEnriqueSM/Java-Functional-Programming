import java.util.List;

public class FP01Functional {

    public static void main(String args[]){

        // printAllNumbersInListFunctional(List.of(12,9,13,4,12,15));

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15 );
        //printEvenNumbersInListFunctional(numbers);

        printSquaresOfEvenNumbersInListFunctional(numbers);

    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
            .filter(number -> number % 2 == 0)
            .map(number -> number * number)
            .forEach(System.out::println);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // [12,9,13,4,12,15]
        // What to do?
        // what needs to be done with each value
        // For element i, do call print method
        // For each element of this stream do this:
        numbers.stream().forEach(System.out::println); // Method reference
    }

    private static boolean isEven(int number){
        return number % 2 == 0;
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                //.filter(FP02Functional::isEven) // Filter - Only allow even numbers
                .filter(number -> number % 2 == 0) // Using Lambda Expresion
                .forEach(System.out::println);
    }

}
