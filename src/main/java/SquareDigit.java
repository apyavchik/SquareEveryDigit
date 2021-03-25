public class SquareDigit {
    public int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        String stringFromInt = String.valueOf(n);
        for (int i = 0; i < stringFromInt.length(); i++) {
            int i1 = Integer.parseInt(String.valueOf(stringFromInt.charAt(i)));
            result.append(i1 * i1);
        }

        return Integer.parseInt(result.toString());
    }
}
