import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Devian on 03.04.2016.
 */
public class Machete100 {
    Random random = new Random();
    public static final int ARRAY_SIZE = 10;
    public static final int MAX_SIZE = ARRAY_SIZE*ARRAY_SIZE;
    private int[][] massiv = new int[ARRAY_SIZE][ARRAY_SIZE];


    private ArrayList<Integer> randomNumbers = new ArrayList<Integer>(MAX_SIZE);
    public void generateRandomNumbers(){

        for (int i = 0;i<MAX_SIZE;i++){
            Integer randomNum;
            do {
                randomNum = random.nextInt(MAX_SIZE);
            }while(randomNumbers.contains(randomNum));
            randomNumbers.add(randomNum);
        }
    }

    public void printAll(){
        int s = 0;
        for (Integer i : randomNumbers) {
            s++;
            System.out.println("Num" + s +" : " + i);
        }
    }

    public void fillArray(){
        int f = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {

                massiv[i][j] = randomNumbers.get(f);
                f++;
            }
        }
    }

    public void printArray(){
        for (int i = 0; i < massiv.length; i++) {
            String xs = "";
            for (int j = 0; j < massiv.length; j++) {
                xs+= "["+massiv[i][j]+"]";
            }
            System.out.println(xs);
        }
    }


    public static void main(String[] args) {
        Machete100 machete = new Machete100();
        machete.generateRandomNumbers();
        machete.printAll();
        machete.fillArray();
        machete.printArray();



    }


}
