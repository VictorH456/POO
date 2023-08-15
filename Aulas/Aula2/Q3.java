package Aula2;

public class Q3 {
    public static void main(String[] args) {
        int multiplos = 0;
        for (int i = 1; i <= 100; i++){
            if (i%3 == 0){
                multiplos +=1;
            }
        }
        System.out.println(multiplos);
    }
}
