import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {
        boolean status = true;
        int taskSelect = 0;

        while (status){
            System.out.println();
            System.out.println("1. counter");
            System.out.println("2. draw rect");
            System.out.println("3. draw square");
            System.out.println("4. getMax");
            System.out.println("5. counter recursion");
            System.out.println("6. draw rect recursion");

            System.out.println("9. exit");

            taskSelect = sc.nextInt();

            switch (taskSelect){

                case 1:
                    System.out.println("enter num ..");
                    int q = sc.nextInt();
                    firstTask(q);
                    break;

                case 2:
                    System.out.println("enter width ..");
                    int width = sc.nextInt();

                    System.out.println("enter height ..");
                    int height = sc.nextInt();

                    drawSquare(width, height);

                    break;

                case 3:
                    System.out.println("enter side of the square ..");
                    int squareWidth = sc.nextInt();
                    drawRect(squareWidth);
                    break;

                case 4:
                    System.out.println("first num ..");
                    float a = sc.nextFloat();

                    System.out.println("second num ..");
                    float b = sc.nextFloat();

                    System.out.println("max num: " + GetMax(a, b));
                    break;

                case 5:
                    System.out.println("enter num ..");
                    int l = sc.nextInt();
                    fifthTask(l, 1);
                    break;

                case 6:
                    System.out.println("enter width ..");
                    int rectWidth = sc.nextInt();

                    System.out.println("enter height");
                    int rectHeight = sc.nextInt();

                    drawRectangleRecursion(rectWidth, rectHeight, 1);
                    break;

                case 9:
                    System.out.println("EXIT");
                    status = false;
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

    public static void drawSquare(int width, int height){
        for(int i = 0; i < height; i++){
            drawLine(width, 'x');
            System.out.println();
        }
    }

    // 3
    public static void drawRect(int c){
        for(int i = 0; i < c; i++){
            drawLine(c, '*');
            System.out.println();
        }
    }

    // 4
    public static float GetMax(float a, float b){
        float c = 0;

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

    public static void drawLineRecursion(int width, int counter){
        System.out.print("x");
        counter++;
        if(counter <= width){
            drawLineRecursion(width, counter);
        }
    }

    public static void drawRectangleRecursion(int width, int height, int counter){
        drawLineRecursion(width, 1);
        System.out.println();
        counter++;
        if (counter <= height){
            drawRectangleRecursion(width, height, counter);
        }
    }

}
