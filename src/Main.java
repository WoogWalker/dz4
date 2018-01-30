import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {
        boolean status = true;
        int taskSelect = 0;

        while (status){
            System.out.println();
            System.out.println("1. first task");
            System.out.println("2. draw rect");
            System.out.println("4. getMax");
            System.out.println("5. fifth task");
            System.out.println("6. sixth task");

            taskSelect = sc.nextInt();

            switch (taskSelect){

                case 1:
                    System.out.println("enter num ..");
                    int q = sc.nextInt();
                    firstTask(q);

                    break;

                case 2:
                    System.out.println("enter num ..");
                    int squareWidth = sc.nextInt();
                    drawRect(squareWidth);
                    break;

                case 4:
                    System.out.println("first num ..");
                    int a = sc.nextInt();

                    System.out.println("second num ..");
                    int b = sc.nextInt();

                    System.out.println("max num" + GetMax(a, b));
                    break;

                case 5:
                    System.out.println("enter num ..");
                    int l = sc.nextInt();
                    fifthTask(l, 1);
                    break;

                case 6:
                    System.out.println("enter num ..");
                    int sqWidth = sc.nextInt();
                    //  sixthTask(sqWidth, 1);
                    sixthLast(sqWidth, 1);
                    break;
            }
        }
    }

    // 1
    public static void firstTask(int b){
        for (int i = 1; i <= b; i ++){
            System.out.println(i);
        }
    }

    // 2
    public static void drawLine (int a, char b){
        for (int p = 0; p < a; p++){
            System.out.print(b);
        }
    }

    public static void drawRect(int c){
        for(int i = 0; i < c; i++){
            drawLine(c, '_');
            System.out.println();
        }
    }

    // 3 https://app.schoology.com/assignment/1366565253/info task s empty)

    // 4
    public static int GetMax(int a, int b){
        int c = 0;

        if (a > b){
            c = a;
        }else if(b > a){
            c = b;
        }
        return c;
    }

    //5
    public static void fifthTask(int x, int b){
        System.out.println(b);
        b++;
        if (b <= x){
            fifthTask(x, b);
        }
    }

    //6

    public static void sixthTask(int WIDTH, int counter){
        System.out.print("X");

        //rSystem.out.println("counter: " + counter);

        if (WIDTH > counter){
            counter += 1;
            sixthTask(WIDTH, counter);
        }
    }

    public static void sixthLast(int x, int counter){
        sixthTask(x, 1);
        System.out.println();
        if (x > counter){
            counter++;
            sixthLast(x, counter);
        }
    }
}