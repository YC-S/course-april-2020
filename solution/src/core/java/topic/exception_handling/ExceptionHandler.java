package core.java.topic.exception_handling;

import javax.smartcardio.CardException;

/**
 * @author shiyuanchen
 * @created 2020/05/01
 * @project course-april-2020
 */
public class ExceptionHandler extends Exception {

    public static void handleException(String cardType, String address)
        throws Exception {
        try {
            String amex = "AMEX";
            if (cardType.equals(amex)) {
                throw new CardTypeException("Card Type Exception");
            }
        } catch (CardTypeException e) {
            e.printStackTrace();
        }
        try {
            String ous = "outside US";
            if (address.equals(ous)) {
                throw new AddressException("Address Exception");
            }
        } catch (AddressException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        try {
            handleException("AMEX", "outside US");
        } catch (AddressException e) {
            System.out.println(e.getMessage());
        } catch (CardException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
