import java.util.Scanner;

public class ConversorTemperatura {

    double temperaturaEmCelcius;
    double temperaturaEmFahrenheit;
    double temperaturaEmKelvin;

    public void receberDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celcius: ");
        temperaturaEmCelcius = leitor.nextDouble();

        leitor.close();
        converterTemperaturas();
    }
    public void converterTemperaturas(){
        temperaturaEmFahrenheit = (temperaturaEmCelcius * 1.8) + 32;
        temperaturaEmKelvin = temperaturaEmCelcius + 273.15;

        exibirResultado();

    }
    public void exibirResultado(){
        System.out.println( temperaturaEmCelcius + "°C" + " equivalem a:");
        System.out.println(temperaturaEmFahrenheit + "°F (Fahrenheit)");
        System.out.println(temperaturaEmKelvin + "K (Kelvin)");


    }

}
