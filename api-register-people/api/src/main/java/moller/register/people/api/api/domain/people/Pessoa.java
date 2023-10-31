package moller.register.people.api.api.domain.people;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.aspectj.apache.bcel.Repository;
import org.hibernate.ObjectNotFoundException;
import java.util.Optional;

@Table(name = "pessoas")
@Entity(name = "Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String vip;
    private Boolean ativo;

    public Pessoa(DadosCadastroPessoa dadosPessoa){
        this.ativo = true;
        this.nome = dadosPessoa.nome();
        this.email = dadosPessoa.email();
        this.telefone = dadosPessoa.telefone();
        this.cpf = dadosPessoa.cpf();
        this.vip = dadosPessoa.vip();
    }

    public void atualizarInformacoes(DadosAtualizacaoPessoas dados){
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.email() != null){
            this.email = dados.email();
        }
        if(dados.vip() != null){
            this.vip = dados.vip();
        }

    }

    public void excluir() {

        this.ativo = false;
    }
}
