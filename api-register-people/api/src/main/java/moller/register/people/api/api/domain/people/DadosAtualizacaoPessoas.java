package moller.register.people.api.api.domain.people;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPessoas(

        @NotNull
        Long id,

        String nome,
        String telefone,
        String email,
        String vip) {
}
