package moller.register.people.api.api.domain.people;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {
    Page<Pessoa> findAllByAtivoTrue(Pageable paginacao);

    @Query("""
            select p.ativo
            from Pessoa p
            where
            p.id = :id
            """)
    Boolean findAtivoById(Long id);

}