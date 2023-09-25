class CharProblem {
    public static int howOld(final String herOld) {
        // return Character.getNumericValue(herOld.charAt(0));
        // that was the 1-liner that could've solved all these.
        char age;
        int result = 0;
        age = herOld.charAt(0);
        switch(age) {
            case '0':
                result = 0;
                break;
            case '1':
                result = 1;
                break;
            case '2':
                result = 2;
                break;
            case '3':
                result = 3;
                break;
            case '4':
                result = 4;
                break;
            case '5':
                result = 5;
                break;
            case '6':
                result = 6;
                break;
            case '7':
                result = 7;
                break;
            case '8':
                result = 8;
                break;
            case '9':
                result = 9;
                break;
        }
        return herOld.charAt(0) - '0';


    }
}
public class Main {
    public static void main(String[] args) {

    }
}