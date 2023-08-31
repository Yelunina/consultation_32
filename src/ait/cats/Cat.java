package ait.cats;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private int age;
    private String name;

    private String color;

    public Cat(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return Objects.equals(getName(), cat.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
      //  return o.age-this.age;//сортировка по возрасту от меньшего к большему
        return this.name.compareTo(o.name);//сортировка по именам по алфавиту от A до z
    }
}
