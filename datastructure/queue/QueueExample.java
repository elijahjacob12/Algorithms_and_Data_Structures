package edu.sdsu.cs160l.datastructure.queue;

import edu.sdsu.cs160l.student.Student;
import edu.sdsu.cs160l.student.StudentLevel;
import edu.sdsu.cs160l.student.StudentMajor;

import java.util.LinkedList;
import java.util.Queue;

/**
 * In class explanation + demonstration
 * Note a queue in java is implemented as a {@link java.util.LinkedList}
 */

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add an element - takes O(1)
        queue.add(1);
        queue.offer(2);

        //check top most element takes O(1) time
        Integer top = queue.peek();

        //remove element take O(1) time
        Integer ele = queue.poll();

        queue.clear();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(6);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        Queue<Student> students = new LinkedList<>();

// Create and add five students
        students.offer(new Student(1L, "John", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE));
        students.offer(new Student(2L, "Jane", 3.8, StudentLevel.JUNIOR, StudentMajor.COMPUTER_ENGINEERING));
        students.offer(new Student(3L, "Jack", 3.5, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE));
        students.offer(new Student(4L, "Janice", 3.9, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_ENGINEERING));
        students.offer(new Student(5L, "Sam", 3.2, StudentLevel.JUNIOR, StudentMajor.COMPUTER_SCIENCE));

// Remove the first two
        Student removed1 = students.poll();
        Student removed2 = students.poll();
        System.out.println("Removed: " + removed1.getName() + ", " + removed2.getName());

// Add one new student
        students.offer(new Student(6L, "Alex", 3.6, StudentLevel.JUNIOR, StudentMajor.COMPUTER_SCIENCE));

// Print the final queue
        System.out.println("Final queue:");
        for (Student s : students) {
            System.out.println(s);
        }

        Student john = new Student(1L, "John", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
    }
}
