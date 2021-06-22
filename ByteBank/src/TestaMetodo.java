public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        System.out.println("Conta do Paulo: " + contaDoPaulo.saldo);
        System.out.println("Conta da Marcela: " + contaDaMarcela.saldo);

        contaDaMarcela.transfere(300, contaDoPaulo);

        System.out.println("Conta do Paulo: " + contaDoPaulo.saldo);
        System.out.println("Conta da Marcela: " + contaDaMarcela.saldo);
    }
}
