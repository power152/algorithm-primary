package newbie0.class06;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Kiteye
 * @date 1/7/2022
 * @Description  优先级队列
 */



public class ShowComparator2 {


    public static class Student {
        public String name;
        public int id;
        public int age;

        public  Student(String name,int id,int age){
            this.name = name;
            this.id = id;
            this.age = age;
        }
    }

    public static class MyComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 < o2) {
                return -1;
            } else if (o2 <o1){
                return 1;
            } else {
                return 0;
            }
        }
    }

    // id 谁大，谁放在前面
    public static class IdComparator1 implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.id < o2.id){
                return 1;
            } else if (o2.id < o1.id) {
                return -1;
            } else {
                return 0;
            }
        }
    }


    public static void main(String[] args) {
        String s1 ="abc";
        String s2 = "b";
        System.out.println(s1.compareTo(s2)); // this.age-o.age

        // 优先级队列 默认是 小根堆 ，现在我们要自定义 排序顺序 就可以用到 Comparator 接口
        PriorityQueue<Student> heap = new PriorityQueue<>(new IdComparator1());
        Student str1 = new Student("张三",18,2);
        Student str2 = new Student("李四",28,6);
        Student str3 = new Student("王五",24,3);
        Student str4 = new Student("赵六",30,5);

        heap.add(str1);
        heap.add(str2);
        heap.add(str3);
        heap.add(str4);
        while(!heap.isEmpty()){
            Student s = heap.poll();
            System.out.println(s.name + ", " + s.id + ", " + s.age);
        }
    }
}
