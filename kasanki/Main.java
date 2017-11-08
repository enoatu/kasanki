import java.util.Scanner;
import p_kasanki.*;
//本末転倒だがどこまで長くシンプルにつくれるか
public class Main {

    public static void main(String[] args) {

        try{
            System.out.println("1:2進数を入力して下さい。");

        Scanner scan1 = new Scanner(System.in);
        String s_in1 = scan1.next();//入力値取得


        int[] input1 = (int[]) Change.changeInput(0+s_in1);//入力値を逆順にし、int配列へ


        System.out.println("2:同じ桁の2進数を入力して下さい。");

        Scanner scan2 = new Scanner(System.in);
        String s_in2 = scan2.next();//入力値取得

        int input2[] =(int[])Change.changeInput(0+s_in2);//入力値を逆順にし、int配列へ



        MainCalc mainCalc = new MainCalc();
        int[] arr_result= (int[]) mainCalc.calc(input1,input2);
        int[] sorted_result= (int[]) Change.sort(arr_result);//順番入れ替え

        String s_result="";//initialize

        if (sorted_result[0]==1){//if overflow

            for (int i=0;i<arr_result.length;i++) {//結合
                s_result += sorted_result[i];//intからstring
//                System.out.println(i+" : "+sorted_result[i]);

            }

        System.out.println("overflow : "+sorted_result[0]);
            System.out.println("result : "+s_result);
        }else{

            for (int i=1;i<arr_result.length;i++) {//結合
                s_result += sorted_result[i];//intからstring
//                System.out.println(i+" : "+sorted_result[i]);

            }

            System.out.println("overflow : なし");
            System.out.println("result : "+s_result);
        }
        }catch (Exception e){
            System.out.println("正しく入力してください");
        }


    }
}