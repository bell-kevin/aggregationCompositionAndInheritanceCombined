/** ****************************************************************************
 * Dealership2Driver.java
 * Kevin Bell
 *
 * This class demonstrates the car dealership composition.
 **************************************************************************** */
package cardealership2;

public class dealership2Driver {

    public static void main(String[] args) {
        Manager2 kevin = new Manager2("Kevin Bell");
        SalesPerson2 jesseKellyShow = new SalesPerson2("Jesse Kelly");
        SalesPerson2 theDailyCaller = new SalesPerson2("Tucker Carlson");
        Dealership2 dealership = new Dealership2("Fantastic Used Cars", kevin);
        dealership.addPerson(jesseKellyShow);
        dealership.addPerson(theDailyCaller);
        dealership.addCar(new Car("Toyota"));
        dealership.addCar(new Car("Honda"));
        dealership.addCar(new Car("Nissan"));
        dealership.printStatus();
    } // end main method 
} // end dealershipDriver class
