package Sistema_Pedidos;

import java.time.LocalDate;

public class Sistema_Pedidos {
    public static void main(String[] args) {

        Produto smarthphone = new Produto("Smarthphone Samsung Galaxy", 799.99);
        smarthphone.setEstoque(200);
        smarthphone.setId("ELC67890");
        smarthphone.setDescricao("A15");
        

        Produto geleiaReal = new Produto("Geleia Real", 4999.99);
        geleiaReal.setEstoque(50);
        geleiaReal.setId("FOOD74892");
        geleiaReal.setDescricao("In Natura");
        
    
        ClientePF clientePF = new ClientePF("João Pedro", "joaopedro@cliente.com","JOAOPEDRO","96730-8191","095.438.721-66");


        IPagamento pagamentoCartaoCredito = new PagamentoCartaoCredito(); 


        Pedido pedido1 = new Pedido(LocalDate.of(2025, 10, 4), clientePF);
        pedido1.adicionarItem(smarthphone, 1);

        
        
        Pedido pedido2 = new Pedido(LocalDate.of(2025, 11, 30), clientePF);
        pedido2.adicionarItem(geleiaReal, 1);


        pedido1.setPagamento(pagamentoCartaoCredito);
        pagamentoCartaoCredito.processarPagamento(800);
        pedido1.confirmarPedido();

        pedido2.setPagamento(pagamentoCartaoCredito);
        pagamentoCartaoCredito.processarPagamento(5000);
        pedido2.confirmarPedido();




        Produto console = new Produto("PlayStation 5", 3569.99);
        console.setEstoque(400);
        console.setId("ELC12983");
        console.setDescricao("Um controle sem fio e um jogo");

        Produto pcgamer = new Produto("PC Gamer", 4999.99);
        pcgamer.setEstoque(500);
        pcgamer.setId("ELC79124");
        pcgamer.setDescricao("Processador: i9-2380, Placa de video: GTX-4090, Memória: 32GB");


        ClientePJ clientePJ = new ClientePJ("Loja Lord Games", "lordgames@cliente.com","LORDGAMES","94661-5329"," 00.623.904/0001-73");


        IPagamento pagamentoBoleto = new PagamentoBoleto();


        Pedido pedido3 = new Pedido(LocalDate.of(2025, 12, 25), clientePJ);
        pedido3.adicionarItem(console,10);

        Pedido pedido4 = new Pedido(LocalDate.of(2025, 11, 26), clientePJ);
        pedido4.adicionarItem(pcgamer,25);


        pedido3.setPagamento(pagamentoBoleto);
        pagamentoBoleto.processarPagamento(35700);
        pedido3.confirmarPedido();

        pedido4.setPagamento(pagamentoBoleto);
        pagamentoBoleto.processarPagamento(12500);
        pedido4.confirmarPedido();







        System.out.println("---------- Produtos ----------");
        smarthphone.exibirDetalhes();


        System.out.println("---------- Dados do Pedido 1 ----------");
        pedido1.exibirDetalhes();

        System.out.printf("Preço total: %.2f\n", pedido1.calcularTotal());


        System.out.println("---------- Produtos ----------");
        geleiaReal.exibirDetalhes();


        System.out.println("---------- Dados do Pedido 2 ----------");
        pedido2.exibirDetalhes();

        System.out.printf("Preço total: %.2f\n", pedido2.calcularTotal());



        System.out.println("---------- Cliente ----------");
        clientePF.exibirDetalhes();


        System.out.println("//////////////////////////////");

        
        System.out.println("---------- Produtos ----------");
        console.exibirDetalhes();


        System.out.println("---------- Dados do Pedido 3 ----------");
        pedido3.exibirDetalhes();

        System.out.printf("Preço total: %.2f\n", pedido3.calcularTotal());
        System.out.printf("Preço com desconto: %.2f\n", pedido3.aplicarDesconto(0.20));


        System.out.println("---------- Produtos ----------");
        pcgamer.exibirDetalhes();


        System.out.println("---------- Dados do Pedido 4 ----------");
        pedido4.exibirDetalhes();

        System.out.printf("Preço total: %.2f\n", pedido4.calcularTotal());


        System.out.println("---------- Cliente ----------");
        clientePJ.exibirDetalhes();

    }
}
