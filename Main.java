class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int sheep = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            // need to address the null first before going into true and false.
            if (arrayOfSheeps[i] == null) {
            // need to catch true and false properly.
            } else if (arrayOfSheeps[i] == true){
                sheep += 1;
            } else if (arrayOfSheeps[i] == false){

            }
        }
        return sheep;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}