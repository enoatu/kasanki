package p_kasanki;


public class Hankasan {
    public Object hankasan(int a ,int b ){
        Calc calc = new Calc();

        int aa = calc.xor(a,b);//和
        int bb = calc.and(a,b);//繰り上がり

        int[] ab={aa,bb};

        return ab;
    }



}
