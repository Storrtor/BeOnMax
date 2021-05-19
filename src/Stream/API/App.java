package Stream.API;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    private static class Person{
        private String name;
        private String position;
        private int age;

        public Person(String name,String position , int age) {
            this.name = name;
            this.age = age;
            this.position = position;
        }
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//        System.out.println(list);
//        list.stream()
//                .filter(i -> i%2 ==0)
//                .forEach(n -> System.out.println(n));
//        List<Integer> out = list.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
//        System.out.println(out);

//        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list2.stream().map(n -> n * 5).forEach(n -> System.out.println(n));
//
//        list2.stream().map(n -> {
//            StringBuilder builder = new StringBuilder();
//            for (int i = 0; i < n; i++) {
//                builder.append("A");
//            }
//            return builder.toString();
//        }).forEach(str -> System.out.println(str));
//        System.out.println(list.stream().filter(n -> n<6).count());
        /**
         * Способы создания стрима
         */
        List<String> strList  = new ArrayList<>(Arrays.asList("A","B","C"));
//        strList.stream().
        String[] arr = {"A","B","C"};
        Stream<String> arrStream = Arrays.stream(arr);
//        Arrays.stream(arr). заворот массива в стриме
        Stream<String> streamBuilder = Stream.of("A","B","C","D","E");


    }

    private static void extracted() {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Bob1","Engineer", 45),
                new Person("Bob2","Engineer", 37),
                new Person("Bob3","Manager", 32),
                new Person("Bob4","Manager", 34),
                new Person("Bob5","Engineer", 44),
                new Person("Bob6","CEO", 50)
        ));
        List<Person> engineers = new ArrayList<>();
        for (Person p : persons) {
            if(p.position.equals("Engineer")){
                engineers.add(p);
            }
        }
        Collections.sort(engineers, new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        List<String> engeniiersNames = new ArrayList<>();
        for(Person p : engineers){
            engeniiersNames.add(p.name);
        }
        System.out.println(engeniiersNames);

        List<String> engNames = persons.stream()
                .filter(p -> p.position.equals("Engineer"))
                .sorted((o1, o2) -> o1.age - o2.age)
                .map(p -> p.name)
                .collect(Collectors.toList());

        System.out.println(engNames);
    }


}
