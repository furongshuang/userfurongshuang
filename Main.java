import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
    String userName;
    public static void main(String[]args){
/*           用Scanner类来完成方便
            Scanner scanner=new Scanner(System.in);
            这了scanner这个对象就可以读取键盘输入了
            如：scanner.nextInt();读取一个整数
               scanner.nextLine();读取一行字符串。
*/
       //定义用户变量
        String userName;
        String sex;
        int  age;
        String str="/^[\u4e00-\u9fa5]+$/";
        List<Object> userMap= new ArrayList<>();
        Scanner a=new Scanner(System.in);
        System.out.println("请输入用户名");
        userName=a.nextLine();
            if (userName.equals(str)) {
                userMap.add(userName);
            } else {
                System.out.println("请从新输入正确的中文名称");
                userName = a.nextLine();
                userMap.add(userName);
                return ;
            }

        System.out.println("请输入你的性别");
            sex = a.nextLine();
        if(sex.equals("女")||sex.equals("男")){
            userMap.add(sex);
        }else{
            System.out.println("请从新输入正确的性别：女或男");
              sex = a.nextLine();
              userMap.add(sex);
              return ;
        }
        System.out.println("请输入你的年龄");
             age =a.nextInt();
             userMap.add(age);
        //循环用户输入的值 一起打印到控制台
        for (Object us : userMap) {
            System.out.println(us);
        }

    }
}
