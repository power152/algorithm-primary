package newbie0.class04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author liuyandeng
 * @date 2/6/2022
 * @Description 用单链表实现队列 和 栈
 */

public class LinkedListToQueueAndStack {
    public static class Node<V> {
        public V value;
        public Node<V> next;

        public Node(V value) {
            this.value = value;

        }
    }

    // 单链表实现队列
    public static class MyQueue<V> {
        // 需要两个变量 head tail，想让连个变量都指向空
        private Node<V> head;
        private Node<V> tail;
        private int size;

        public MyQueue() {
            head = null;
            tail = null;
            size = 0;
        }

        // 队列 offer，poll,size,isEmpty,peek
        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void offer(V value) {
            // 把值创造出一个节点出来
            Node<V> cur = new Node<V>(value);
            // 如果说尾巴是空，head也为空，那么就指向新的节点
            if (tail == null) {
                head = cur;
                tail = cur;
            } else {
                // 不是null ，那么就指向新的下一个节点
                tail.next = cur;
                tail = cur;
            }
            size++;
        }

        public V poll(){
            // 返回的是节点的值，需要一个变量接收一下。
            V answer = null;
            if (head != null) {
                answer = head.value; // 获取当前的旧值
                head = head.next; // head 指向下一个结点
                size--; // 释放到旧的 answer
            }
            // head 走到空了，tail也要走向null，不然tail是尾巴节点就没有释放掉
            if (head == null) {
                tail = null;
            }
            return answer;
        }

        public V peek() {
            V answer = null;
            if (head != null) {
                answer = head.value;
            }
            return answer;
        }

    }


    // 单链表实现一个栈
    public static class MyStack<V> {
        private Node<V> head;
        private int size;

        public MyStack() {
            head = null;
            size = 0;
        }

        // 需要的方法有 push,pop,peek,size,isEmpty
        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void push(V value) {
            Node<V> cur = new Node<>(value);
            if (head == null) {
                head = cur;
            } else {
                cur.next = head;
                head = cur;
            }
            size ++;
        }

        public V pop() {
            V answer = null;
            if (head != null) {
                answer = head.value; // 记录旧的值
                head = head.next;
                size--;
            }
            return answer;
        }

        public V peek() {
            V answer =null;
            if (head != null) {
                answer = head.value;
            }
            return answer;
        }

    }




    public static void testStack() {
        MyStack<Integer> myStack = new MyStack<>();
        Stack<Integer> test = new Stack<>();
        int testTime = 5000000;
        int maxValue = 200000000;
        System.out.println("测试开始！");
        for (int i = 0; i < testTime; i++) {
            if (myStack.isEmpty() != test.isEmpty()) {
                System.out.println("Oops!");
            }
            if (myStack.size() != test.size()) {
                System.out.println("Oops!");
            }
            double decide = Math.random();
            if (decide < 0.33) {
                int num = (int) (Math.random() * maxValue);
                myStack.push(num);
                test.push(num);
            } else if (decide < 0.66) {
                if (!myStack.isEmpty()) {
                    int num1 = myStack.pop();
                    int num2 = test.pop();
                    if (num1 != num2) {
                        System.out.println("Oops!");
                    }
                }
            } else {
                if (!myStack.isEmpty()) {
                    int num1 = myStack.peek();
                    int num2 = test.peek();
                    if (num1 != num2) {
                        System.out.println("Oops!");
                    }
                }
            }
        }
        if (myStack.size() != test.size()) {
            System.out.println("Oops!");
        }
        while (!myStack.isEmpty()) {
            int num1 = myStack.pop();
            int num2 = test.pop();
            if (num1 != num2) {
                System.out.println("Oops!");
            }
        }
        System.out.println("测试结束！");
    }






    public static void testQueue() {
        MyQueue<Integer> myQueue = new MyQueue<>();
        Queue<Integer> test = new LinkedList<>();
        int testTime = 5000000;
        int maxValue = 200000000;
        System.out.println("测试开始！");
        for (int i = 0; i < testTime; i++) {
            if (myQueue.isEmpty() != test.isEmpty()) {
                System.out.println("Oops!");
            }
            if (myQueue.size() != test.size()) {
                System.out.println("Oops!");
            }
            double decide = Math.random();
            if (decide < 0.33) {
                int num = (int) (Math.random() * maxValue);
                myQueue.offer(num);
                test.offer(num);
            } else if (decide < 0.66) {
                if (!myQueue.isEmpty()) {
                    int num1 = myQueue.poll();
                    int num2 = test.poll();
                    if (num1 != num2) {
                        System.out.println("Oops!");
                    }
                }
            } else {
                if (!myQueue.isEmpty()) {
                    int num1 = myQueue.peek();
                    int num2 = test.peek();
                    if (num1 != num2) {
                        System.out.println("Oops!");
                    }
                }
            }
        }
        if (myQueue.size() != test.size()) {
            System.out.println("Oops!");
        }
        while (!myQueue.isEmpty()) {
            int num1 = myQueue.poll();
            int num2 = test.poll();
            if (num1 != num2) {
                System.out.println("Oops!");
            }
        }
        System.out.println("测试结束！");
    }

    public static void main(String[] args) {
        //testQueue();
        testStack();
    }

}
