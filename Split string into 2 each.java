class StringSplit {
    public static String[] solution(String s) {
        if(s.length()%2==1) s+="_";
        int n=s.length()/2;


        String[] sub=new String[n];
        for(int i=0;i<n;++i)
            sub[i]=""+s.charAt(i*2)+s.charAt(1+i*2);

        return sub;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
