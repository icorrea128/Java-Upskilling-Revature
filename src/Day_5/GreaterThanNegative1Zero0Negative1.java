package Day_5;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class GreaterThanNegative1Zero0Negative1 implements Comparable<GreaterThanNegative1Zero0Negative1> {

    String name;
    int age;

    public GreaterThanNegative1Zero0Negative1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GreaterThanNegative1Zero0Negative1 that = (GreaterThanNegative1Zero0Negative1) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(GreaterThanNegative1Zero0Negative1 o) {
        if (this.age > o.age) {

            // if current object is greater,then return 1
            return 1;
        }
        else if (this.age < o.age) {

            // if current object is greater,then return -1
            return -1;
        }
        else {

            // if current object is equal to o,then return 0
            return 0;
        }
    }

    public static void main(String[] args) {
        Set<GreaterThanNegative1Zero0Negative1> treeSet = new TreeSet<GreaterThanNegative1Zero0Negative1>();
        GreaterThanNegative1Zero0Negative1 lightyearsOne = new GreaterThanNegative1Zero0Negative1("Voyager",14);
        GreaterThanNegative1Zero0Negative1 lightyearsTwo = new GreaterThanNegative1Zero0Negative1("Voyager",32);
        GreaterThanNegative1Zero0Negative1 lightyearsThree = new GreaterThanNegative1Zero0Negative1("Voyager",32);
        treeSet.add(lightyearsOne);
        treeSet.add(lightyearsTwo);
        treeSet.add(lightyearsThree);
        System.out.println("Lightyear One comapred to Light Year Two");
        System.out.println(lightyearsOne.compareTo(lightyearsTwo));
        System.out.println("Lightyear Three comapred to Light Year Two");
        System.out.println(lightyearsThree.compareTo(lightyearsTwo));
        System.out.println("Lightyear Two compared to Lightyear One");
        System.out.println(lightyearsTwo.compareTo(lightyearsOne));
    }
}
