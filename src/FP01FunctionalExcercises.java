import java.util.Comparator;
import java.util.List;

public class FP01FunctionalExcercises {

    public static void main(String args[]){

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        // 1. Print only odd numbers from the list
        //printEvenNumbersInListFunctional(numbers);

        // 2. Print all courses individually
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kuberneter");
        //printAllCourses(courses);

        // 3. Print courses containing the word "Spring"
        //printSpringCourses(courses);

        // 4. Print courses whose name has at least 4 letters
        //printCoursesWith4letters(courses);
        
        // 5. Print the cubres of odd numbers
        //printCubeOfOddNumbers(numbers);

        // 6. Print the number of characters in each course name
        //printNumberOfCharactersInEachCourseName(courses);

        // Convert courses to uppercase
        //printUpperCaseCourses(courses);

        // Summ all numbers of the list
        //printTotalSumOfNumbers(numbers);

        // Count elements which contains letter A
        //countElementsWhichContainsLetterA(courses);

        // Get lenght of each word
        printlenghtOfEachCourse(courses);
    }

    private static void printlenghtOfEachCourse(List<String> courses) {
        courses.stream()
            .sorted(Comparator.comparingInt(String::length))
            .map(course -> course + ": " + course.length())
            .forEach(System.out::println);
    }

    private static void countElementsWhichContainsLetterA(List<String> courses) {
        long suma = courses.stream()
            .filter(course -> course.toLowerCase().contains("a"))
            .count();
        System.out.println(suma);
    }

    private static void printTotalSumOfNumbers(List<Integer> numbers) {
        int suma = numbers.stream()
                        .reduce(0, (acumulador, elemento) -> acumulador + elemento);
        System.out.println(suma);
                        
    }

    private static void printUpperCaseCourses(List<String> courses) {
        courses.stream()
            .map(course -> course.toUpperCase())
            .forEach(System.out::println);
    }

    private static void printNumberOfCharactersInEachCourseName(List<String> courses) {
        courses.stream()
            .map(course -> course + ": " + course.length())
            .forEach(System.out::println);
    }

    private static void printCubeOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
            .filter(number -> number % 2 != 0)
            .map(number -> number * number * number)
            .forEach(System.out::println);
    }

    private static void printCoursesWith4letters(List<String> courses) {
        courses.stream()
            .filter(course -> course.length() >= 4)
            .forEach(System.out::println);
    }

    private static void printSpringCourses(List<String> courses) {
        courses.stream()
            .filter(course -> course.contains("Spring"))
            .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
            .forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
       numbers.stream()
            .filter(number -> number % 2 != 0)
            .forEach(System.out::println);
    }

    

}
