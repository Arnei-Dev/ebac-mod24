package br.com.mariodias.service;

import br.com.mariodias.dao.IContratoDao;

public class ContratoService implements IContratoService{
    private IContratoDao iContratoDao;
    public ContratoService(IContratoDao dao){
        this.iContratoDao = dao;
    }
    @Override
    public String salvar() {
        iContratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        iContratoDao.excluir();
        return "Arquivo excluído";
    }

    @Override
    public String atualizar() {
        iContratoDao.atualizar();
        return "Arquivo atualizado";
    }

    @Override
    public String buscar() {
        return "Busca concluída!";
    }
}
