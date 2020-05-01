package core.java.topic.collection.set;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public class FindTrueFriend {

    public static Set<String> findTrueFriend(List<String> friendList1,
        List<String> friendList2) {
        Set<String> trueFriend = ConcurrentHashMap.newKeySet();
        for (String s : friendList1) {
            trueFriend.add(s);
        }
        for (String s : friendList2) {
            trueFriend.add(s);
        }
        for (String s : trueFriend) {
            if (!(friendList1.contains(s) && friendList2.contains(s))) {
                trueFriend.remove(s);
            }
        }

        return trueFriend;
    }

}
