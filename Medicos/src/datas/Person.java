package datas;

abstract  class Person {
    private String name;
    private String surnmane;
    private int age;
    private boolean foreigners;
    protected  Person(String name, String surnmane, int age, boolean foreigners) {
        this.name = name;
        this.surnmane = surnmane;
        this.age = age;
        this.foreigners = foreigners;
    }



public abstract  String info(String name, String surname, int age) ;



@Override
    public String toString() {
        return "datas.Person [name=" + name + ", surnmane=" + surnmane + ", age=" + age + ", foreigners=" + foreigners
                + ", getName()=" + getName() + ", getSurnmane()=" + getSurnmane() + ", getAge()=" + getAge()
                + ", isForeigners()=" + isForeigners() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurnmane() {
        return surnmane;
    }
    public void setSurnmane(String surnmane) {
        this.surnmane = surnmane;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isForeigners() {
        return foreigners;
    }
    public void setForeigners(boolean foreigners) {
        this.foreigners = foreigners;
    }
    
}