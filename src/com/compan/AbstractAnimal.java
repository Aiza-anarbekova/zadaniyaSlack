package com.compan;

public abstract class AbstractAnimal {
    private String name;
    private int age;
    private int weigh;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigh=" + weigh +
                '}';
    }

    public AbstractAnimal(String name, int age, int weigh) {
        this.name = name;
        this.age = age;
        this.weigh = weigh;




    }
}
