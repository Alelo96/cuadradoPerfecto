import java.util.Scanner;

public class Quadrat {
    //Multiplicar fins que l'arrel quadrada del resultat multiplicat no dongui decimal

    //Multiplicar fins que l'arrel quadrada del resultat multiplicat no dongui decimal
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // obrim el objecte scanner pero poder utilitzarlo amb el nom sc
        //variable num
        int num =0;
        int quant = 0;
        boolean correct = false;
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


        int x = 0;
        // bucle per tal de que fer el try catch repetir si peta.
        // Fem un try catch, per donar missatge de error en cas de que no es fiqui les dades demanades.

        do{
            try{
                System.out.print("Introdueix el número a calcular: ");
                num=sc.nextInt();
                while(num<1 && num>Math.pow(num, 31)){
                    System.out.println("Introdueix un número més petit.");
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

//        System.out.println(Math.pow(num, 2));



    }

    /**
     * Funció que aconsegueix el nombre perfecte de l'arrel quadrada sense cap decimal.
     * @param num numero introduït per el usuari
     * @return int - numero perfecte sense decimals
     */
    public static int getPerfectSquare(int num){
        for(int i = 1; i < 2; i++){
            int resultat = num * i;
            double decimal = Math.sqrt(resultat);

            if (decimal%1 == 0) return i;;
        }
        return -1;
    }
}