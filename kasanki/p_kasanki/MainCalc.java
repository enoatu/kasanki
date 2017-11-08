package p_kasanki;

public class MainCalc {
    public Object calc(Object o_input1,Object o_input2){//2つの配列

        int[] input1 = (int[]) o_input1;
        int[] input2 = (int[]) o_input2;//配列として取得

        int[] result = new int[input1.length+1];
        int overflow =0;//initialize

//一桁目は半加算
        Hankasan hankasan0 = new Hankasan();
        int[] arr_result0= (int[]) hankasan0.hankasan(input1[0],input2[0]);

        int wa0 =arr_result0[0];//和
        int kuriagari=arr_result0[1];//繰り上がり

        result[0]=wa0;//push
        System.out.println("一桁目は半加算");
        System.out.println("0 : "+result[0]);

//以降全加算
        System.out.println("以降全加算");
        for (int i=1;i<input1.length;i++){
            Zenkasan zenkasan = new Zenkasan();//全加算
            int[] arr_result
                    = (int[]) zenkasan.zenkasan
                    (input1[i],input2[i],kuriagari);//
           result[i]= arr_result[0];//和をpush
        System.out.println(i+" : "+result[i]);
           kuriagari=arr_result[1];

        }


return result;
    }

}
