public class ExerciceVariables {
public static void main(String[] args){
    int num1 = 5, num2 = 10; 
    System.out.println("La valeur de num1 est " + num1 + " La valeur de num2 est " + num2);
    int num = num1;
    num1 = num2;
    num2 = num;
    System.out.println("La valeur de num1 est " + num1 + " La valeur de num2 est " + num2); 
}
}
