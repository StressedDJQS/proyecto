public class InversorMatriz {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int [] array = {1,2,3,4,5,6};
        int []arrayInv;
        arrayInv=invertirArray(array);
        for(int i=0;i<arrayInv.length;i++){
            System.out.print(arrayInv[i]+", ");
        }
    }
    public static int [] invertirArray(int[] a){
        int arrayInvertido[] = new int[a.length];
        for(int i=0; i<a.length;i++){
            arrayInvertido[i]=a[a.length-i-1];
        }
        return arrayInvertido;
    }
}
