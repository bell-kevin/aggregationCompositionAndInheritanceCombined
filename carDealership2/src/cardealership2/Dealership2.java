/** ****************************************************************************
 * Dealership.java
 * Kevin Bell
 *
 * This class represents an auto retail sales organization.
 **************************************************************************** */
package cardealership2;

import java.util.ArrayList;

public class Dealership2 {

    private final String company;
    private final Manager2 manager;
    private final ArrayList<SalesPerson2> people = new ArrayList<>();
    private final ArrayList<Car> cars = new ArrayList<>();
//******************************************************************************

    Dealership2(String company, Manager2 manager) {
        this.company = company;
        this.manager = manager;
    }
//******************************************************************************

    public void addCar(Car car) {
        cars.add(car);
    } // end addCar method 

    public void addPerson(SalesPerson2 person) {
        people.add(person);
    } // end addPerson method
//******************************************************************************

    void printStatus() {
        System.out.println(company + "\t" + manager.getName());
        for (SalesPerson2 person : people) {
            System.out.println(person.getName());
        } // end for loop
        for (Car car : cars) {
            System.out.println(car.getMake());
        } // end for loop
    } // end printStatus method
} // end Dealership class
