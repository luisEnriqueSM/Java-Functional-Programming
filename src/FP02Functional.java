import java.util.List;

public class FP02Functional {

    public static void main(String args[]){

        // printAllNumbersInListFunctional(List.of(12,9,13,4,12,15));

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        printEvenNumbersInListFunctional(numbers);
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
                 // Filter - Only allow even numbers
                .filter(FP02Functional::isEven)
                .forEach(System.out::println);
    }

}
