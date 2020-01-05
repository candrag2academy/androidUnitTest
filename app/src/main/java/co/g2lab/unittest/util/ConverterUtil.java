package co.g2lab.unittest.util;

public class ConverterUtil {
    public static float convertFahrenheitToCelsius(int fahrenheit) {
        float TC= (float)(fahrenheit-32)*5/9 ;

        return TC;
    }

    public static float convertCelsiusToFahrenheit(int celsius) {
        float TF= (float)((celsius)*9/5) + 32;
        return TF;
    }
}
