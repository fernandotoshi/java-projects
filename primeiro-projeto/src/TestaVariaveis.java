public class TestaVariaveis {
    public static void main(String[] args){
        System.out.println("ola novo teste");
        int idade = 10;
        System.out.println(idade);
        double salario = 10.67;
        imprimeNumero((int)salario);
        imprimeNumero(idade);
        imprimeTexto("Hello World");

    }

    public static void imprimeNumero(int numero){
        System.out.println(numero);
    }

    public static void imprimeTexto(String texto){
        System.out.println(texto);
    }

}
