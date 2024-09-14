//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        SIgletonCarFactory sIgletonCarFactory = SIgletonCarFactory.getInstance();
        sIgletonCarFactory.buildCar("Sedan","Chevrollete");
        sIgletonCarFactory.buildCar("SUV","OldCar");
        sIgletonCarFactory.buildCar("Sedan","Onix");

        sIgletonCarFactory.getTotal();
        sIgletonCarFactory.getVendas();
    }
}