package ridvan.staj.MovieCollectionInternProject.repo;

import java.util.List;

import ridvan.staj.MovieCollectionInternProject.model.Movie;

public interface MovieRepo {
	List<Movie> findAll();
	Movie findById(Long id);
	List<Movie> findByName(String name);
	List<Movie> findByCategory(String category);
	List<Movie> findByActor(String actor);
	void create(Movie movie);
	Movie update(Movie movie);
	void delete(Long id);
}
