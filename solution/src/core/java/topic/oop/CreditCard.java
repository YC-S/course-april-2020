package core.java.topic.oop;

/**
 * @author shiyuanchen
 * @created 2020/04/29
 * @project course-april-2020
 */
public abstract class CreditCard {

    protected String holderName;
    protected String cardNumber;
    protected double accountBalance;
    protected String cardType;

    public CreditCard(String holderName, String cardNumber,
        double accountBalance,
        String cardType) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }

    /**
     * check if the card is acceptable
     *
     * @param cardType the type of the credit card.
     * @return boolean
     */
    public abstract boolean isCardAcceptable(String cardType);

    public void payBill(double bill) {
        if (accountBalance < bill) {
            System.out
                .println("Balance is not enough. Please try another way.");
        } else {
            accountBalance -= bill;
            System.out.println("Paid successfully. Have a good day!");
        }
    }


}
