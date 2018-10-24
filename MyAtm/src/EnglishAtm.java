import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;

public class EnglishAtm {
    public void englishUi() throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your account:");
        String account=sc.nextLine();
        System.out.println("Please enter your passwd");
        String passwd=sc.nextLine();
        if (account.equals("3") && passwd.equals("333")){
            URL[] urls={new URL("file:/home/pp/")};
            URLClassLoader ucl=new URLClassLoader(urls);
            Class class1=ucl.loadClass("English1");
            Object o=class1.newInstance();
            Method method=class1.getMethod("getName");
            String name=(String) method.invoke(o);
            System.out.println("Welcome to ATM，" + name + "\n");
            Method method1=class1.getMethod("ui",  class1);
            method1.invoke(o,o);
        }
        else System.out.println("Your account or passwd is wrong!");
    }
}
