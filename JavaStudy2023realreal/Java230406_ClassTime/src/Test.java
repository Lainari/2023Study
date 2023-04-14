public class Test {
    public static void main(String[] args) {
        Student[] stds = new Student[5];
        // 학번 내림차순 적용
        stds[0] = new Student("석진석", "2201363");
        stds[1] = new Student("이재일", "2201392");
        stds[2] = new Student("김일곤", "2201330");
        stds[3] = new Student("최진수", "1801295");
        stds[4] = new Student("조현준", "1901276");

        Util.selectionSort(stds);

        for(Student std: stds){
            System.out.println(std);
        }

        System.out.println();

        // 이름 내림차순 적용
        Professor[] prfs = new Professor[7];
        prfs[0] = new Professor("이경미 교수님");
        prfs[1] = new Professor("류은영 교수님");
        prfs[2] = new Professor("김종률 교수님");
        prfs[3] = new Professor("박성철 교수님");
        prfs[4] = new Professor("조수연 교수님");
        prfs[5] = new Professor("이중권 교수님");
        prfs[6] = new Professor("이노우에 사치코 교수님");

        Util.selectionSort(prfs);

        for(Professor prf: prfs){
            System.out.println(prf);
        }
    }
}
