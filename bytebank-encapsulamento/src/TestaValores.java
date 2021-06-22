public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 1234);
        Conta conta2 = new Conta(3321, 12333);

        conta.setAgencia(-50);
        conta.setNumero(-330);

        System.out.println(conta.getAgencia());

        System.out.println(conta.getTotal());
    }
}
