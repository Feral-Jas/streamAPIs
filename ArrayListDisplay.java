import java.util.ArrayList;

public class ArrayListDisplay {
	public static void main(String[] args) {
		streamAPIs();
	}

	private static void streamAPIs() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(3);
		arraylist.add(2);
		arraylist.add(7);
		arraylist.add(5);
		arraylist.add(4);
		arraylist.add(3);
		/* foreach API */
		System.out.println("forEach API");
		arraylist.forEach(item -> System.out.print(item + " "));
		System.out.print('\n' + "stream + filter API + forEach API" + '\n');
		arraylist.stream().filter(item -> item != null).forEach(item -> System.out.print(item + " "));
		System.out.print('\n' + "stream + sort API + forEach" + '\n');
		arraylist.stream().sorted().forEach(item -> System.out.print(item + " "));
		System.out.print('\n' + "stream + sort API(Comparator) + forEach" + '\n');
		arraylist.stream().sorted(
				(before,after)->{
					if(before>after)
						return -1;
					else
						return 1;
				}
				).forEach(item -> System.out.print(item + " "));
	}
}
