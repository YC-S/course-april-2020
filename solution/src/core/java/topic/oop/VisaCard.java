package core.java.topic.oop;

/**
 * @author shiyuanchen
 * @created 2020/04/29
 * @project course-april-2020
 */
public class VisaCard extends CreditCard {

    public VisaCard(String holderName, String cardNumber, double accountBalance,
        String cardType) {
        super(holderName, cardNumber, accountBalance, cardType);
    }

    @Override
    public boolean isCardAcceptable(String cardType) {
        return true;
    }

    @Override
    public void payBill(double bill) {
        super.payBill(bill);
    }
}
