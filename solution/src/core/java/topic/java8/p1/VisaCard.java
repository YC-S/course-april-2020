package core.java.topic.java8.p1;

/**
 * @author shiyuanchen
 * @created 2020/05/02
 * @project course-april-2020
 */
public class VisaCard implements CreditCard {

    public VisaCard() {
    }

    @Override
    public boolean isCardAcceptable(String cardType) {
        return false;
    }

    public static void main(String[] args) {
        VisaCard visaCard = new VisaCard();
        visaCard.payBill(1000);
        CreditCard.refund(100);
    }
}
