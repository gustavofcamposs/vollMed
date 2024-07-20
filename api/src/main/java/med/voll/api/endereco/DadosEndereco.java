package med.voll.api.endereco;

//Record pois ele já cria os métodos get e Construtores, preciso apenas instanciar a classe e chamar pelo nome DadosCadastroMedico.bairro
public record DadosEndereco(String logadouro, String bairro, String cep, String cidade, String uf, String complemento, String numero) {


}