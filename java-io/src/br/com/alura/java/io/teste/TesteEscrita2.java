package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {
        // Fluxo de Saída com Arquivo

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.write("asfasdfsafdas dfs sdf asf assdb");

        bw.close();
    }
}
