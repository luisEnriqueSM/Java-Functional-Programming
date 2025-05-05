import java.util.List;

public class FP02Functional {

    public static void main(String args[]){

        printAllNumbersInListFunctional(List.of(12,9,13,4,12,15));
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // [12,9,13,4,12,15]
        // What to do?
        // what needs to be done with each value
        // For element i, do call print method
        numbers.stream().forEach(FP02Functional::print); // Method reference
    }

    private static void print(int number){
        System.out.println(number);
    }

}
