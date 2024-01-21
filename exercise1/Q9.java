public class Q9 {

    public static void main(String[] args) {
        // This question explores the differences between short-circuit and normal logical operators. 
        // Given the following:
        char c = 'a';
        int age = 9;

        // fragment A
        if (c == 'a' && ++age == 10){
            age++;
        }
        System.out.println("Fragment A: " + age);

        age = 9;
        // fragment B
        if (c == 'a' & ++age == 10){
            age++;
        }
        System.out.println("Fragment B: " + age);

        age = 9;
        // fragment C
        if (c != 'a' && ++age == 10){
            age++;
        }
        System.out.println("Fragment C: " + age);

        age = 9;
        // fragment D
        if (c != 'a' || ++age == 10){
            age++;
        }
        System.out.println("Fragment D: " + age);

        age = 9;
        // fragment E
        if (c == 'a' || ++age == 10){
            age++;
        }
        System.out.println("Fragment E: " + age);
        
        age = 9;
        // fragment F
        if (c != 'a' | ++age == 10){
            age++;
        }
        System.out.println("Fragment F: " + age);

    }
}