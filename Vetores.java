public class Vetores {
    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};

        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        String[] nomes = new String[3];

        System.out.println("Vetor de numeros inic valores: " + numbers);
        System.out.println("Vetor de numeros inic manual: " + numeros);

        System.out.println("Valores do vetor utilizando o for");

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Elementos na posição[" + i + "]:" + numbers[i]);
        }
    }
}
