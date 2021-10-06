package by.bsuir.lab1.elementary;

import java.util.Scanner;

public class Lab_1 {
    private Scanner in = new Scanner(System.in);
    public void Close()
    {
        in.close();
    }

    public void task_1()
    {
        System.out.print("X = ");
        double x = in.nextDouble();
        System.out.println();

        System.out.print("Y = ");
        double y = in.nextDouble();

        double z = (1 + Math.pow(Math.sin(x+y), 2)) / (2 + Math.abs(x - 2*x / (1 + x*x*y*y))) + x;
        System.out.println(z);

        in.close();
    }

    public void task_2()
    {
        System.out.print("x=");
        double x = in.nextDouble();
        System.out.print("y=");
        double y = in.nextDouble();

        final int x1 = 4;
        final int x2 = 6;
        final int y1 = 5;
        final int y2 = -3;

        if (y < 0)
        {
            if (y > y2 && Math.abs(x) < x2)
                System.out.println("true");
            else
                System.out.println("false");
        }
        else
        {
            if (y < y1 && Math.abs(x) < x1)
                System.out.println("true");
            else
                System.out.println("false");
        }

    }

    public void task_3()
    {
        System.out.print("a=");
        double a = in.nextDouble();
        System.out.print("b=");
        double b = in.nextDouble();
        System.out.print("h=");
        double h = in.nextDouble();

        double x = a;

        while (x < b)
        {
            System.out.print(x);
            System.out.print(" ");
            System.out.println(Math.tan(x));
            x += h;
        }
    }

    public void task_4()
    {
        System.out.print("len=");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.print("array[]=");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < len; i++)
        {
            boolean isSimple = true;
            for (int j = 2; j < Math.round(Math.sqrt(arr[i])) + 1; j++)
            {
                if (arr[i] % j == 0)
                {
                    isSimple = false;
                }
            }
            if (isSimple)
            {
                System.out.println(i);
            }
        }

    }

    public void task_5()
    {
        System.out.print("len=");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.print("array[]=");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        boolean isUp;
        int currPos;
        int maxLen = 0;

        for (int i = 0; i < len; i++) {
            isUp = true;
            currPos = 1;
            for (int j = i + 1; (j < len) && isUp; j++) {
                if (arr[j - 1] < arr[j]) {
                    currPos++;
                } else {
                    isUp = false;
                }
            }

            maxLen = maxLen > currPos ? maxLen : currPos;

        }

        System.out.println(maxLen);
    }

    public void task_6()
    {
        System.out.print("len=");
        int len = in.nextInt();
        int[] arr = new int[len];
        System.out.print("array[]=");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        int pos = 0;
        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < len; j++)
            {
                System.out.print(arr[(j+pos) % len]);
            }
            pos++;
            System.out.println();
        }
    }

    public void task_7()
    {
        System.out.print("len=");
        int len = in.nextInt();
        double[] arr = new double[len];
        System.out.print("array[]=");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextDouble();
        }

        int i = 0;
        while (i < len-1)
        {
            if(arr[i] <= arr[i + 1])
                i++;
            else
            {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                if(i != 0)
                    i--;
            }
        }

        for (i = 0; i < len; i++)
        {
            System.out.print(arr[i]);
            System.out.print("  ");
        }
    }

    public void task_8()
    {
        System.out.print("len A=");
        int lenA = in.nextInt();
        double[] arrA = new double[lenA];
        System.out.print("array A[]=");
        for (int i = 0; i < lenA; i++) {
            arrA[i] = in.nextDouble();
        }

        System.out.print("len B=");
        int lenB = in.nextInt();
        double[] arrB = new double[lenB];
        System.out.print("array B[]=");
        for (int i = 0; i < lenB; i++) {
            arrB[i] = in.nextDouble();
        }


        int posA = 0, posB = 0, index = 0;

        while (posA < lenA)
        {
            if (arrB[posB] < arrA[posA])
            {
                System.out.print(index);
                System.out.print("  ");
                posB++;
            }
            else
            {
                posA++;
                index++;
            }

        }

        while (posB != lenB)
        {
            System.out.print(index);
            System.out.print("  ");
            posB++;
        }
    }


}
