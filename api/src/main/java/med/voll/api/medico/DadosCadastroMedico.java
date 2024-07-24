package med.voll.api.medico;

import jakarta.persistence.Embedded;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(


        @NotBlank(message = "NUL FILHO DA PUTA") // O ideal é colocar essa mensagem
        String nome,

        @NotBlank
                @Email
        String email,

        @NotBlank
                @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull
                @Valid // Validar também esse outro Objeto, ele vai à classe DadosEndereço e segue todas as anotações da classe, que são todos NotBlank
        DadosEndereco endereco) {
}
