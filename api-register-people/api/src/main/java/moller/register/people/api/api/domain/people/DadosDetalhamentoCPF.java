package moller.register.people.api.api.domain.people;

public record DadosDetalhamentoCPF(String cpf) {
    public DadosDetalhamentoCPF(Pessoa pessoa){
        this(pessoa.getCpf());
    }
}
