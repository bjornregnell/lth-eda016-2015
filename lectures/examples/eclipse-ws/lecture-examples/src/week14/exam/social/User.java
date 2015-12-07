package week14.exam.social;

import java.util.ArrayList;
 
public class User {  
    private ArrayList<User> friends;
    private ArrayList<Activity> activities;
    private String name;
    private int userId;

    public User(String name, int id) {
        friends = new ArrayList<User>();
        activities = new ArrayList<Activity>();
        this.name = name;
        this.userId = id;
    }

    public void addFriend(User u) {
        int i = 0;
        while (i < friends.size() && u.userId > friends.get(i).userId) {
            i++;
        }
        friends.add(i, u);
    }

    public User findFriend(int id) {
        int i = 0;
        while (i < friends.size() && id >= friends.get(i).userId) {
            if (friends.get(i).userId == id) {
                return friends.get(i);
            }
            i++;
        }
        return null;
    }

    public void addActivity(Activity a) {
        activities.add(a);
    }

    public Activity getLatestActivity() {
        if (activities.size() > 0) {
            return activities.get(activities.size() - 1);
        }
        return null;
    }

    public ArrayList<Activity> getFeed() {
        ArrayList<Activity> result = new ArrayList<Activity>();
        for (User f : friends) {
            Activity a = f.getLatestActivity();
            if (a != null) {
                result.add(a);
            }
        }
        return result;
    }

    public ArrayList<User> findCommonFriends(User u) {
        ArrayList<User> result = new ArrayList<User>();
        for (User f : friends) {
            User otherFriend = u.findFriend(f.userId);
            if (otherFriend != null) {
                result.add(f);
            }
        }
        return result;
    }

    public String toString() {
        return name;
    }
    
    public int[] countLikes() {  // ** Uppgift 3 **
        if (activities.size() == 0) {
            return null;
        }
        int max = activities.get(0).getNbrOfLikes();
        for (int i = 1; i < activities.size(); i++) {
            int likes = activities.get(i).getNbrOfLikes();
            if (likes > max) {
                max = likes;
            }
        }

        int[] res = new int[max + 1];
        for (Activity a : activities) {
            res[a.getNbrOfLikes()]++;
        }
        return res;
    }
}
