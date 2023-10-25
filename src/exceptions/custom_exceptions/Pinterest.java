package exceptions.custom_exceptions;

public class Pinterest {
    public Account account;
    public long feed;
    private int saveButton;

    public Pinterest(Account account, long feed, int saveButton) {
        this.account = account;
        this.feed = feed;
        this.saveButton = saveButton;
    }

    public int getSaveButton() {
        return saveButton;
    }

    public void toShareThePost(String photo, String description) throws DescriptionCapacity {
        int capacity = 10;
        if (description.length() <= capacity) {
            System.out.println(photo + "\n" + description);
        }
        else {
            throw new DescriptionCapacity("the length of description should be less then 10!");
        }

    }
}
