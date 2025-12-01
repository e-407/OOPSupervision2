package questions;

import java.util.*;

public class StudentMarks {
    private Map<String, Integer> studentData = new HashMap<>();

    public void add(String name, int mark) {
        studentData.put(name, mark);
    }

    public List<String> getStudentsSortedAlphabetically() {
        List<String> names = new ArrayList<>(studentData.keySet());
        Collections.sort(names);
        return names;
    }

    public double getMedianMark() {
        List<Integer> marks = new ArrayList<>(studentData.values());
        Collections.sort(marks);

        int size = marks.size();

        if (size % 2 == 1) {
            return marks.get(size/2);
        } else {
            return (marks.get((size/2) - 1) + marks.get(size/2)) / 2.0;
        }
    }

    public List<String> getTopPPercent(double p) {
        if (p > 0 && p <= 100){
            List<Map.Entry<String, Integer>> entries = new ArrayList<>(studentData.entrySet());
            Collections.sort(entries, new MarkComparator());

            int limit = (int) Math.ceil((p / 100.0) * entries.size());
            List<String> topStudents = new ArrayList<>();

            for (int i = 0; i < limit; i++) {
                topStudents.add(entries.get(i).getKey());
            }
            return topStudents;
        }
        return null;
    }

    private class MarkComparator implements Comparator<Map.Entry<String, Integer>> {
        public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
            return b.getValue().compareTo(a.getValue()); // Descending order
        }
    }
}