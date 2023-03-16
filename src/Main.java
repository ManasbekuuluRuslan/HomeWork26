import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(1,"AZ 563 ");
        Car car2= new Car(2,"L 3267 S");
        Car car3 = new Car(3,"FH 333 ");
        Car car4 = new Car(4,"S 7777 S");

        CarData carData1 =  new CarData(LocalDate.of(2012,4,23),"Honda",750000,"White");
        CarData carData2 =  new CarData(LocalDate.of(2006,1,31),"Toyota",1200000,"Yellow");
        CarData carData3 =  new CarData(LocalDate.of(2012,4,7),"Lexus",2500000,"Blue");
        CarData carData4 =  new CarData(LocalDate.of(2022,9,11),"BMW",3200000,"Black");

        HashMap<Car, CarData> cars = new HashMap<>();
        cars.put(car1,carData1);
        cars.put(car2,carData2);
        cars.put(car3,carData3);
        cars.put(car4,carData4);

        for (Map.Entry a : cars.entrySet()) {
            System.out.println(a.toString());
        }
    }
}