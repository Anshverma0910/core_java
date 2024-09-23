package priorityqueue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Queue<patient> patientList = new PriorityQueue<patient>();
        patient p = new patient("amit",2);
        patientList.add(p);
        p = new patient("varun",4);
        patientList.add(p);
        p = new patient("shivam",1);
        patientList.add(p);
        p = new patient("hello",3);
        patientList.add(p);
        while(!patientList.isEmpty())
        {
            System.out.println(patientList.poll());
        }
    }
}
