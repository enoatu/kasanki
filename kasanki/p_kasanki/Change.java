package p_kasanki;
public class Change {

    public static Object changeInput(String s_in) {
        String[] s_arr_in = s_in.split("");

        int[] mvarr = new int[s_arr_in.length]; //return

        for (int i = 0; i < s_arr_in.length ; i++) {

            mvarr[i] = Integer.parseInt(s_arr_in[s_arr_in.length - 1 - i]);
//            System.out.println(i+" : "+mvarr[i]);

        }

        return mvarr;
    }

    public static Object sort(Object in) {
        System.out.println("順番並び替え");
        int[] int_in = (int[]) in;
        int[] mvarr = new int[int_in.length]; //return

        for (int i = 0; i < int_in.length ; i++) {

            mvarr[i] =int_in[int_in.length - 1 - i];

//            System.out.println(i+" : "+mvarr[i]);

        }
        return mvarr;
    }

}
