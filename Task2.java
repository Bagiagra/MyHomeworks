package by.overone.lesson27homework;

public class Task2 {
    public static void main(String[] args) {
        IOperation operation = (a, b) -> {
            int result;
            if (a < b) {
                result = a;}
                else
                if (b < a) {
                    result = b;}
                else {
                    result = 0;
                }

         return result; };

            System.out.println("Result of compare = " + operation.compare(5,5));
        }
}

interface IOperation {
    int compare (int a, int b);
    }






