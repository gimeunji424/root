import java.util.Scanner;

public class homework {
    private static double[] Buffer_data;
    private static int Index = 0;
    private static double sum = 0.0;
    private static double  max_sum = 0.0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Buffer_data = new double[5];
        Index = 0;
        sum = 0.0;

        System.out.println(5 + "���� �������� ��ĭ���� �и��Ͽ� �Է��ϼ���:");

        while (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            if (Index == Buffer_data.length) {
                sum -= Buffer_data[Index % Buffer_data.length];
            }

            Buffer_data[Index % Buffer_data.length] = value;
            sum += value;
            Index++;

            int divisor = Index > Buffer_data.length ? Buffer_data.length : Index;
            max_sum = sum / divisor;

            System.out.println("xbar:" +Index +" :" + sum / divisor);
            if(Index==5) {
            	System.out.println("5�� ������ ��� :" + max_sum);
            }

        }
        scanner.close();
        
        

    }
}
