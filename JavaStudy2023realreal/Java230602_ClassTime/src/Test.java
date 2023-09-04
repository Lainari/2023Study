public class Test {
    public static void main(String[] args) {
        int r = sum(100, 200, 105, (n1, n2) -> n1+n2);
        System.out.println(r);



        Box strBox = new Box();
        strBox.setValue("마르고 닳도록 하느님이 보우하사 우리나라 만세!");
        Object v = strBox.getValue();
        int idx = ((String)v).indexOf("우리나라");
        System.out.println(((String)v).substring(idx));

        int val = (int)strBox.getValue();
        System.out.println("프로그램을 종료합니다.");
    }
    public static int sum(int n1, int n2, int n3, Add add){
        int result = add.add(n1, n2);
        result = add.add(result, n3);
        return result;
    }

    interface Add{
        int add(int n1, int n2);
    }





}
