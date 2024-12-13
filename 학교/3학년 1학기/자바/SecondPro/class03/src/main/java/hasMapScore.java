import java.util.*;
public class hasMapScore {
    public static void main(String[] args) {

        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
        scoreMap.put("김씨", 78);
        scoreMap.put("이씨", 57);
        scoreMap.put("박씨", 83);
        scoreMap.put("조씨", 45);
        scoreMap.put("유씨", 90);

        System.out.println("HahMap요소의 개수: "+ scoreMap.size());

        Set<String> keys = scoreMap.keySet();
        ArrayList<String> keyList = new ArrayList<String>(keys);
//        Collection.sort(keyList);
        
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String name = it.next();
            int score = scoreMap.get(name);
            System.out.println(name+" : "+ score);
        }

    }
}
