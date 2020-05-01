package core.java.topic.designPattern.abstractFactory;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public abstract class Currency {

    protected String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Currency(String countryName) {
        this.countryName = countryName;
    }

    public abstract Currency getCurrency(String countryName);
}
