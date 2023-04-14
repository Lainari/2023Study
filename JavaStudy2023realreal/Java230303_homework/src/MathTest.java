public class MathTest {
    public static void main(String[] args) {
        int sum;
        Math obj = new Math();
        sum = obj.add(2, 3); // 2와 3은 인수로서 add()로 전달
        System.out.println("2와 3의 합은 " + sum);
        sum = obj.add(7, 8); // 7와 8은 인수로서 add()로 전달
        System.out.println("7와 8의 합은 " + sum);
    }
}
