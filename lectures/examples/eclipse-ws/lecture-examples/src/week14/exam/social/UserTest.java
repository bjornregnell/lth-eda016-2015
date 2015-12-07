package week14.exam.social;

import java.util.ArrayList;

public class UserTest { // Testprogram (ingår ej på tentan)

    public static void main(String[] args) {
        User lilleSkutt = new User("Lille skutt", 42);
        new Activity("Odlar morötter", lilleSkutt);
        new Activity("Blir rädd", lilleSkutt);
          
        User skalman = new User("Skalman", 43);
        new Activity("Läser böcker", skalman);
        new Activity("Sover", skalman);
        
        User bamse = new User("Bamse", 44);
        new Activity("Jagar vargen", bamse);
        new Activity("Äter honung", bamse);

        lilleSkutt.getLatestActivity().like(bamse);
        lilleSkutt.getLatestActivity().like(skalman);

        lilleSkutt.addFriend(bamse);
        lilleSkutt.addFriend(skalman);
        skalman.addFriend(lilleSkutt);
        bamse.addFriend(skalman);
        
        System.out.println("LILLE SKUTT\nGemensamma vänner: "); 
        for (User u: lilleSkutt.findCommonFriends(bamse)){
            System.out.println(u);
        }
        
        System.out.println("Feed:" );
        for (Activity a: lilleSkutt.getFeed()){
            System.out.println(a);
        } 

        System.out.println("Likes:" );
        for (int i: lilleSkutt.countLikes()){
            System.out.println(i);
        } 
        

        System.out.println("SKALMAN: "); 
        for (Activity a: skalman.getFeed()){
            System.out.println(a);
        }        

    }

}
