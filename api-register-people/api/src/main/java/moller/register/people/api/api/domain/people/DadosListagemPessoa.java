package moller.register.people.api.api.domain.people;

public record DadosListagemPessoa(Long id, String nome, String email, String cpf, String vip) {

    public DadosListagemPessoa(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getEmail(), pessoa.getCpf(), pessoa.getVip());

    }
}
