public class SalaryCalc {
    static double salary(double weeklyHours, double amountperHours, double numWeeks) {
        double totalSalary = weeklyHours * amountperHours * numWeeks;
        return totalSalary;
    }
    public static void main(String[] args) {
        double totSal = salary(8, 50, 53);
        System.out.println("John's salary for the year is $" + totSal);
    }      
}
