public class AccessModifierTest {
    public static void main(String[] args) {
        AccessModifier aMod = new AccessModifier();

        aMod.setName("석진석");
        aMod.setBirthYear(1999);

        System.out.println(aMod.getName());
        System.out.println(aMod.getAge());
    }
}
