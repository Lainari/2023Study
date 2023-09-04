package generic;
import java.util.*;

public class CollectionTest2 {
    public static void main(String[] args){
        HashMap<String, Integer> nameAge = new HashMap<>();
        nameAge.put("고길동", 20);       // 키와 값의 쌍으로 데이터를 저장
        int age = nameAge.get("고길동"); // 키의 값으로 그에 대응되는 값을 인출
        System.out.println("고길동의 나이 : " + age);

        nameAge.put("일지매", 30);
        nameAge.put("박문수", 40);

        age = nameAge.get("박문수");
        System.out.println("박문수의 나이 : "+ age);

        // 우리반의 조가 6개조가 있다.
        // 각 조의 조원들 이름을 HashMap 을 이용해서 저장하고자 한다.
        // 즉, "1조" : ["이재일", "김지훈", "이주현", ...]
        // "2조" : [...]

        HashMap<String, ArrayList<String>> JIGroup = new HashMap<>();
        ArrayList<String> group3 = new ArrayList<>();
        group3.add("강주원");
        group3.add("김규민");
        group3.add("김동준");
        group3.add("박정민");
        group3.add("석진석");
        JIGroup.put("3조", group3);

        printTeamMember("3조", JIGroup);
    }

    public static void printTeamMember(String teamName, HashMap<String, ArrayList<String>> JIGroup){
        ArrayList<String> members = JIGroup.get(teamName);
        System.out.println(teamName + "의 맴버들");
        for (String member : members){
            System.out.println(member);
        }
        System.err.println();
    }
}