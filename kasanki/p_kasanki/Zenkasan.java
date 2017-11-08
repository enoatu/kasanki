package p_kasanki;

public class Zenkasan {
    public Object zenkasan(int input1,int input2,int pre_kuriagari){

        Hankasan hankasan1 = new Hankasan();
        int[] arr_result1
                = (int[]) hankasan1.hankasan(input1,input2);//半加算器1の結果
        int wa1 =arr_result1[0];//和
        int kuriagari1=arr_result1[1];//繰り上がり

        Hankasan hankasan2 = new Hankasan();
        int[] arr_result2
                = (int[]) hankasan1.hankasan(wa1,pre_kuriagari);//半加算器2の結果
        int wa2 =arr_result2[0];//和
        int kuriagari2=arr_result2[1];//繰り上がり

        Calc calc = new Calc();

//        int a = calc.xor(input1[i], input2[i]);//和
//        int b = calc.and(input1[i], input2[i]);//繰り上がり

        int kuriagari = calc.or(kuriagari1, kuriagari2);//1

        int[] arr_zen = {wa2,kuriagari};

        return arr_zen;
    }
}
