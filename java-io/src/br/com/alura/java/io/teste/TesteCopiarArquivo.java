package br.com.alura.java.io.teste;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket();

        //Fluxo de Entrada com arquivo
        InputStream fis = s.getInputStream(); // Possibilidade de read() return byte em int
        Reader isr = new InputStreamReader(fis); // Possibilidade de read() preenchendo um char[]
        BufferedReader br = new BufferedReader(isr); // Possibilidade de readLine() em String

        // Fluxo de Saída com Arquivo
        OutputStream fos = s.getOutputStream();
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null && linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
