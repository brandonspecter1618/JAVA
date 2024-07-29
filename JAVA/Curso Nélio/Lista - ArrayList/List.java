package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();  //ArrayList<String> a opçao String e opcional
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Katherine");
        list.add(2, "Marco");  //Utilizado para adicionar em uma determina posiçao
        list.add(3, "Anna");
        //list.remove("Bob");  //Aqui remove um item da lista com o mesmo nome
        //list.remove(1);  //Aqui remove de acordo com a posiçao
        //list.removeIf(x -> x.charAt(0) == 'M'); //Aqui remove tudo que comece com a letra "M"


        System.out.println("---------------------------------------------------------");

        System.out.println("Tamanho da lista: " + list.size());  //Verifica o tamanho da lista
        System.out.println("Index Of: " + list.indexOf("Bobdd")); //Localizaçao de nome referente se nao encontra retorna -1

            for (String objList : list) {
                System.out.println("List: " + objList);
            }

        System.out.println("---------------------------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        //Gera uma 
            for (String objList : result) {
                System.out.println("List: " + objList);
            }
    }
}