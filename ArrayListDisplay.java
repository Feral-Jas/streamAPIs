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
		/* APIs */
		System.out.println("forEach");
		arraylist.forEach(item -> System.out.print(item + " "));
                System.out.println();

		System.out.print('\n' + "stream + filter  + forEach " + '\n');
		arraylist.stream()
                	 .filter(item -> item != null)
                         .forEach(item -> System.out.print(item + " "));

                System.out.println();
		System.out.print('\n' + "stream + sorted + forEach" + '\n');
		arraylist.stream()
                         .sorted()
                         .forEach(item -> System.out.print(item + " "));

                System.out.println();
		System.out.print('\n'+"stream + sorted + filter(3) + forEach" + '\n');
		arraylist.stream()
                         .sorted()
                         .filter(item->item!=3)
                         .forEach(item -> System.out.print(item + " "));

                System.out.println();
		System.out.print('\n'+"stream + sorted(Comparator) + forEach" + '\n');
		arraylist.stream()
                         .sorted((before,after)->{
				if(before>after)
					return -1;
				else
					return 1;
				}
		         )
                         .forEach(item -> System.out.print(item + " "));
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();

	}
}
