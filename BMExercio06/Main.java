import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero entre 1 e 7:");
        int answer = sc.nextInt();
        while(answer != 0) {
            switch(answer){
                case 1:
                    System.out.println("Segunda-feira!");
                    break;
                case 2:
                    System.out.println("Terça-feira!");
                    break;
                case 3:
                    System.out.println("Quarta-feira!");
                    break;
                case 4:
                    System.out.println("Quinta-feira!");
                    break;
                case 5:
                    System.out.println("Sexta-feira!");
                    break;
                case 6:
                    System.out.println("Sábado!");
                    break;
                case 7:
                    System.out.println("Domingo!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }        
    }
}