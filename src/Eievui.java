import java.util.HashMap;
import java.util.Map;

public class Eievui {
    public static void main(String[] args) {

        Map<String, String> evolutionMap = new HashMap<>();{
            evolutionMap.put("みずのいし","シャワーズ");
            evolutionMap.put("かみなりのいし","サンダース");
            evolutionMap.put("ほのおのいし","ブースター");

            for(String val : evolutionMap.values()){
                System.out.println("おめでとう！　イーブイは"+val+"にしんかした！");
            }
        }
    }

}