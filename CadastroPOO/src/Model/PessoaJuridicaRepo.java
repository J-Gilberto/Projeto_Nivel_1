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
        for (int lJuridica = 0; lJuridica < listaPessoaJuridicas.size(); lJuridica++) {
            PessoaJuridica pJuridica = listaPessoaJuridicas.get(lJuridica);
            if (pJuridica.getId() == id) {
                listaPessoaJuridicas.remove(lJuridica);
                break;
            }
        }
    }

    public PessoaJuridica obter(int id) {
        for (PessoaJuridica pJuridica : listaPessoaJuridicas) {
            if (pJuridica.getId() == id) {
                return pJuridica;
            }
        }
        return null;
    }

    public List<PessoaJuridica> obterTodos() {
        return listaPessoaJuridicas;
    }

    public void persistir(String arquivoNome) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivoNome))) {
            outputStream.writeObject(listaPessoaJuridicas);
        }
    }

    @SuppressWarnings("unchecked")
    public void recuperar(String arquivoNome) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivoNome))) {
            listaPessoaJuridicas = (List<PessoaJuridica>) inputStream.readObject();
        }
    }
}
