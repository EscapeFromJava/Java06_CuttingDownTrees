import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ����� ���-�� ��������");
        int n = scan.nextInt();
        System.out.println("������� ���-�� ��������, ������� ������ ��������");
        int m = scan.nextInt();

        int space = 1;
        int count = n - m + 1;
        while(m + (space * (m - 1)) - 1 <= n){
            if (m + (space * (m - 1)) - 1 <= n)
                count += n - (m + (space * (m - 1))) + 1;
            space++;
        }
        System.out.println("���-�� ��������: " + count);
    }
}
