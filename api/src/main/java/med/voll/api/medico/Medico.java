package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;

@Table(name = "medicos")
@Entity(name = "Medicos") // Nome da entidade, representação da nossa classe para o JPA
@Getter // Cria os métodos GET automático (Lomboc)
@NoArgsConstructor //Cria o Construtor
@AllArgsConstructor //Cria o Construtor
@EqualsAndHashCode(of = "id") //
public class Medico {

    @Id // Mostrar que é um Id igual o que é feito no Banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;

    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING) // Essa anotação diz que é uma classe Enun do tipo String
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    // Construtor usado em MedicosController
    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.endereco = new Endereco(dados.endereco()) ;
        this.especialidade = dados.especialidade();
    }
}
