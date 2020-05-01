package core.java.topic.designPattern.abstractFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
class CurrencyExchangeTest {

    @Test
    public void testCurrencyExchange() {
        assertEquals(CurrencyExchange.getCurrency("usa").getCountryName(),
            "usa");
        assertEquals(CurrencyExchange.getCurrency("china").getCountryName(),
            "china");
    }

}