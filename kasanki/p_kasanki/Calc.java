package p_kasanki;
public class Calc {

    public int xor(int input, int input2) {

    int x=or(and(not(input),input2),and(input,not(input2)));

//        int x = 0;
//        switch (input) {
//            case 0:
//                switch (input2) {
//                    case 0:
//                        x = 0;
//                        break;
//                    case 1:
//                        x = 1;
//                        break;
//
//                }
//                break;
//            case 1:
//                switch (input2) {
//                    case 0:
//                        x = 1;
//                        break;
//                    case 1:
//                        x = 0;
//                        break;
//
//                }
//                break;
//        }
       return x;

    }

    public int and(int input, int input2) {
        int x = 0;
        switch (input) {
            case 0:
                switch (input2) {
                    case 0:
                        x = 0;
                        break;
                    case 1:
                        x = 0;
                        break;

                }
                break;
            case 1:
                switch (input2) {
                    case 0:
                        x = 0;
                        break;
                    case 1:
                        x = 1;
                        break;

                }
                break;
        }
        return x;

    }

    public int or(int input, int input2) {
        int x = 0;
        switch (input) {
            case 0:
                switch (input2) {
                    case 0:
                        x = 0;
                        break;
                    case 1:
                        x = 1;
                        break;

                }
                break;
            case 1:
                switch (input2) {
                    case 0:
                        x = 1;
                        break;
                    case 1:
                        x = 1;
                        break;

                }
                break;
        }
        return x;

    }

    public int not(int input) {
        int x = 0;
        switch (input) {
            case 0:
                x=1;

                break;
            case 1:
                x=0;

                break;
        }
        return x;

    }





}