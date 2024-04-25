package Model;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class PessoaFisicaRepo implements Serializable {

    private List<PessoaFisica> listaPessoaFisicas;

    public PessoaFisicaRepo() {
        listaPessoaFisicas = new ArrayList<>();
    }

    public void inserir(PessoaFisica pessoaFisica) {
        listaPessoaFisicas.add(pessoaFisica);
    }

    public void alterar(PessoaFisica pessoaFisica) {
        for (int lFisica = 0; lFisica < listaPessoaFisicas.size(); lFisica++) {
            PessoaFisica pFisica = listaPessoaFisicas.get(lFisica);
            if (pFisica.getId() == pessoaFisica.getId()) {
                listaPessoaFisicas.set(lFisica, pessoaFisica);
                break;
            }
        }
    }

    public void excluir(int id) {
        for (int lFisica = 0; lFisica < listaPessoaFisicas.size(); lFisica++) {
            PessoaFisica pFisica = listaPessoaFisicas.get(lFisica);
            if (pFisica.getId() == id) {
                listaPessoaFisicas.remove(lFisica);
                break;
            }
        }
    }

    public PessoaFisica obter(int id) {
        for (PessoaFisica pFisica : listaPessoaFisicas) {
            if (pFisica.getId() == id) {
                return pFisica;
            }
        }
        return null;
    }

    public List<PessoaFisica> obterTodos() {
        return listaPessoaFisicas;
    }

    public void persistir(String arquivoNome) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivoNome))) {
            outputStream.writeObject(listaPessoaFisicas);
        }
    }

    @SuppressWarnings("unchecked")
    public void recuperar(String arquivoNome) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivoNome))) {
            listaPessoaFisicas = (List<PessoaFisica>) inputStream.readObject();
        }
    }
}
