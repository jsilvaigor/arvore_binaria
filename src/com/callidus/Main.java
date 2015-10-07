package com.callidus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        import java.lang.System;

/**
 *
 * @author linda
 */
public class Main {

    public static void main(String[] args) {
        ArvoreBinaria arvore1 = new ArvoreBinaria();

        System.out.println("Inserindo na arvore 1:");
        arvore1.insereNode("Joao", 2000);
        arvore1.insereNode("Maria", 8000);
        arvore1.insereNode("Luzia", 500);
        arvore1.insereNode("Mariana", 15000);
        arvore1.insereNode("Janayna", 150);



        //1 - imprimir os nomes em ordem alfabetica
        System.out.println("\n Em ordem alfabetica: ");
        System.out.print("Arvore1 -> ");
        arvore1.inorder();

        //2 - imprimir todos os diretores
        System.out.println("\n Todos os diretores");
        System.out.print("Arvore1 -> ");
        System.out.println(arvore1.imprimeDiretores());

        //3 - imprimir todos os operarios
        System.out.println("\n Todos os operarios");
        System.out.print("Arvore1 -> ");
        System.out.println(arvore1.imprimeOperarios());

        //4 - imprime a soma dos salarios dos diretores
        System.out.println("\n Salario dos diretores");
        System.out.print("Arvore1 -> ");
        System.out.println(arvore1.somaSalarioDiretores());

        //5 - imprime a soma dos salarios dos operarios
        System.out.println("\n Salario dos operarios");
        System.out.print("Arvore1 -> ");
        System.out.println(arvore1.somaSalarioOperarios());

        //6 - dado um nome, retorna o salario
        System.out.println("\n Salario do nome");
        System.out.print("Arvore1 -> ");
        System.out.println(arvore1.retornaSalarioNome("Mariana"));

        //7- Retornar os nomes dos funcionários que recebem menos de R$ 1.000,00
        System.out.println("\n Recebe menos que R$ 1.000,00:");
        System.out.print("Arvore1 -> ");
        arvore1.recebeMenosDeMil();


        //8 – Retornar a quantidade de funcionários que recebem menos de R$ 1.000,00
        System.out.println("\n Quantidade com salário inferior a R$ 1.000,00");
        System.out.println(arvore1.getQtdMenosQueMil());

        //9 – Dar aumento de R$ 10,00 aos operarios
        System.out.println("\n Aumento dos operarios");
        System.out.println(arvore1.aumentoOperarios(10));

    }

}

