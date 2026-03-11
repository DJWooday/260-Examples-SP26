public class Main {
    public static int maxInt(int a, int b) {
        return a > b ? a : b;
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }

    public static void maxInt(int a, int b, int max) {
        max = a > b ? a : b;
    }

    public static float dist(float x1, float y1, float x2, float y2) {
        return (float)Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static float dist(float[] p1, float[] p2) {
        return (float)Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
    public static double dist(double[] p1, double[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }

    public static void main(String[] args) {
        float x1=0, y1=0, x2=4, y2=5;
//        float[] p1 = {x1, y1};
//        float[] p2 = {x2, y2};
        System.out.println(dist(x1, y1, x2, y2));
        System.out.println(dist(new float[]{x1, y1}, new float[]{x2, y2} ));






        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("tacobell"));

        int a = 5, b=1;
        int max=0;
        maxInt(a, b, max);
        System.out.println(max);


        int x=7, y= 3;
//        double a = 5.4;
//        int m = maxInt(5, 9);
//        System.out.println(m);
//        m = maxInt(2, 6);
//        System.out.println(m);
//        System.out.println(maxInt(x, y));
//
//        System.out.println(maxInt(8, 3));
    }
}
