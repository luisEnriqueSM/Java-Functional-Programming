import java.util.List;

public class FP01Structured {

    public static void main(String args[]){

        printAllNumbersInListStructured(List.of(12,9,13,4,12,15));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        // How to loop the numbers?
        for(int number: numbers){
            System.out.println(number);
        }

    }

}
