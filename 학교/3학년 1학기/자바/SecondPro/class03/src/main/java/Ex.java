import java.util.*;

class Location {
    private String city;
    private int lat, lon;

    public Location(String c, int la, int lo) {
        city = c;
        lat = la;
        lon = lo;
    }

    public String getCity() {
        return city;
    }

    public int getLat() {
        return lat;
    }

    public int getLon() {
        return lon;
    }

    @Override
    public String toString() {
        return "도시: " + city + ", 위도: " + lat + ", 경도: " + lon;
    }
}

public class Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Location> dic = new HashMap<>();
        dic.put("seoul", new Location("seoul", 37, 126));
        dic.put("paris", new Location("paris", 35, 129));
        dic.put("sidney", new Location("sidney", 35, 128));

        while (true) {
            System.out.print("도시 이름? ");
            String city = scanner.next();
            if (city.equals("exit")) {
                System.out.println("종료하고 싶음 exit 입력");
                break;
            }
            Location loc = dic.get(city);
            if (loc == null) {
                System.out.println(city + " 없음");
            } else {
                System.out.println(loc);
            }
        }

        scanner.close();
    }
}
