package Array_matrices.Ejercicio3;

public class Matriz_4x4 {
    public static void main(String[] args) {
        int contador=0;
        int [][] array = new int [4][4];
        int [] vector=new int [16];
        
        vector[contador]=(int)(Math.random()*(20-1+1)+1);
        for(contador=1;contador<16;contador++){
            vector[contador]=(int)(Math.random()*(20-1+1)+1);
            for(int j=0;j<contador;j++){
                if(vector[contador]==vector[j]){
                    contador--;
                }
            }
        }
        
        int m=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                array[i][j]=vector[m];
                m++;
            }
        }
        
        for(int[] z:array){
            for(int x:z){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
}
