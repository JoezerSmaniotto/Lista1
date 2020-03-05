package br.edu.ifsul.control;

import br.edu.ifsul.model.Carro;
import br.edu.ifsul.model.Conta;
import br.edu.ifsul.model.Funcionario;
import br.edu.ifsul.model.Produto;

import java.util.*;
//import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

    // Tipo nome = objeto
    Carro carro1 = new Carro();
    carro1.setAnoFabricacao(2020);
    carro1.setModelo("Prisma");
    carro1.setMarca("GM");
    System.out.println("Carro1");
    System.out.println(carro1);

    Carro carro2 = new Carro("NISSAN","VERSA",2020);
    System.out.println("Carro2");
    System.out.println(carro2);

    carro1.setMarca("GM1");
    carro2.setMarca("NISSAN1");
    System.out.println(carro1);
    System.out.println(carro2);



    Produto produto1 = new Produto();
    produto1.setDescricao("Sal Marinho do Porto");
    produto1.setEstoque(20);
    produto1.setNome("Sal do Porto");
    produto1.setValor(2.4);
    produto1.setId(1);

    Produto produto2 = new Produto("Celular","smartphone Xiaomi mi 10",1000,30,2);
    System.out.println("Produto 1");
    System.out.println(produto1);
    System.out.println("Produto 2");
    System.out.println(produto2);

    produto1.setNome("Sal Grego");
    produto2.setNome("Xiaomi TOP");
    System.out.println(produto1);
    System.out.println(produto2);


    Funcionario funcionario1 = new Funcionario("Joezer",1000000.00);
    Funcionario funcionario2 = new Funcionario();

    funcionario2.setNome("Jonas");
    funcionario2.setSalario(990000.00);
    System.out.println("Funcionario 1");
    System.out.println(funcionario1);
    System.out.println("Funcionario 2");
    System.out.println(funcionario2);

    funcionario1.setNome("Joezer Smaniotto");
    funcionario2.setNome("Jonas Smaniotto");
    System.out.println(funcionario1 + "\n" + funcionario2 );



    Conta conta1 = new Conta(10000);
    System.out.println("Conta 1");
    System.out.println(conta1);

    conta1.deposita(200);
    System.out.println(conta1);

    conta1.saca(11000);
    System.out.println(conta1);

    conta1.atualiza(30);
    System.out.println(conta1);

    conta1.saca(4000);
    System.out.println(conta1);
    
    System.out.println(conta1.getSaldo());

    List<Produto> produtoList =new ArrayList<Produto>();

    Produto produto3 = new Produto("computador", "AVELL novo", 2.200, 30,3);
    produtoList.add(produto3);
    //Produto produto3 = new Produto("computador", "AVELL novo", 2.200, 30,3);
    Produto  produto5 = new Produto("creme dental", "Colgate", 3.00, 29,5) ;
    produtoList.add(produto5);
    Produto  produto4 = new Produto("Escova", "Oral-b", 3.5, 28,4) ;
    produtoList.add(produto4);
    Produto  produto7 = new Produto("fil dentral", "Oral-b", 5.5, 27,7);
    produtoList.add(produto7);
    Produto  produto6 = new Produto("Tenis", "Nike", 230.00, 26,6);
    produtoList.add(produto6);



    System.out.println("LIST");
    System.out.println(produtoList);

    // Metodos de pesquisa
    /*Metodos Antigo  ate a versão 8de forEach
      for(Produto prod : produtoList){
           if(prod.getId() == 3){
            System.out.println("Obj 2 de ID 3");
            System.out.println(prod);
            break;
        }
      }*/


    // FIltrar pelo id  Metodo NOVO
    produtoList.forEach(p->{
        if(p.getId() == 3){
            System.out.println("Obj 1 de ID 3");
            System.out.println(p);
            return; // Assim para o execução quando entra o id
        }
    });


    /* Filtrando pelo ID 3
    List<Produto> result = produtoList.stream()
    .filter(a -> Objects.equals(a.getId(),3))
    .collect(Collectors.toList());

     System.out.println("Filter Obj 3");
    System.out.println(result);;

    Collections.sort(produtoList);
    System.out.println(produtoList);
    */


    // Ordenação de LIST
    produtoList.sort(Comparator.comparingInt(Produto::getId).reversed()); // :: Opereador de resolução de escopo


    Collections.sort(produtoList, Comparator.comparing(Produto::getId)); // Ordena o LIST
    Collections.reverse(produtoList);  // Faço minha ordenação ficar em ordem decrescemte com o Reverse
    System.out.println(produtoList);





    System.out.println("MAP");
    Map<Integer,Produto> proutoMap = new HashMap<>();
    proutoMap.put(produto1.getId(), produto1);
    proutoMap.put(produto1.getId(), produto1    );
    proutoMap.put(produto5.getId(), produto5);
    proutoMap.put(produto3.getId(), produto3);
    proutoMap.put(produto6.getId(), produto6);

    System.out.println(proutoMap.get(3));






    }
}
