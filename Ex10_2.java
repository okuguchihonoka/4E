import java.util.Scanner;
public class Ex10_2{
  public static void main(String[] args){
    double data1,data2;
    double division;

    Scanner scan = new Scanner(System.in);
    System.out.println("二つの整数を入力してください");
    data1 = Double.parseDouble(scan.next());
    data2 = Double.parseDouble(scan.next());
    division = data1 / data2;
    System.out.println(data1 + "/" + data2 + "=" + division + "です");
  }
}
