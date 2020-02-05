package me.lycheng.jeetcode.algorithm.hash;

import java.util.*;

/**
 * https://leetcode.com/problems/employee-importance/
 */
public class EmployeeImportance {

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, List<Integer>> relations = new HashMap<>();
        Map<Integer, Integer> iMap = new HashMap<>();

        employees.forEach(employee -> {
            List<Integer> subordinates = relations.getOrDefault(employee.id, new LinkedList<>());
            if (employee.subordinates != null && !employee.subordinates.isEmpty())
                subordinates.addAll(employee.subordinates);
            relations.put(employee.id, subordinates);
            iMap.put(employee.id, employee.importance);
        });

        Set<Integer> ids = new HashSet<>();
        return DFS(relations, iMap, ids, id);
    }

    private int DFS(Map<Integer, List<Integer>> relations, Map<Integer, Integer> iMap, Set<Integer> ids, int id) {
        if (ids.contains(id))
            return 0;

        ids.add(id);
        int importance = iMap.get(id);
        List<Integer> subordinates = relations.get(id);
        if (subordinates == null || subordinates.isEmpty())
            return importance;

        for(int i: subordinates) {
            importance += DFS(relations, iMap, ids, i);
        }
        return importance;
    }
}
