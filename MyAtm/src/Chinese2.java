import java.io.*;
import java.util.Scanner;

public class Chinese2 {
    private  String name="小明";
    private int money=2000;

    public void saveMoney(int money1) {
        this.money = money+money1;
    }
    public void getMoney(int money1){
        this.money=money-money1;
    }
    public String getName(){
        return name;
    }
    public int getMoney(){
        return money;
    }
    public void ui(Chinese1 chinese1) throws IOException {
        File file=new File("/home/pp/c2.txt");
        FileWriter fw=new FileWriter(file);
        FileReader fr = new FileReader("/home/pp/c2.txt");
        BufferedReader br = new BufferedReader(fr);

        Scanner sc=new Scanner(System.in);
        while (true) {
            new String();
            String str = "";
            System.out.println("1.查询余额\n2.存钱\n3.取钱\n4.查看记录\n5.退出");
            String str1 = sc.next();
            int p,q;
            if (str1.equals("5"))
                break;
            switch (str1) {
                case "1":
                    System.out.println("您的余额为" + money);
                    fw.write("您查询了余额\n");
                    fw.flush();
                    break;
                case "2":
                    System.out.println("请放入现金，并输入金额：");
                    chinese1.saveMoney(p=sc.nextInt());
                    fw.write("您存入了 "+p+" \n");
                    fw.flush();
                    break;
                case "3":
                    System.out.println("请输入您要取的金额");
                    chinese1.getMoney(q=sc.nextInt());
                    fw.write("您取出了 "+q+" \n");
                    fw.flush();
                    break;
                case "4":
                    while((str=br.readLine())!=null){
                        System.out.println(str);
                    }
            }
        }
        fw.close();
        fr.close();
    }
}
