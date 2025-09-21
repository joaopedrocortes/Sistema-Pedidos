package Sistema_Pedidos;

import java.time.LocalDate;

public class Sistema_Pedidos {
    public static void main(String[] args) {

        Produto teclado = new Produto("Fortrek Teclado Gamer", 79.10);
        teclado.setEstoque(15);
        

        Produto mousepad = new Produto("Mouse Pad Preto", 8.90);
        mousepad.setEstoque(30);
        

        Produto mouse = new Produto("Mouse Dell sem fio", 69.00);
        mouse.setEstoque(30);
        
    
        ClientePF clientePF = new ClientePF("João Pedro", "joaopedro@cliente.com","095.438.721-66");

        Pedido pedido1 = new Pedido(721387261, "Em andamento", LocalDate.of(2025, 9, 4), clientePF);
        pedido1.adicionarItem(teclado, 1);
        pedido1.adicionarItem(mousepad, 2);
        pedido1.adicionarItem(mouse, 2);




        Produto console = new Produto("PlayStation 5", 3569.99);
        console.setEstoque(400);


        Produto pcgamer = new Produto("PC Gamer RYZEN", 2479.99);
        pcgamer.setEstoque(500);


        Produto monitor = new Produto("Monitor Gamer AOC", 599.99);
        monitor.setEstoque(500);


        ClientePJ clientePJ = new ClientePJ("Loja Rico Games", "ricogames@cliente.com"," 00.623.904/0001-73");

        Pedido pedido2 = new Pedido(4312981, "Em andamento", LocalDate.of(2025, 12, 25), clientePJ);
        pedido2.adicionarItem(console,10);
        pedido2.adicionarItem(pcgamer, 20);
        pedido2.adicionarItem(monitor, 20);
    




        System.out.println("---------- Produto 1 ----------");
        teclado.exibirDetalhes();


        System.out.println("---------- Produto 2 ----------");
        mousepad.exibirDetalhes();


        System.out.println("---------- Produto 3 ----------");
        mouse.exibirDetalhes();


        System.out.println("---------- Dados do Pedido ----------");
        pedido1.exibirDetalhes();

        System.out.printf("Preço total: %.2f\n", pedido1.calcularTotal());


        System.out.println("---------- Cliente ----------");
        clientePF.exibirDetalhes();


        System.out.println("//////////////////////////////");

        
        System.out.println("---------- Produto 1 ----------");
        console.exibirDetalhes();


        System.out.println("---------- Produto 2 ----------");
        pcgamer.exibirDetalhes();


        System.out.println("---------- Produto 3 ----------");
        monitor.exibirDetalhes();


        System.out.println("---------- Dados do Pedido ----------");
        pedido2.exibirDetalhes();

        System.out.printf("Preço total: %.2f\n", pedido2.calcularTotal());


        System.out.println("---------- Cliente ----------");
        clientePJ.exibirDetalhes();

    }
}
