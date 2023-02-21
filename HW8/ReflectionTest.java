
/** 
* 
* @author Nhu Ly
* @since 12/09/2022
*/
import java.lang.reflect.*;

public class ReflectionTest {

	public static void main(String[] args) {
		Method[] declaredMethods = Person.class.getDeclaredMethods();
		System.out.println("Person Class Methods : \n");

		/**
		 * loop to display methods indo
		 */
		for (int i = 0; i < declaredMethods.length; i++) {

			/**
			 * display method name and parameters count
			 */
			System.out.printf("%-15s: Total Parameters - %2d", declaredMethods[i].getName(),
					declaredMethods[i].getParameterCount());
			Class[] parameters = declaredMethods[i].getParameterTypes();
			if (parameters.length > 0)
				System.out.printf(": Parameter Types -");
			/**
			 * display parameter names
			 */
			for (Class parameter : parameters) {
				System.out.print(" " + parameter.getSimpleName());
			}

			System.out.print("\n");

		}

		/**
		 * declared methods of Address class
		 */
		Method[] declaredMethodAddress = Address.class.getDeclaredMethods();
		System.out.println("\n\nAddress Class Methods: \n");

		/**
		 * loop to display methods indo
		 */
		for (int i = 0; i < declaredMethodAddress.length; i++) {
			System.out.printf("%-15s : Total Parameters - %2d", declaredMethodAddress[i].getName(),
					declaredMethods[i].getParameterCount());
			Class[] parameters = declaredMethodAddress[i].getParameterTypes();
			if (parameters.length > 0)
				System.out.printf(" : Parameter Types -");
			for (Class parameter : parameters) {
				System.out.print(" " + parameter.getSimpleName());
			}

			System.out.print("\n");
		}

		/**
		 * get all fields from Address array
		 */
		Field[] fields = Address.class.getDeclaredFields();
		System.out.println("\n\nAddress Class Fields: \n");
		/**
		 * loop to display name, type and modifier of fields
		 */
		for (Field field : fields) {
			System.out.printf("%-10s %-10s   %s\n", field.getName(), field.getAnnotatedType().getType().getTypeName(),
					Modifier.toString(field.getModifiers()));
		}

		System.out.println("------------------------------");
		try {
			Person person1Instance = Person.class.getDeclaredConstructor().newInstance();
			Address address1Instance = Address.class.getDeclaredConstructor().newInstance();
			address1Instance.setStreetNum(123);
			address1Instance.setStreetName("Seventh St.");
			address1Instance.setCity("San Jose");
			address1Instance.setState("CA");
			address1Instance.setZip("00001");

			person1Instance.setFirstName("John");
			person1Instance.setLastName("Doe");
			person1Instance.setAge(35);
			person1Instance.setSsn("123-456=781");
			person1Instance.setAddress(address1Instance);

			System.out.println("1st Person:");
			System.out.println("\tFirst Name: " + person1Instance.getFirstName());
			System.out.println("\tLast Name: " + person1Instance.getLastName());
			System.out.println("\tAge: " + person1Instance.getAge());
			System.out.println("\tSSN: " + person1Instance.getSsn());
			System.out.println("\tAddress: " + person1Instance.getAddress());

			Person person2Instance = Person.class.getDeclaredConstructor().newInstance();
			Address address2Instance = Address.class.getDeclaredConstructor().newInstance();
			address2Instance.setStreetNum(456);
			address2Instance.setStreetName("Tenth St.");
			address2Instance.setCity("San Jose");
			address2Instance.setState("CA");
			address2Instance.setZip("00002");

			person2Instance.setFirstName("Jane");
			person2Instance.setLastName("Doe");
			person2Instance.setAge(23);
			person2Instance.setSsn("123-456-782");
			person2Instance.setAddress(address2Instance);

			System.out.println("2nd Person:");
			System.out.println("\tFirst Name: " + person2Instance.getFirstName());
			System.out.println("\tLast Name: " + person2Instance.getLastName());
			System.out.println("\tAge: " + person2Instance.getAge());
			System.out.println("\tSSN: " + person2Instance.getSsn());
			System.out.println("\tAddress: " + person2Instance.getAddress());

			Person person3Instance = Person.class.getDeclaredConstructor().newInstance();
			Address address3Instance = Address.class.getDeclaredConstructor().newInstance();
			address3Instance.setStreetNum(789);
			address3Instance.setStreetName("Eleventh St.");
			address3Instance.setCity("San Jose");
			address3Instance.setState("CA");
			address3Instance.setZip("00003");

			person3Instance.setFirstName("Nhu");
			person3Instance.setLastName("Ly");
			person3Instance.setAge(18);
			person3Instance.setSsn("123-456-783");
			person3Instance.setAddress(address3Instance);

			System.out.println("3rd Person: ");
			System.out.println("\tFirst Name: " + person3Instance.getFirstName());
			System.out.println("\tLast Name: " + person3Instance.getLastName());
			System.out.println("\tAge: " + person3Instance.getAge());
			System.out.println("\tSSN: " + person3Instance.getSsn());
			System.out.println("\tAddress: " + person3Instance.getAddress());
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}