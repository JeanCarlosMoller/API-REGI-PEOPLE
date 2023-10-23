package moller.register.people.api.api.domain.people;

import moller.register.people.api.api.domain.people.Pessoa;

public record DadosDetalhamentoPessoa(Long id, String nome, String email, String telefone, String cpf, String vip) {
    public DadosDetalhamentoPessoa(Pessoa pessoa){

        this(pessoa.getId(), pessoa.getNome(), pessoa.getEmail(), pessoa.getTelefone(), pessoa.getCpf(), pessoa.getVip());
    }
}
