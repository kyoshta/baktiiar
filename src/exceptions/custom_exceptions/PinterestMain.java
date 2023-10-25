package exceptions.custom_exceptions;

public class PinterestMain {
    public static void main(String[] args) {


    Account account = new Account("Sean", "12.03.1994", 'm');
    Pinterest pinterest = new Pinterest(account, 24483154l, 67);
        try {
            pinterest.toShareThePost("photo", "long red dress");
        } catch (DescriptionCapacity e) {
            e.printStackTrace();
        }
    }
}