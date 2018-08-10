package se.javierdlc;

public class Main {
    public static void main(String[] args) {
        Volvo volvo = new Volvo();
        Tesla tesla = new Tesla();
        method1(volvo);
        method2(tesla);
        method3(tesla);
        Car car1 = new Volvo();
        Car car2 = new Tesla();
        Car car3 = volvo;
        Car car4 = tesla;

        Tesla car5 = (Tesla) car4;

        Tesla tesla1 = new Tesla();
        Car tesla2 = tesla1;
        Tesla tesla3 = (Tesla) tesla2;

        // Det är samma objekt men den har omvandlats både implicit och explicit från Tesla till Car till Tesla igen (av mig)
        // Vi förlörar möjligheten att anropa vår Tesla metod chargeBattery() när vi omvandlar Tesla 1 till en Car
        // Vi kan anropa det på tesla1 och på tesla3 eftersom jag omvandlade den explicit
    }

    private static void method1(Volvo car) {
        car.start();
        car.stop();
    }

    private static void method2(Tesla car) {
        car.start();
        car.stop();
    }

    private static void method3(Car car) {
        car.start();
        car.stop();
    }
}
