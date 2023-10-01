import java.util.ArrayList;
import java.util.List;

class Kata {

    public static List<Object> filterList(final List<Object> list) {
        List result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Number) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}