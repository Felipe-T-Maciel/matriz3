import java.util.Scanner;
public class matriz2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menor=9999999;
        int[][] matriz = new int[7][4];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println("Digite o valor da coluna: "+i+" linha: "+j+"\n> ");
                matriz[i][j] = scan.nextInt();
                if(menor>matriz[i][j]){
                    menor=matriz[i][j];
                }
            }
        }

        System.out.println("o menor valor da matriz esta na posição:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(menor==matriz[i][j]){
                    System.out.println("Coluna: "+i+" linha: "+j);
                }
            }
        }
        System.out.println("O menor valor da Matriz é: "+ menor);
    }
}
