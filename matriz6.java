public class matriz6 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][8];

        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz.length;j++) {
                matriz[i][j] = i+j;
            }
        }

        for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
                System.out.println("Coluna ["+(i+1)+"] linha ["+(j+1)+"] = "+matriz[i][j]);
            }
        }
    }
}
