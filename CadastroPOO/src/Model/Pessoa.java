package Model;

import java.io.Serializable;

/*Como é para criterio de estudos, vou por ao decorer de todo processo 
alguns comentarios e observações, pra no futuro compreender um pouco 
melhor este codigo que fiz. */

public class Pessoa implements Serializable {

    /* 001 */
    private int id;
    private String nome;

    /* 002 */
    public Pessoa() {
    }

    /* 003 */
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /* 004 */
    public void exibir() {
        System.out.println("Digite seu ID: " + id);
        System.out.println("Digite seu Nome: " + nome);
    }

    /* 005 */
    public int getId() {
        return id;
    }

    /* 005 */
    public void setId(int id) {
        this.id = id;
    }

    /* 005 */
    public String getNome() {
        return nome;
    }

    /* 005 */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
     * 001° Aqui seria o campo de entrada, onde declaro as propriedades do
     * ID e nome, se vão ou não ser String, int, long ou mesmo double.
     * 
     * 002° Constructur inicial
     * 
     * 003° Constructur composto
     * 
     * 004° Como vai ser apresentado pra o Usuario
     * 
     * 005° Get e Set
     */
}
