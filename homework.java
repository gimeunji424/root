import java.util.Scanner;

public class homework {
    private static double[] dataBuffer;
    private static int currentIndex = 0;
    private static double sum = 0.0;
    private static double  max_sum = 0.0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dataBuffer = new double[5];
        currentIndex = 0;
        sum = 0.0;

        System.out.println(5 + "���� �������� ��ĭ���� �и��Ͽ� �Է��ϼ���:");

        while (scanner.hasNextDouble()) {
            double value = scanner.nextDouble();
            if (currentIndex == dataBuffer.length) {
                sum -= dataBuffer[currentIndex % dataBuffer.length];
            }

            dataBuffer[currentIndex % dataBuffer.length] = value;
            sum += value;
            currentIndex++;

            int divisor = currentIndex > dataBuffer.length ? dataBuffer.length : currentIndex;
            max_sum = sum / divisor;

            System.out.println("xbar:" +currentIndex +" :" + sum / divisor);
            if(currentIndex==5) {
            	System.out.println("5�� ������ ��� :" + max_sum);
            }

        }
        scanner.close();
        
        

    }
}
