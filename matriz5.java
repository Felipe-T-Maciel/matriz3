import java.util.Scanner;
public class matriz5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] matriz = new double[3][4];
        
        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
                System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] valor: ");
                matriz[i][j] = scan.nextDouble();
            }
        }

        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
                if(i==0 & j==0){
                    System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] = "+matriz[0][0]);
                }
                if(i==2 & j==0){
                    System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] = "+matriz[2][0]);
                }                
            }
        }
    }
}
