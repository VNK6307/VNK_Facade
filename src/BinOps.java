public class BinOps {
    int intA, intB;
    String result;

    public String sum(String a, String b) {
        intA = Integer.parseInt(a, 2);
        intB = Integer.parseInt(b, 2);
        result = Integer.toBinaryString(intA + intB);
        return result;
    }

    public String mult(String a, String b) {
        intA = Integer.parseInt(a, 2);
        intB = Integer.parseInt(b, 2);
        result = Integer.toBinaryString(intA * intB);
        return result;
    }
}// class
