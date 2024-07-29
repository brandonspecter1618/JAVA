package br.org.authenticationDB;
//import br.org.authenticationDB.ManageDB;
import br.org.authenticationDB.ConnectionDB;

public class Main {
    public static void main(String[] ar1gs) {
        ConnectionDB objConnDB = new ConnectionDB(); //Aqui o objeto ao ser declarado, chama automaticamente um constructor
        objConnDB.connectionDB();

        //ManageDB objManageDB = new ManageDB();
        //objManageDB.manageDB();
    }
}

