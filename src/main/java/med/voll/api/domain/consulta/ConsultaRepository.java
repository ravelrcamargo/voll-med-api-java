package med.voll.api.domain.consulta;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    boolean existsByMedicoIdAndData(Long idMedico, LocalDateTime time);

    boolean existsByPacienteIdAndDataBetween( Long idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);
}
