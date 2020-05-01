package core.java.topic.designPattern.abstractFactory;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public class USD extends Currency{

    public USD(String currencyName) {
        super(currencyName);
    }

    @Override
    public Currency getCurrency(String countryName) {
        return new USD(countryName);
    }
}
