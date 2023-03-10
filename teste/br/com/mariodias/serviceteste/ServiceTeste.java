package br.com.mariodias.serviceteste;

import br.com.mariodias.dao.ContratoDao;
import br.com.mariodias.dao.IContratoDao;
import br.com.mariodias.dao.MockDao;
import br.com.mariodias.service.ContratoService;
import br.com.mariodias.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ServiceTeste {
    @Test
    public void service(){
      //  IContratoDao dao = new ContratoDao();
        IContratoDao mock = new MockDao();
        IContratoService service = new ContratoService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void serviceErro(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    public void serviceBuscar(){
        IContratoDao dao = new MockDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Busca concluída!", retorno);
    }

    @Test
    public void serviceExcluir(){
        //  IContratoDao dao = new ContratoDao();
        IContratoDao mock = new MockDao();
        IContratoService service = new ContratoService(mock);
        String retorno = service.excluir();
        Assert.assertEquals("Arquivo excluído", retorno);
    }

    @Test
    public void serviceAtualizar(){
        //  IContratoDao dao = new ContratoDao();
        IContratoDao mock = new MockDao();
        IContratoService service = new ContratoService(mock);
        String retorno = service.atualizar();
        Assert.assertEquals("Arquivo atualizado", retorno);
    }
}
