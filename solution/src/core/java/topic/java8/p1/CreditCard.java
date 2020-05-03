package core.java.topic.java8.p1;

/**
 * @author shiyuanchen
 * @created 2020/05/02
 * @project course-april-2020
 */
public interface CreditCard {

    String holderName = null;
    Integer cardNumber = 0;
    Integer accountBalance = 0;
    String cardType = null;

    /**
     * This method checks if the card type is acceptable.
     *
     * @param cardType the type of the card
     * @return if the card type is acceptable
     */
    public boolean isCardAcceptable(String cardType);

    /**
     * This method display the amount of bill paid.
     *
     * @param bill the amount of money paid is USD
     */
    default void payBill(double bill) {
        System.out.println("Paid $" + bill + ".");
    }

    /**
     * This method displays how much money is refunded.
     *
     * @param amount the amount of money in USD
     */
    static void refund(double amount) {
        System.out.println("Refund $" + amount + ".");
    }

}
