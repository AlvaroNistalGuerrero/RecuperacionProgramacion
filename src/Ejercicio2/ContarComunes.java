package Ejercicio2;

public class ContarComunes {
    public int contarComunes(int [] n1, int[] n2){
        int cont =0;
        for (int i = 0; i <n1.length ; i++) {
            for (int j = 0; j < n2.length ; j++) {
                if(n1[i]==n2[j]){
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        ContarComunes c = new ContarComunes();
        int [] n1 = {1,2,3,4,5,6,7};
        int [] n2 = {1,3,4,1,9,8,9};
        System.out.println(c.contarComunes(n1,n2));
    }
}
