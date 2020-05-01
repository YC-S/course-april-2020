package core.java.topic.designPattern.abstractFactory;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public class CurrencyExchange {

    public static Currency getCurrency(String countryName) {
        String china = "china";
        String usa = "usa";
        if (china.equals(countryName)) {
            return new CNY(countryName);
        } else if (usa.equals(countryName)) {
            return new USD(countryName);
        } else {
            return null;
        }
    }
}
