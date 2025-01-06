package com.linkedin.javacodechallenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static List<String> findStudentsWithIncompleteVolunteerEvents(
            List<String> students,
            Map<String, List<String>> attendeesMapping) {
        // TODO: implement function
        Map<String, Integer> studentAttendees = new HashMap<>();
        for(String student : students) {
            studentAttendees.put(student, 0);
        }
        // the above enhanced for loop along with map defclaratgion can be written as 
        //Map<String, Integer> studentAttendees = students.stream().collect(Collectors.toMap(s->s, n->0));
        for(Entry<String, List<String>> valueMap : attendeesMapping.entrySet()) {
            for(String student : valueMap.getValue()) {
             if((studentAttendees).containsKey(student)) {
                int count =  studentAttendees.get(student);
                count++;
                studentAttendees.put(student,count);
            }
            }
        }
        
        return studentAttendees.entrySet().stream().filter(s->s.getValue() < 2).map(s->s.getKey()).toList();
    }

    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly",
                "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));

        System.out.println(findStudentsWithIncompleteVolunteerEvents(
                students, attendeesMapping));
    }

}
