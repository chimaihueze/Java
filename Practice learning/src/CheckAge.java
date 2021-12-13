public class CheckAge {
    static void ageCheck(int age) {

        if (age >= 18) {
            System.out.println("You're welcome to the party!");
        } else {
            System.out.println("Sorry, you're just " + age + " we can't allow you on.");
        }
    }

    public static void main(String[] args) {
        ageCheck(10);
        ageCheck(20);
    }
    
}
