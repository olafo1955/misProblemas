
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param z
     * @param args the command line arguments
     */
    public static long elMaximo(ArrayList<Long>z){
        Long max=z.get(0);
        for (int i=1;i<z.size();i++){
            if (max<z.get(i)){
                max=z.get(i);
            }
        }
        return max;
    }
    public static long longitud(long i){
        long contador=0;
        
        if (i==1)
            return (contador=1);
        else{
                contador=1;
                while (i!=1){
//                    System.out.println("i "+i);
                    if ((i%2)==0){
                        i=i/2;
                        
                    }else
                        i=3*i+1;
                    contador+=1;
                }
                
        }
        return contador;
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       BufferedReader in;
        in = new BufferedReader( new InputStreamReader( System.in ) );
        String cadena,dato;
        long i =0, j=0, is=0,js=0;
        StringTokenizer ts;
        while( (cadena = in.readLine() ) != null ){
            ArrayList<Long> longitudes=new ArrayList<>();
            ts = new StringTokenizer( cadena );
            dato= ts.nextToken().trim();
            i=Long.parseLong(dato);
            is=i;
            long x;
            dato= ts.nextToken().trim();
            j = Long.parseLong(dato);
            js=j;
            if (is>js){
                long temp=is;
                is=js;
                js=temp;
            }
            for ( x=is; x<=js;x++){
                longitudes.add(longitud(x));
            }
              System.out.println(i+" "+j+" "+elMaximo(longitudes));                 }
        }
}

