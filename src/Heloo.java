public class Heloo {
    public static void main(String[] args) {
        int [] grades = {1,2,3,4,5,6,7};
        System.out.println("The lenght of the array is : "+ grades.length + "\n");
        for (int i =0; i< grades.length; i++){
            System.out.println("The index of the current loop: " +i);
            System.out.println("The value of grades ["+ i + "]is equal to " +grades[i]+ "\n");
        }

    }
}
