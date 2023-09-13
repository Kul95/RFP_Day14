package com.PracticeProblem.Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.offer(56);
        queue.offer(30);
        queue.offer(70);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
