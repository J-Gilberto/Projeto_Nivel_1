package Model;

import java.io.Serializable;

/*001*/
public class PessoaJuridica extends Pessoa implements Serializable {

    /* 002 */
    private String cnpj;

    /* 003 */
    public PessoaJuridica() {
        super();/* 003.1 */
    }

    /* 004 */
    public PessoaJuridica(int id, String nome, String cnpj) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    /* 005 */
    public void exibir() {
        super.exibir();/* 005.1 */
        System.out.println("Digite o seu CNPJ: " + cnpj);
    }

    /* 006 */
    public String getCnpj() {
        return cnpj;
    }

    /* 006 */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /*
     * 001° Informação importante, eu estou extendendo o arquivo 'Pessoa',
     * então caso eu não use o 'extends' e não aponte a arquivo (pensa como
     * um modulo do Python) não vai funcionar, prestar bastante atenção
     * pra não ficar quebrando cabeça a toa.
     * 
     * 002° Aqui seria o campo de entrada, onde declaro as propriedades do
     * ID e nome, se vão ou não ser String, int, long ou mesmo double.
     * 
     * 003° Constructur inicial
     * 003.1° Observação importante, o 'SUPER' seria uma superclasse e estou
     * puxando ela atraves do extends 'Pessoa' para o Constructur Composto,
     * que seria 'ID e Nome'
     * 
     * 004° Constructur composto, observe que o 'super' esta puxando a
     * informações do arquivo 'Pessoa' que seriam o 'ID e Nome', espero que
     * estas informações me ajude com o decorer do curso.
     * 
     * 005° Como vai ser apresentado pra o Usuario.
     * 005.1° lembrar que devo replicar estas mesmas informações nos demais
     * arquivos .java
     * 
     * 006° Getter: metodo que retorna seu valor.
     * 006° Setter: define ou atualiza.
     */

}
