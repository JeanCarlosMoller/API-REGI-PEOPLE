package moller.register.people.api.api.domain.people;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPessoa(

    @NotBlank(message = "Nome é obrigatório")
    String nome,

    @NotBlank(message = "E-mail é obrigatório")
    @Email(message = "Formato do e-mail é inválido")
    String email,

    @NotBlank(message = "Telefone é obrigatório")
    String telefone,

    @NotBlank(message = "CPF é obrigatório")
    @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}", message = "Formato do CRM é inválido")
    String cpf,

    @NotBlank(message = "VIP é obrigatório")
    String vip){
}
