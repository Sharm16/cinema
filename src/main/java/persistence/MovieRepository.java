package persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import persistence.domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{


}
