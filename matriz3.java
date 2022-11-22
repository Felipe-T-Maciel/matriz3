import java.util.Scanner;
public class mat3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linhaM=0, colunaM=0, diagonalPrincipal=0, diagonalSecundaria=0, Total=0;
        int[][] matriz = new int[5][5];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.println("coluna ["+(i+1)+"] linha ["+(j+1)+"] valor: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(j==3){
                    linhaM+=matriz[i][j];
                }
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==1){
                    colunaM+=matriz[i][j];
                }
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    diagonalPrincipal+=matriz[i][j];
                }
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(j+i==4){
                    diagonalSecundaria+=matriz[i][j];
                }
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                Total+=matriz[i][j];
            }
        }

        System.out.println(linhaM);
        System.out.println(colunaM);
        System.out.println(diagonalPrincipal);
        System.out.println(diagonalSecundaria);
        System.out.println(Total);
        
    }
}
