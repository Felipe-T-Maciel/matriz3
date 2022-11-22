import java.util.Scanner;
public class matriz4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];

        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[i].length;j++){
                System.out.println("Coluna ["+(i+1)+"] linha["+(j+1)+"] valor: ");
                matriz1[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[i].length;j++){
                matriz2[i][j] = (matriz1[i][j]*matriz1[i][j]*matriz1[i][j]);
            }
        }

        for(int i=0;i<matriz2.length;i++){
            for(int j=0;j<matriz2[i].length;j++){
                System.out.println("Coluna ["+(i+1)+"] linha["+(j+1)+"] = "+matriz2[i][j]);
            }
        }
    }
}
"# matriz3" 
