package br.org.authenticationDB;
import br.org.authenticationDB.connDB.ConnectionDB;

public class Main {
    public static void main(String[] args) {
        ConnectionDB objConnDB = new ConnectionDB();
        objConnDB.connectionDB();
    }
}