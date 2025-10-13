package Sistema_Pedidos;

import java.time.LocalDate;

public class Sistema_Pedidos {
    public static void main(String[] args) {

        Produto teclado = new Produto("Fortrek Teclado Gamer", 79.10);
        teclado.setEstoque(15);

        Produto geleiaReal = new Produto("Geleia Real - In Natura", 499.99);
        geleiaReal.setEstoque(50);
        
    
        ClientePF clientePF = new ClientePF("João Pedro", "joaopedro@cliente.com","","","095.438.721-66");


        IPagamento pagamentoCartaoCredito = new PagamentoCartaoCredito(); 


        Pedido pedido1 = new Pedido(LocalDate.of(2025, 10, 4), clientePF);
        pedido1.adicionarItem(teclado, 1);

        
        
        Pedido pedido2 = new Pedido(LocalDate.of(2025, 11, 30), clientePF);
        pedido2.adicionarItem(geleiaReal, 1);


        pedido1.setPagamento(pagamentoCartaoCredito);
        pagamentoCartaoCredito.processarPagamento(150);

        pedido2.setPagamento(pagamentoCartaoCredito);
        pagamentoCartaoCredito.processarPagamento(500);




        Produto console = new Produto("PlayStation 5", 3569.99);
        console.setEstoque(400);

        Produto smarthphone = new Produto("Smarthphone Samsung Galaxy A36", 1499.99);
        smarthphone.setEstoque(500);


        ClientePJ clientePJ = new ClientePJ("Loja Rico Games", "ricogames@cliente.com","",""," 00.623.904/0001-73");


        IPagamento pagamentoBoleto = new PagamentoBoleto();


        Pedido pedido3 = new Pedido(LocalDate.of(2025, 12, 25), clientePJ);
        pedido3.adicionarItem(console,10);

        Pedido pedido4 = new Pedido(LocalDate.of(2025, 11, 26), clientePJ);
        pedido4.adicionarItem(smarthphone,1);


        pedido3.setPagamento(pagamentoBoleto);
        pagamentoBoleto.processarPagamento(800);

        pedido4.setPagamento(pagamentoBoleto);
        pagamentoBoleto.processarPagamento(1500);







        System.out.println("---------- Produto 1 ----------");
        teclado.exibirDetalhes();


        System.out.println("---------- Dados do Pedido ----------");
        pedido1.exibirDetalhes();

        System.out.printf("Preço total: %.2f\n", pedido1.calcularTotal());


        System.out.println("---------- Dados do Pedido ----------");
        pedido2.exibirDetalhes();

        System.out.printf("Preço total: %.2f\n", pedido2.calcularTotal());



        System.out.println("---------- Cliente ----------");
        clientePF.exibirDetalhes();


        System.out.println("//////////////////////////////");

        
        System.out.println("---------- Produto 1 ----------");
        console.exibirDetalhes();


        System.out.println("---------- Dados do Pedido ----------");
        pedido3.exibirDetalhes();

        System.out.printf("Preço total: %.2f\n", pedido3.calcularTotal());


        System.out.println("---------- Dados do Pedido ----------");
        pedido4.exibirDetalhes();

        System.out.printf("Preço total: %.2f\n", pedido4.calcularTotal());


        System.out.println("---------- Cliente ----------");
        clientePJ.exibirDetalhes();

    }
}
