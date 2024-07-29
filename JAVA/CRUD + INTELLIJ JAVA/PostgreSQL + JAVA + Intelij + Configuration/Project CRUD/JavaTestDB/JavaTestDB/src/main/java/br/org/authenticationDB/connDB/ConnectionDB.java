package br.org.authenticationDB.connDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConnectionDB {
    public void connectionDB() {
        String url, username, password, querySelect, queryInsert, queryExclude, queryCurrentDB, currentDatabase = "";
        int select, insert, delete, option;

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        url = "jdbc:postgresql://127.0.0.1:5432/db_aula";
        username = "postgres";
        password = "22091992";

        querySelect = "select id, login, password from aluno";
        queryInsert = "insert into aluno(login, password) values(?, ?)";
        queryExclude = "delete from aluno WHERE id = ?";
        queryCurrentDB = "select current_database()";

        select = 0;
        insert = 1;
        delete = 2;
        option = 0;

        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Por favor selecione uma opçao: " + "\n" + "0 = Select" + "\n" + "1 = Insert " + "\n" + "2 = Delete");
            System.out.println("Opçoes: ");
            option = scan.nextInt();

            try(Connection conn = DriverManager.getConnection(url, username, password)){
                Class.forName("org.postgresql.Driver");
                //conn = DriverManager.getConnection(url, username, password);

                if(conn != null){
                    JOptionPane.showMessageDialog(null, "Connection Sucessfully");
                    System.out.println("Connection Sucessfully");
                }else{
                    System.out.println("Connection Refused");
                }

                //Buscando o nome do banco de dados com Statement

                Statement stmt = conn.createStatement();
                rs = stmt.executeQuery(queryCurrentDB);
                if(rs.next()){
                    currentDatabase = rs.getString(1);
                    //System.out.println("O nome do banco e " + currentDatabase);
                }

                //Buscando o nome do banco de dados com PreparedStatement
                /*
                pstmt = conn.prepareStatement(queryCurrentDB);
                rs = pstmt.executeQuery();
                if (rs.next()) {
                    currentDatabase = rs.getString(1);
                    System.out.println("O nome do banco é: " + currentDatabase);
                }
                */

                if(option == insert) {
                    System.out.println("Login: ");
                    String login = scan.next();

                    System.out.println("Password: ");
                    String pass = scan.next();

                    pstmt = conn.prepareStatement(queryInsert);
                    pstmt.setString(1, login);
                    pstmt.setString(2, pass);
                    int x = pstmt.executeUpdate();
                    if(x == 1){
                        System.out.println("Dados gravados no banco");  //Para fins didaticos
                    }else{
                        System.out.println("Dados nao gravados no banco");
                    }
                }

                if(option == delete){
                    System.out.println("ID: ");
                    int id = scan.nextInt();
                    pstmt = conn.prepareStatement(queryExclude);
                    pstmt.setInt(1, id);
                    int x = pstmt.executeUpdate();
                    if(x == 1){
                        System.out.println("Dado excluido" + x);  //Para fins didaticos
                    }else{
                        System.out.println("Dado nao excluido" + x);
                    }

                }

                if(option == select){
                    pstmt = conn.prepareStatement(querySelect);
                    rs = pstmt.executeQuery();
                    System.out.println("Banco De Dados: " + currentDatabase);

                    while(rs.next()) {
                        System.out.println("ID: " + rs.getInt(1) + "\n" + "LOGIN: " + rs.getString(2) + "\n" +  "PASSWORD: " + rs.getString(3));
                        System.out.println();
                    }
                }
            }

        }catch (SQLException | ClassNotFoundException e) {
            System.out.println("Erro SQL" + e);
        }
    }
}
