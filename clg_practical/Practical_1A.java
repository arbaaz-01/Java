class Practical_1A {
    public static void main(String[] args) {
        float l = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        float area = l*b;
        float perimeter = 2*(l+b);
        System.out.println("Area of Rectangle: " + area +" squnit");
        System.out.println("Perimeter of Rectangle: " + perimeter +" unit");
    }
}
