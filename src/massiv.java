import java.util.Arrays;
import java.util.Scanner;

    public class massiv {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива = ");
            int len = scanner.nextInt();
            int [] mass = new int[len];
            for (int i = 0; i < len; i++)
            {
                System.out.printf("Введите число для массива %d = ", i);
                mass[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(mass));

            int min;
            for (int i = 0; i < mass.length-1; i++)
            {
                min=i;
                for(int j=i; j<mass.length; j++)
                {
                 if (mass[min] > mass[j])
                 {
                     min=j;
                 }
                }
                int temp=mass[i];
                mass[i]=mass[min];
                mass[min]=temp;
            }

            System.out.println(Arrays.toString(mass));
        }
    }



