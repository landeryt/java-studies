class Sequence{
// Fun fact: You can't print arrays directly. Didn't know that.
    
    public static int[] reverse(int n){
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = n - i;
        }
        return a;
    }

}
public class Main {
    public static void main(String[] args) {



    }
}
