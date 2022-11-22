import java.util.Random;
public class Matriz1 {
    public static void main(String[] args) {
        Random ran = new Random();
        int media=0, contador=0;
        int pares[][] = new int[5][5];

        for(int i=0;i<pares.length;i++){
            for(int j=0;j<pares[i].length;j++){
                pares[i][j] = ran.nextInt(100)+1;
                if(pares[i][j]%2==0){
                    contador++;
                    media+=pares[i][j];
                }
            }
        }
        for(int i=0;i<pares.length;i++){
            for(int j=0;j<pares[i].length;j++){
                System.out.println("coluna: "+i+" linha: "+j+" = "+ pares[i][j]);
            }
        }
        System.out.println("\n\nA media dos numeros pares contidos na matriz é: "+media/contador);
    }
}
