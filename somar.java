import javax.swing.*;

class Somar {
    public static void main(String[] args) {

        int vetsoma[], i, soma = 0;
        vetsoma = new int[100];

        for (i = 0; i < 100; i++) {
            vetsoma[i] = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite um numero inteiro")
            );
            soma = soma + vetsoma[i];
        }

        System.out.println("A soma dos 100 numeros é: " + soma);
        System.exit(0);
    }
}