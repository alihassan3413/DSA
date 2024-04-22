package LeetCode;

public class RomanToIntegers {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }


    static public int romanToInt(String s) {
        int val = 0;
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            switch (c){
                case 'I':
                    if(i!=s.length()-1) {
                        if (s.charAt(i + 1) == 'V') {
                            val += 4;
                            i++;
                        } else if (s.charAt(i + 1) == 'X') {
                            val += 9;
                            i++;
                        }else {
                            val += 1;
                        }
                    }else {
                        val +=1;
                    }
                break;

                case 'V':
                    val += 5;
                break;

                case 'X':
                    if(i!=s.length()-1) {
                        if (s.charAt(i + 1) == 'L') {
                            val += 40;
                            i++;
                        } else if (s.charAt(i + 1) == 'C') {
                            val += 90;
                            i++;
                        } else {
                            val += 10;
                        }
                    }else {
                        val += 10;
                    }
                break;

                case 'L':
                    val += 50;
                break;

                case 'C':
                    if(i!=s.length()-1){
                        if(s.charAt(i+1) == 'D'){
                            val += 400;
                            i++;
                        } else if (s.charAt(i+1) == 'M') {
                            val += 900;
                            i++;
                        }else {
                            val += 100;
                        }
                    }else {
                        val += 100;
                    }
                break;

                case 'D':
                    val += 500;
                break;

                case 'M':
                    val += 1000;
                break;
            }
        }

        return val;
    }
}
