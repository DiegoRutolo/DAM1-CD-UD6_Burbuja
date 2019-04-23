
import java.io.*;

/**
 * 
 * @author a16diegoar
 */
public class Burbuja {

    public static void main(String arg[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Ingrese Numero de Datos a Ingresar : ");
        int tam = Integer.parseInt(in.readLine());
        int arr[] = new int[tam];

        System.out.println();

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            j += 1;
            System.out.print("Elemento " + j + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }
        burbuja(arr);
    }

    static void burbuja(int arreglo[]) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int tmp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "\n");
        }
    }
}
