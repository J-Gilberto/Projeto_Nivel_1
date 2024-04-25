package Model;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class PessoaJuridicaRepo implements Serializable {
    private List<PessoaJuridica> listaPessoaJuridicas;

    public PessoaJuridicaRepo() {
        listaPessoaJuridicas = new ArrayList<>();
    }

    public void inserir(PessoaJuridica pessoaJuridica) {
        listaPessoaJuridicas.add(pessoaJuridica);
    }

    public void alterar(PessoaJuridica pessoaJuridica) {
        for (int lJuridica = 0; lJuridica < listaPessoaJuridicas.size(); lJuridica++) {
            PessoaJuridica pJuridica = listaPessoaJuridicas.get(lJuridica);
            if (pJuridica.getId() == pessoaJuridica.getId()) {
                listaPessoaJuridicas.set(lJuridica, pJuridica);
                break;
            }
        }
    }

    public void excluir(int id) {

    }

}
