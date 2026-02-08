public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int one = calc.multiply(3,4);
        int two = calc.multiply(5,7);
        int three= calc.add(one,two);
        int four = calc.square(three);
        System.out.println("Answer for 1 is  " + four);

        int five = calc.add(4,7);
        int six = calc.square(five);
        int seven = calc.add(8,3);
        int eight = calc.square(seven);
        int nine = calc.add(six,eight);
        System.out.println("Answer for 2 is  "+ nine);
    }
}
