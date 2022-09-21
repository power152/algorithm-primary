package newbie0.class06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Kiteye
 * @date 1/7/2022
 * @Description  比较器 一般是自己定义比较什么
 */

class Student {
    public String name;
    public int age;
    public int id;

    public Student (String name,int age,int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
}

public class ShowComparator {

    // 谁 Age 大，谁放前
    public static class AgeComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.age < o2.age){
                return 1;
            } else if(o2.age < o1.age){
                return -1;
            } else {
                return 0;
            }
        }
    }

    // 这里规定是比 id ，以 id 顺序排; 谁 id 小，谁放前
    protected static class IdComparator implements Comparator<Student> {
        /**
         * 如果返回负数，认为第一个参数应该排在前面
         * 如果返回正书，认为第二个参数应该排在前面
         * 如果返回 0 ，认为谁放在前面无所谓。
         */
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.id < o2.id){  // o1 < o2 明显 o1 的年龄小，排在前面 升序
                return -1;
            } else if (o2.id < o1.id){ // o2 的年龄大，排在后面  降序
                return 1;
            } else {
                return 0 ;
            }

            // return o1.id -o2.id <0 升序
            // return o2.id - o1.id >0 降序
        }
    }


    public static void printArray(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static  void printStudent(Student[] students){
        for (int i = 0;i< students.length;i++){
            System.out.print(students[i].name+" "+students[i].age+" " + students[i].id+" , ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        // 通过普通的数组可以知道，可以用java标准库里面的 sort排序，即可完成排序。
        int[] arr = { 8, 1, 4, 1, 6, 8, 4, 1, 5, 8, 2, 3, 0 };
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);

        // 现在我们来给学生排序，学生需要按照什么方式排序我们要自己定义；如果贸然使用 sort 会报 Comparable 错误。
        Student s1 = new Student("张三",18,2);
        Student s2 = new Student("李四",28,6);
        Student s3 = new Student("王五",24,3);
        Student s4 = new Student("赵六",30,5);

        System.out.println("===========================");
        Student[] students = {s1,s2,s3,s4};
        printStudent(students);
        Arrays.sort(students,new IdComparator());
        System.out.println("排序后：");
        printStudent(students);

        List<Student> arrList = new ArrayList<>();
        arrList.add(s1);
        arrList.add(s2);
        arrList.add(s3);
        arrList.add(s4);

        System.out.println("----------------------------------");
        for (Student s:arrList){
            System.out.println(s.name+" "+s.age+" " + s.id+" , ");
        }
        System.out.println("=====================");
        arrList.sort(new AgeComparator());
        for (Student s:arrList){
            System.out.println(s.name+" "+s.age+" " + s.id+" , ");
        }
    }
}
