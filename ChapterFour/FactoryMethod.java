import java.text.NumberFormat;
import java.util.Locale;

public class FactoryMethod {
    public static void main(String[] args){
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        double x = 0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));

    }
}
