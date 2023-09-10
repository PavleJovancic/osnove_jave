package d08_09;

public class FacebookPost {

    public String userPosting;
    public String userReceiving;
    public String text;
    public int likes;
    public int shares;

    public void like(){
        this.likes = ++this.likes;
    }
    public void dislike(){
        if(this.likes >= 1)
            this.likes = --this.likes;
    }

    public void share(){
        this.shares = ++this.likes;
    }

    public void printPost() {
        System.out.println("(" + this.userPosting + ")" + " >>> " + "(" + this.userReceiving + ")");
        System.out.println(this.text);
        System.out.println("Likes (" + this.likes + ") | Shares (" + this.shares + ")");
    }
}
