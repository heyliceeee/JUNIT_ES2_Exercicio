public class BinString {
    public String convert(String s) {
        return binarise(sum(s));
    }

    public int sum(String s) {
        if (s == "")
            return 0;
        if (s.length() == 1)
            return ((int) s.charAt(0));
        return (((int) s.charAt(0))) + sum(s.substring(1));
    }

    public String binarise(int x) {
        if (x == 0)
            return "0";
        if (x == 1)
            return "1";

        if (x % 2 == 0) {
            return binarise(x / 2) + "0";
        } else {
            return binarise(x / 2) + "1";
        }
    }
}
