class Solution {
    //String... means that there can be 0, or more strings in the parameters
    //Program shows how many people liked this post, according to how many names were entered
    public static String whoLikesIt(String... names) {
        int length = names.length;
        String result = "";
        if (length == 0) {
            result = "No one likes this";
        } else if (length == 1) {
            result = names[0] + " likes this";
        } else if (length == 2) {
            result = names[0] + " and " + names[1] + " like this";
        } else if (length == 3) {
            result = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else{
            result = names[0] + ", " + names[1] + " and " + (length - 2) + " others like this";
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}