public class foreach {
    public static void main(String[] args) {
        String [] car = new String[5];
        car[0] = "Bentley";
        car[1] = "Porsche";
        car[2] = "MiniCooper";
        car[3] = "LandRover";
        car[4] = "Jaguar";
        String [] car2;
        car2 = new String[8];

        String [] car3 = {};

        System.out.println(car[4]);
        System.out.println(car.length);
        System.out.println(car);

        System.out.println("Array traversal using for loop");
        for(int i=car.length-1; i>=0; i--){
            System.out.println(car[i]);
        }

        System.out.println();
        System.out.println("For-each loop");
        for(String element: car){
            System.out.println(element);
        }

        // Accessing last element
        System.out.println();
        System.out.println(car[(car.length-1)/2]);
    }
}
