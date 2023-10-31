package moller.register.people.api.api.domain.people;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {
    Page<Pessoa> findAllByAtivoTrue(Pageable paginacao);

    @Query("SELECT p.ativo FROM Pessoa p WHERE p.id = :id")
    Boolean findAtivoById(Long id);

    Optional<Pessoa> findByCpf(String cpf);

    @Query("SELECT p FROM Pessoa p WHERE p.cpf = :cpf")
    Optional<Pessoa> findByCpfUrl(@Param("cpf") String cpf);
}