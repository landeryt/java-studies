class DnaStrand {
    // Absolute bozo, you could have just made an if statement for each
    // You could have also just turned some letters into a 3rd party and then turn them back later.
    public static String makeComplement(String dna) {
        return dna.replace("A","B")
                .replace("C","D")
                .replace("T","A")
                .replace("G","C")
                .replace("B","T")
                .replace("D","G");

    }
}
public class Main {
    public static void main(String[] args) {

    }
}