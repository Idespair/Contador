import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int parUm = a.nextInt();
        System.out.println("Insira outro número: ");
        int parDois = a.nextInt();
        
        try{
            contar(parUm, parDois);
        }
        catch (Exception ExcecaoParametral){
            System.out.println("Parametros inválidos");
        }

    }

    static void contar(int parUm, int parDois) throws ExcecaoParametral {
        if(parUm > parDois) {
            throw new ExcecaoParametral("Paramentros inválidos");
        }
        else {
            int parFinal = parDois - parUm;
            for (int i = 1; i < parFinal; i++){
                System.out.println(i);
            }
        };
    }

}