import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Person{
	int age;
	String name;
	public Person( String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return age + name;
	}
}
public class StreamPersons {
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("A",18));
		persons.add(new Person("C",18));
		persons.add(new Person("G",19));
		persons.add(new Person("A",19));
		persons.add(new Person("A",19));
		persons.add(new Person("B",20));

		Map<Integer, Set<Person>> collect1 = persons.stream().collect(Collectors.groupingBy(p -> p.age, Collectors.toSet()));
		collect1.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
		Map<Integer, List<Person>> collect = persons.stream().collect(Collectors.groupingBy(p -> p.age));

		Queue<Person> q = new LinkedList<Person>();
		q.add(new Person("A",1));
		q.addAll(persons);

		Set<Person> setpersons = new HashSet<Person>();
		setpersons.addAll(persons);

		q.removeIf(p -> p.age < 19);
		q.forEach(System.out::println);

	}

}
