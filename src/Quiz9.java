import java.util.ArrayList;
public class Quiz9 {

    static ArrayList<Integer> quiz = new ArrayList<>();

    public static ArrayList<Integer> quiz(){
        int i;
        for (i = 1; i < 101; i++){
            quiz.add(i);
        }return quiz;

    }
    public static void printArray(ArrayList<Integer> quiz){
        System.out.print("{" + quiz.get(0));
        for (int elements : quiz){
            System.out.print(", " + elements);
        }
        System.out.println("}");
    }
    static int sum = 0;
    public static int sumArray(ArrayList<Integer> quiz){
        for(int number : quiz){
            sum += number;
        }return sum;
    }

    public static void main(String[] args) {
    quiz();
    printArray(quiz);
    int sum = sumArray(quiz);
        System.out.println(sum);
    }
}