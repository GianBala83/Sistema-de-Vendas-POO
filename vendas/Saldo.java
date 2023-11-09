package vendas;

import java.text.NumberFormat;
import java.util.Locale;

import funcao.FuncaoVenda;

public class Saldo {
    public void MostrarSaldo(){
        int idprimeiradata = 1;
        int idultimadata;
        String datap, datau;
        double valor;

        FuncaoVenda funcaovenda = new FuncaoVenda();

        idultimadata = funcaovenda.IndiceProduto() - 1;

        datap = funcaovenda.dataPorId(idprimeiradata);
        datau = funcaovenda.dataPorId(idultimadata);
        valor = funcaovenda.totalVendas();

        // Criando um objeto NumberFormat para o formato de moeda
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(Locale.getDefault());

        // Formatando o valor para o formato de moeda
        String valorFormatado = formatoMoeda.format(valor);

        System.out.println("Da data "+datap+" até a data "+datau+", total de vendas: "+valorFormatado);

    }
}
