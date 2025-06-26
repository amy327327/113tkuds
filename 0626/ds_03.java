import java.util.Scanner;

public class ds_03 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("請輸入你的姓名：");
        String name = s.nextLine();
        System.out.print("請輸入你的年齡：");
        int age = s.nextInt();
        System.out.print("請輸入你所在的城市：");
        String city = s.nextLine();
        System.out.println("\n輸入的個人資訊如下：");
        System.out.println("姓名：" + name);
        System.out.println("年齡：" + age);
        System.out.println("城市：" + city);

    
}
}
