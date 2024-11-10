class Solution {
    public int solution(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder nonDigit = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                result.append(c);
            } else {
                nonDigit.append(c);
                int num = -1;
                switch (nonDigit.toString()) {
                    case "zero" -> num = 0;
                    case "one" -> num = 1;
                    case "two" -> num = 2;
                    case "three" -> num = 3;
                    case "four" -> num = 4;
                    case "five" -> num = 5;
                    case "six" -> num = 6;
                    case "seven" -> num = 7;
                    case "eight" -> num = 8;
                    case "nine" -> num = 9;
                }

                if(num != -1) {
                    nonDigit.setLength(0);
                    result.append(num);
                }
            }
        }

        return Integer.parseInt(result.toString());
    }
}