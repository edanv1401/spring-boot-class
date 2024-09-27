package villarraga.gil.gama.programacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import villarraga.gil.gama.programacion.entities.Question;

@Repository
public interface IQuestionRepository extends JpaRepository<Question, Long> {
}
