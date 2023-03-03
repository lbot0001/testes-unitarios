package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LocacaoServiceTest {

    @Test
    public void teste() {

        //FIRST

        //cenario
        LocacaoService locacaoService = new LocacaoService();
        Usuario usuario = new Usuario("Luiz");
        Filme filme = new Filme("Jurassic Park", 1, 1.0);
        //acao
        Locacao locacao = locacaoService.alugarFilme(usuario, filme);
        //verificacao
        Assert.assertTrue(locacao.getValor() == 1);
        System.out.println(locacao.getValor());
        System.out.println(locacao.getDataLocacao());
        System.out.println(locacao.getDataRetorno());
    }
}
