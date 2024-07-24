package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

// Responsável por salvar as informações no banco de dados (Jpa precisa da Classe Médico e o tipo do Id Primário da Classe)
// Precisa da classe Médico, pois é nela que as informações seram salvadas
public interface MedicoRepository extends JpaRepository<Medico, Long> {



}
