package homeworkweek5;


    public class Operations {

        public static void main(String[] args) {

            int a = 5;
            int b = 8;
            int c = 6;
            int d = 55;
            int e = 9;
            int f = 20;
            int g = 3;
            int h = 15;
            int i = 2;


            System.out.println("Test Data: a. -5 + 8 * 6");
            System.out.println("Output: " + (-a + b * c));
            System.out.println("");

            System.out.println("Test Data: b. (55+9) % 9");
            System.out.println("Output: " + ((d + e) % e));
            System.out.println("");

            System.out.println("Test Data: 20 + -3*5 / 8");
            System.out.println("Output: "+((f) + (-g * a) / b));
            System.out.println("");

            System.out.println("Test Data: 5 + 15 / 3 * 2 - 8 % 3");
            System.out.println("Output: "+((a + h / g * i) - (b) % g));


        }

}
