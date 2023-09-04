package lambda;

interface CheckPerson {
    boolean test(Person p);
}

class CheckGender implements CheckPerson {
    @Override
    public boolean test(Person p) {
        return p.getGender() == Person.Sex.MALE;
    }
}