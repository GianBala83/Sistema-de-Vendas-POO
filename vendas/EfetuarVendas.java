package vendas;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import funcao.FuncaoCliente;
import funcao.FuncaoEstoque;
import funcao.FuncaoProduto;
import funcao.FuncaoVenda;
import modelo.Estoque;
import modelo.Produto;
import modelo.Venda;
import visao.listar.ListarClientes;
import visao.listar.ListarEstoque;

public class EfetuarVendas {

    public void TelaVendas(Scanner sc){     

        int id_venda, id_cliente, id_estoque, quantidade;
        double unitario, total;

        ListarClientes lc = new ListarClientes();
        ListarEstoque le = new ListarEstoque();

        FuncaoVenda fv = new FuncaoVenda();
        FuncaoCliente fc = new FuncaoCliente();
        FuncaoEstoque fe = new FuncaoEstoque();
        FuncaoProduto fp = new FuncaoProduto();
        Produto p = new Produto();
        Estoque es = new Estoque();

        try {
           
            id_venda = fv.IndiceProduto();

            lc.ListaClientes();
            System.out.print("Digite o ID do cliente: ");
            id_cliente = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha pendente

            if(!fc.EncontrarId(id_cliente)){
                System.out.println("Cliente não encontrado");
            }else{
                le.Listar();
                System.out.print("Digite o ID do estoque: ");
                id_estoque = sc.nextInt();
                sc.nextLine(); // Consumir a nova linha pendente

                if(fe.EncontrarId(id_estoque)==-1){
                    System.out.println("Estoque não encontrado");
                }else{
                    System.out.println("Digite a quantidade");
                    quantidade = sc.nextInt();

                    if(quantidade>fe.QuantidadeProduto(id_estoque)){
                        System.out.println("Quantidade excedida");
                    }else{
                        // Obtendo a data atual do sistema
                        Date dataAtual = new Date();

                        // Criando um objeto de calendário e configurando-o com a data atual
                        Calendar calendario = Calendar.getInstance();
                        calendario.setTime(dataAtual);

                        // Obtendo o ano, mês e dia da data atual
                        int ano = calendario.get(Calendar.YEAR);
                        int mes = calendario.get(Calendar.MONTH) + 1; // Note que os meses começam de 0
                        int dia = calendario.get(Calendar.DAY_OF_MONTH);

                        String nomecliente, nomeproduto, hoje;
                        hoje = dia + "/" + mes + "/" + ano;

                        nomecliente = fc.nomeCliente(id_cliente);

                        int idproduto = fe.idProduto(id_estoque);
                        p = fp.InfoProduto(idproduto);

                        nomeproduto = p.getNome();
                        unitario = p.getValor();

                        total = unitario*quantidade;

                        Venda v = new Venda();
                        //preenchendo o objeto v
                        v.setIdVenda(id_venda);
                        v.setNomeCliente(nomecliente);
                        v.setNomeProduto(nomeproduto);
                        v.setQuantidade(quantidade);
                        v.setValorUnitario(unitario);
                        v.setValorTotal(total);
                        v.setData(hoje);

                        es.setIdEstoque(id_estoque);
                        quantidade = fe.QuantidadeProduto(id_estoque) - quantidade;
                        es.setQuantidade(quantidade);
                        fe.Alterar(es);

                        if(fv.Vender(v)){
                            System.out.println("Vendido");
                        }else{
                            System.out.println("Algo deu errado");
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
