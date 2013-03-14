import java.util.Random;

public class Main {


    Main(){
        int x = (int)(Math.random()*10);

        if (x<5){
            System.out.println("UNDER FIVEUUUU");
            System.out.println(x);
        }
        else {
            System.out.println("SOMETHING ELSUUUUU");
            System.out.println(x);

        }
    }

    public static void main(String[] args) {
	    new Main();

    }
}
