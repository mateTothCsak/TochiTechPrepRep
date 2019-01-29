package algorithms.bfs;

import sun.reflect.annotation.ExceptionProxy;

import java.util.HashSet;
import java.util.List;

public class BreadthFirstSearch {

    public int calculateMinDistance(List<UserNode> users, UserNode user1, UserNode user2) throws Exception {
        int distance = 0;
        int lastElement = 0;
        HashSet<UserNode> friendsSet = user1.getFriends();
        while(distance < users.size()) {
            distance += 1;
            int tempLastElement = friendsSet.size()-1;
            if (friendsSet.contains(user2)) {
                return distance;
            }
            for (UserNode user : friendsSet){
                /*
                HashSet<UserNode> tempSet = new HashSet<UserNode>(friendsSet);
                tempSet.addAll(user.getFriends());
                friendsSet = tempSet;
                */
                friendsSet.addAll(user.getFriends());
            }
            lastElement = tempLastElement;
        }

        throw new Exception("User to be found not connected with main user");

    }

    public HashSet<UserNode> collectFirendsOfFriends(UserNode user, int reach){
        HashSet<UserNode> friendsSet = user.getFriends();
        for (int i = 0; i<reach-1; i++){
            for(UserNode friend : friendsSet){
                /*
                HashSet<UserNode> tempSet = new HashSet<UserNode>(friendsSet);
                tempSet.addAll(friend.getFriends());
                friendsSet = tempSet;
                */
                friendsSet.addAll(friend.getFriends());
            }
        }
        return friendsSet;
    }

    // A method which shows the path between two nodes shall be implemented here!
    // Tests and Example files also needed
}
