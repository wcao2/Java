package cn.ascending.test23Collection.list;

import java.util.LinkedList;

/*
*  java.util.linkedlist集合 implements list接口
*  linkedelist集合特点 1:底层是一个链表结构(Linked list structure) query slowly, but add and delete quickly
*                     2:It contains a lot of methods for manipulating the first and last elements
* */
public class LinkedListeg {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        //create linkedList集合对象
        //等号左边是谁　优先用谁　没有向上找
        LinkedList<String> linked=new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        //1: public void addFirst(E e)往集合开头添加元素   === public void push(E e)
        linked.addFirst("www");
        linked.push("www");
        System.out.println(linked);
        //2: public void addLast(E e)往集合末尾添加元素
        linked.addLast("com");
        System.out.println(linked);

        System.out.println("======================");
        //linked.clear();//再获取集合中的元素 会抛出NoSuchElementException
        if(!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println("the first element: "+first);
            String last = linked.getLast();
            System.out.println("the last element: "+last);
        }

        //1: public E removeFirst(); ==== public E pop();
        String firstEle = linked.removeFirst();
        System.out.println("the first removed element: "+firstEle);
        //2: public E removeLast();
        String lastEle = linked.removeLast();
        System.out.println("the last removed element: "+lastEle);
    }
}
