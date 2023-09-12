package d11_09;

public class FacebookPost {
    private String description;
    private User user;

    public FacebookPost(){}

    public FacebookPost(String description, User user){
        this.description = description;
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printPostInformation(){
        if (user != null) {
            this.user.printUserInformation();
        }
        System.out.println(this.description);
    }
}
