public class SIgletonCarFactory {

    private static SIgletonCarFactory instance;
    private String modelo;
    private int totalcars;
    private int carsedan;
    private int carSUV;
    private SIgletonCarFactory(){

    }

    public static SIgletonCarFactory getInstance(){
        if(instance == null){
            instance = new SIgletonCarFactory();
        }
        return instance;
    }

    public Car buildCar(String model, String categoria){
        Car car = new Car();
        car.setCategoria(categoria);
        car.setModelo(model);
        modelo = car.getModelo();
        if(modelo == "Sedan"){
            carsedan++;
        }if(modelo == "SUV"){
            carSUV++;
        }
        totalcars++;

        System.out.println("Carro do Modelo "+ car.getModelo() + " Criado!");
        return car;
    }
    public void getTotal() {
        System.out.println("Total de carro criados " + totalcars);
        System.out.println(" ");
    }
    public void getVendas() {
        System.out.println("Relatorio de Carros Vendidos:");
        System.out.println("Sedan:" + carsedan + " unidades vendidas");
        System.out.println("SUV:" + carSUV + " unidades vendidas");
        if(carSUV>= carsedan){
            System.out.println("O modelo SUV é o mais vendido.");
        } else if (carSUV<= carsedan) {
            System.out.println("O modelo Sedan é o mais vendido.");
        }else{
            System.out.println("Nenhum carro e o mais vendido.");
        }

    }
}
