import java.util.Scanner;


public class Quadrat {

    //Multiplicar fins que l'arrel quadrada del resultat multiplicat no dongui decimal
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // obrim el objecte scanner pero poder utilitzarlo amb el nom sc
        //variable num
        int num =0;
        // bucle per tal de que fer el try catch repetir si peta.
        // Fem un try catch, per donar missatge de error en cas de que no es fiqui les dades demanades.
        do{

            try{
                System.out.print("Ingresa el numero de filas:");
                num=sc.nextInt();
            }catch(Exception e){
                System.out.println("Introduciste un dato erroneo.");
                sc.nextLine();
            }
        }
        while(num<1 || num>50);
        System.out.println(num);
        getPerfectSquare(num);
    }

    /**
     * Funció que aconsegueix el nombre perfecte de l'arrel quadrada sense cap decimal.
     * @param num numero introduït per el usuari
     * @return int - numero perfecte sense decimals
     */
    public static int getPerfectSquare(int num){

        int perfectNum = 0;
        boolean perfect = false;
        for(int i = 1; i < 2; i++){
            int resultat = perfectNum * i;
            System.out.println(Math.sqrt(8));
        }
        return perfectNum;
    }

}
