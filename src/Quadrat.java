import java.util.Scanner;

public class Quadrat {
    static Scanner sc = new Scanner(System.in); //Scanner

    public static void main(String[] args) {
        int num =0; //Número triat per l'usuari
        int quant = 0; //Quantitat de números a calcular
        boolean correct = false; //Boolean de comprovació
        int x = 0; //Variable per controlar la quantitat de números a calcular

        //Bucle i control d'entrada de la quantiat d'entrades de l'usuari
        do{
            try {
                System.out.print("Introdueix la quantitat de casos a analitzar: ");
                quant = sc.nextInt();
                correct = true;
            }catch (Exception e){
                System.out.println("***ERROR***");
                System.out.println("Només es permeten números.");
                System.out.println("-------------------------");
                sc.nextLine();
            }
        }while(!correct);

        //Fem un try catch i controlem els possibles errors provocats per les entrades de l'usuari
        do{
            try{
                System.out.print("Introdueix el número a calcular: ");
                num=sc.nextInt();
                while(num<1 && num>Math.pow(num, 31)){
                    System.out.println("Introdueix un número correcte.");
                    num=sc.nextInt();
                }
                int result = getPerfectSquare(num);
                if (result == -1){
                    System.out.println("No és quadrat perfecte.");
                }else{
                    System.out.println("El número és: "+getPerfectSquare(num));
                }
                x++;
                sc.nextLine();
            }catch(Exception e){
                System.out.println("El valor introduït és incorrecte.");
                sc.nextLine();
            }
        } while(x < quant);



    }

    /**
     * Funció que aconsegueix el nombre perfecte de l'arrel quadrada sense cap decimal.
     * @param num numero introduït per el usuari
     * @return int - numero perfecte sense decimals
     */
    public static int getPerfectSquare(int num){
        for(int i = 1; i < 2000000000; i++){
            int resultat = num * i;
            double decimal = Math.sqrt(resultat);
            System.out.println(resultat + " resultat");
            System.out.println(decimal + " decimal");

            if (decimal%1 == 0) return i;;
        }
        return -1;
    }
}