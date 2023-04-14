public class Professor extends Comparable{
    public String getPrfName() {
        return prfName;
    }

    public void setPrfName(String prfName) {
        this.prfName = prfName;
    }

    private String prfName;

    public Professor(String prfName){
        this.prfName = prfName;
    }

    @Override
    public String toString(){
        return "[이름 : " + prfName + "]";
    }

    @Override
    public int compareTo(Comparable anotherValue){
        Professor prf = (Professor) anotherValue;

        String yourName = prf.getPrfName();
        return prfName.compareTo(yourName);
    }
}
