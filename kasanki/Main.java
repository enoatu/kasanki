import java.util.Scanner;
import p_kasanki.*;
//本末転倒どこまで長くシンプルにつくれるか
public class Main {

    public static void main(String[] args) {

        System.out.println("1:8bit2進数を入力して下さい。");

        Scanner scan1 = new Scanner(System.in);
        String s_in1 = scan1.next();//入力値取得

        Change change1 = new Change();

        int[] input1 = (int[]) Change.changeInput(0+s_in1);//入力値を逆順にし、int配列へ


        System.out.println("2:8bit2進数を入力して下さい。");

        Scanner scan2 = new Scanner(System.in);
        String s_in2 = scan2.next();//入力値取得


        int input2[] =(int[])Change.changeInput(0+s_in2);//入力値を逆順にし、int配列へ

        MainCalc mainCalc = new MainCalc();
        int[] arr_result= (int[]) mainCalc.calc(input1,input2);
        Change.sort(arr_result);//順番入れ替え
        String s_result=null;
        for (int Arr_result : arr_result) {//結合
            s_result += String.valueOf(Arr_result);//intからstring
        }
        System.out.println("overflow : "+arr_result[0]);
        System.out.println("result : "+s_result);
//
//
//        if (result.length > input1.length){
//            overflow=result[input1.length+1];
//        }
//
//
//
//        int[] allresult={overflow,
//
//        }
//        System.out.println("a :" + a);
//        System.out.println("b :" + b);
//
//        System.out.println("s :" + s);
//        System.out.println("cc :" + cc);
    }
}