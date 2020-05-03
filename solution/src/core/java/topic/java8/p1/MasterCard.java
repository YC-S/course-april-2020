package core.java.topic.java8.p1;

/**
 * @author shiyuanchen
 * @created 2020/05/02
 * @project course-april-2020
 */
public class MasterCard implements CreditCard{

    public MasterCard() {
    }

    @Override
    public boolean isCardAcceptable(String cardType) {
        return false;
    }

    public static void main(String[] args) {
        MasterCard masterCard = new MasterCard();
        masterCard.payBill(100);
        CreditCard.refund(10);
    }
}
