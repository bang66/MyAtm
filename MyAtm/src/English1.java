import java.io.*;
import java.util.Scanner;

public class English1 {
    private  String name="Tom";
    private int money=3000;

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
    public void ui(English1 english1) throws IOException {
        File file=new File("/home/pp/e1.txt");
        FileWriter fw=new FileWriter(file);
        FileReader fr = new FileReader("/home/pp/e1.txt");
        BufferedReader br = new BufferedReader(fr);

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("1.inquire money\n2.save money\n3.get money\n4.check record\n5.quit");
            String str1 = sc.next();
            new String();
            String str = "";
            int i,j;
            if (str1.equals("5"))
                break;
            switch (str1) {
                case "1":
                    System.out.println("Your money is:" + money);
                    fw.write("you hava inquired your money\n");
                    fw.flush();
                    break;
                case "2":
                    System.out.println("Please enter the money that you want to sava：");
                    english1.saveMoney(i=sc.nextInt());
                    fw.write("you have saved "+i+" money\n");
                    fw.flush();
                    break;
                case "3":
                    System.out.println("Please enter the money that you want to get:");
                    english1.getMoney(j=sc.nextInt());
                    fw.write("you have get "+j+" money\n");
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
