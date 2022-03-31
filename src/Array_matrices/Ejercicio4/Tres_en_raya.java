package Array_matrices.Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author manol
 */
public class Tres_en_raya {
    protected String[][] tablero=new String[3][3];
    private int x;
    private int y;
    protected boolean gana;
    
    public Tres_en_raya() {
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                tablero[i][j]=" ";
            }
        }
    }
    public void mostrar_tablero(){
        System.out.println("-------------");
        System.out.println("| "+tablero[0][0]+" | "+tablero[0][1]+" | "+tablero[0][2]+" |");
        System.out.println("-------------");
        System.out.println("| "+tablero[1][0]+" | "+tablero[1][1]+" | "+tablero[1][2]+" |");
        System.out.println("-------------");
        System.out.println("| "+tablero[2][0]+" | "+tablero[2][1]+" | "+tablero[2][2]+" |");
        System.out.println("-------------");
    }
    public void Marcar_x(){
        Scanner ac=new Scanner(System.in);
        int x,y;
        try{
            System.out.println("Introduce las cordenadas (X,Y)");
            x=ac.nextInt();
            y=ac.nextInt();
            if(tablero[x][y]==" "){
                tablero[x][y]="X";
                this.x=x;
                this.y=y;
            }else{
                System.out.println("Ya esta marcada esa posición introduce otra");
                this.Marcar_x();
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Has introducido unas cordenadas incorrecta.");
            System.out.println("Vuelve a introducirlo");
            this.Marcar_x();
        }
    }
    public void Marcar_o(){
        Scanner ac=new Scanner(System.in);
        int x,y;
        try{
            System.out.println("Introduce las cordenadas (X,Y)");
            x=ac.nextInt();
            y=ac.nextInt();
            if(tablero[x][y]==" "){
                tablero[x][y]="O";
                this.x=x;
                this.y=y;
            }else{
                System.out.println("Ya esta marcada esa posición introduce otra");
                this.Marcar_o();
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Has introducido unas cordenadas incorrecta.");
            System.out.println("Vuelve a introducirlo");
            this.Marcar_o();
        }
    }
    public void Comprobar(){
        this.gana=false;
        if(this.x==1 && this.y==1){
            if((tablero[1][0]==tablero[1][1] && tablero[1][2]==tablero[1][1])||(tablero[0][0]==tablero[1][1] && tablero[2][2]==tablero[1][1])||(tablero[1][2]==tablero[1][1] && tablero[2][0]==tablero[1][1])||(tablero[0][1]==tablero[1][1] && tablero[1][1]==tablero[2][1])){
                this.gana=true;
                System.out.println("has ganado");
            }
        }else if(this.x==0 && this.y==0){
            if((tablero[0][0]==tablero[1][1] && tablero[0][0]==tablero[2][2])||(tablero[0][0]==tablero[0][1] && tablero[0][0]==tablero[0][2])||(tablero[0][0]==tablero[1][0] && tablero[0][0]==tablero[2][0])){
                this.gana=true;
                System.out.println("has ganado");
            }
        }else if(this.x==0 && this.y==1){
            if((tablero[0][0]==tablero[0][1] && tablero[0][0]==tablero[0][2])||(tablero[0][1]==tablero[2][1] && tablero[0][1]==tablero[1][1])){
                this.gana=true;
                System.out.println("has ganado");
            }
        }else if(this.x==0 && this.y==2){
            if((tablero[0][0]==tablero[0][1] && tablero[0][0]==tablero[0][2])||(tablero[0][2]==tablero[2][2] && tablero[0][2]==tablero[1][2])||(tablero[0][2]==tablero[1][1] && tablero[0][2]==tablero[2][0])){
                this.gana=true;
                System.out.println("has ganado");
            }
        }else if(this.x==1 && this.y==0){
            if((tablero[1][0]==tablero[0][0] && tablero[0][0]==tablero[2][0])||(tablero[1][1]==tablero[1][0] && tablero[1][1]==tablero[1][2])){
                this.gana=true;
                System.out.println("has ganado");
            }
        }else if(this.x==1 && this.y==2){
            if((tablero[1][2]==tablero[1][1] && tablero[1][1]==tablero[1][0])||(tablero[1][2]==tablero[2][2] && tablero[2][2]==tablero[0][2])){
                this.gana=true;
                System.out.println("has ganado");
            }
        }else if(this.x==2 && this.y==0){
            if((tablero[2][0]==tablero[0][0] && tablero[0][0]==tablero[1][0])||(tablero[2][1]==tablero[2][0] && tablero[2][1]==tablero[2][2])||(tablero[2][0]==tablero[1][1] && tablero[2][0]==tablero[0][2])){
                this.gana=true;
                System.out.println("has ganado");
            }
        }else if(this.x==2 && this.y==1){
            if((tablero[2][0]==tablero[2][1] && tablero[2][1]==tablero[2][2])||(tablero[2][1]==tablero[1][1] && tablero[1][1]==tablero[0][1])){
                this.gana=true;
                System.out.println("has ganado");
            }
        }else if(this.x==2 && this.y==2){
            if((tablero[2][2]==tablero[2][1] && tablero[2][0]==tablero[2][2])||(tablero[1][1]==tablero[2][2] && tablero[0][0]==tablero[1][1])|(tablero[0][2]==tablero[1][2] && tablero[0][2]==tablero[2][2])){
                this.gana=true;
                System.out.println("has ganado");
            }
        }
    }
    public static void main(String[] args) {
        Tres_en_raya a=new Tres_en_raya();
        int contador=1;
        a.mostrar_tablero();
        System.out.println("Jugador de X");
            a.Marcar_x();
            a.mostrar_tablero();
            a.Comprobar();
        do{
            System.out.println("Jugador de O");
            a.Marcar_o();
            a.mostrar_tablero();
            a.Comprobar();
            if(a.gana==true){
                break;
            }
            contador++;
            System.out.println("Jugador de X");
            a.Marcar_x();
            a.mostrar_tablero();
            a.Comprobar();
            if(a.gana==true){
                break;
            }
            contador++;
        }while(contador<9||a.gana==true);
        if(a.gana==false){
            System.out.println("Habeis empatado");
        }
    }
}
