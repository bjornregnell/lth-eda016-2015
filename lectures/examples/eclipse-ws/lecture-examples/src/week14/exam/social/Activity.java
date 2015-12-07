package week14.exam.social;

import java.util.ArrayList;

public class Activity {

    private String text;
    private User owner;
    private ArrayList<User> likes;

    public Activity(String text, User owner) {
        this.text = text;
        this.owner = owner;
        likes = new ArrayList<User>();
        owner.addActivity(this);
    }

    public void like(User u) {
        likes.add(u);
    }

    public int getNbrOfLikes() {
        return likes.size();
    }

    public User getOwner() {
        return owner;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(text);
        sb.append("\n");
        sb.append(likes.size());
        
        if(likes.size()==1){
            sb.append(" person gillar detta:"); 
        } else if(likes.size()== 0){
            sb.append(" personer gillar detta.");
        } else {
            sb.append(" personer gillar detta:");
        }
        
        for (User u : likes) {
            sb.append("\n   ").append(u);
        }
        return sb.toString();
    }
}
