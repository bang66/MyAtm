import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;

public class ChineseAtm {

    public void  chineseUi() throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

            System.out.println("请输入帐号：");
            Scanner sc = new Scanner(System.in);
            String account = sc.nextLine();
            System.out.println("\n");
            System.out.println("请输入密码：");
            String passwd = sc.nextLine();
            URL[] urls={new URL("file:/home/pp")};
            if (account.equals("1") && passwd.equals("111")) {
                URLClassLoader ucl=new URLClassLoader(urls);
                Class class1=ucl.loadClass("Chinese1");
                Object o=class1.newInstance();
                Method method=class1.getMethod("getName");
                String name=(String) method.invoke(o);
                System.out.println("欢迎您，" + name + "\n");
                Method method1=class1.getMethod("ui",  class1);
                method1.invoke(o,o);
            }
            else if (account.equals("2") && passwd.equals("222")) {
            URLClassLoader ucl=new URLClassLoader(urls);
            Class class1=ucl.loadClass("Chinese2");
            Object o=class1.newInstance();
            Method method=class1.getMethod("getName");
            String name=(String) method.invoke(o);
            System.out.println("欢迎您，" + name + "\n");
            Method method1=class1.getMethod("ui",  class1);
            method1.invoke(o,o);
            }
            else System.out.println("您的帐号或者密码有误\n");
    }
    public void Ui() throws MalformedURLException, ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        while (true) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("********************欢迎来到ATM*************************");
            System.out.println("********************请选择语言**************************");
            System.out.println("***********1.中文********************2.English*********");
            System.out.println("*********************退出请输入q************************");
            String command=sc2.next();
            if (command.equals("q")){
                System.out.println("*********************谢谢使用，再见**********************");
                break;
            }
            else if (command.equals("1")){
                ChineseAtm chineseAtm=new ChineseAtm();
                chineseAtm.chineseUi();
            }
            else if (command.equals("2")){
                URL[] urls={new URL("file:/home/pp/")};
                URLClassLoader ucl=new URLClassLoader(urls);
                Class clazz=ucl.loadClass("EnglishAtm");
                Object o=clazz.newInstance();
                Method method=clazz.getMethod("englishUi");
                method.invoke(o);
            }
        }
    }
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InstantiationException, NoSuchMethodException, InvocationTargetException {

    ChineseAtm chineseAtm=new ChineseAtm();
    chineseAtm.Ui();

    }
}
