public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double fInput= fahrenheit;
        double cResult= (fInput-32) * 5.0/9.0;
        System.out.println("Temperature " + celsius + " " + "C is" + " " + fahrenheit +" " + "F");
        System.out.println("Celsius "+ cResult);
    }
}
