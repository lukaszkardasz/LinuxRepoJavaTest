package Main.StringFormatter;

import java.util.Formatter;
import java.util.Locale;

public class FormatterExercise {

    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format(Locale.forLanguageTag("PL"),"Urodziłem się w %1$8.4f roku, nazywam się %2$10s. Urodziłem się w %1$5.9f roku.", 1985.9654332345667, "n2God");
        String ciagZnaków = formatter.toString();
        System.out.println(ciagZnaków);

    }
}
