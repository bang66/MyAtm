import java.io.*;
import java.util.Scanner;

public class Chinese1 {
    private  String name="王华";
    private int money=1000;

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
        File file=new File("/home/pp/c1.txt");
        FileWriter fw=new FileWriter(file);
        FileReader fr = new FileReader("/home/pp/c1.txt");
        BufferedReader br = new BufferedReader(fr);


        Scanner sc=new Scanner(System.in);
        while (true) {
            new String();
            String str = "";
            System.out.println("1.查询余额\n2.存钱\n3.取钱\n4.查看记录\n5.退出");
            String str1 = sc.next();
            int i,j;
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
                    chinese1.saveMoney( i=sc.nextInt());
                    fw.write("您存入了 "+i+" \n");
                    fw.flush();
                    break;
                case "3":
                    System.out.println("请输入您要取的金额");
                    chinese1.getMoney(j=sc.nextInt());
                    fw.write("您取出了 "+j+" \n");
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
