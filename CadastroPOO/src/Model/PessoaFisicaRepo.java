package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaRepo implements Serializable {

    private List<PessoaFisica> listaPessoaFisicas;

    public PessoaFisicaRepo() {
        listaPessoaFisicas = new ArrayList<>();
    }

    public void inserir(PessoaFisica pessoaFisica) {
        listaPessoaFisicas.add(pessoaFisica);
    }

}
