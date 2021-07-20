package ridvan.staj.MovieCollectionInternProject.service;

import java.util.List;

import ridvan.staj.MovieCollectionInternProject.exception.MovieNotFoundException;
import ridvan.staj.MovieCollectionInternProject.model.Actor;
import ridvan.staj.MovieCollectionInternProject.model.Movie;
import ridvan.staj.MovieCollectionInternProject.model.User;

public interface AppService {
	List<Actor> findActors();
	List<Actor> findActorsByMovie(Movie movie);
	List<Movie> findMovies();
	List<Movie> findMoviesByName(String name);
	List<Movie> findMoviesByCategory(String category);
	List<Movie> findMoviesByActor(String actor);
	Movie findMovie(Long id) throws MovieNotFoundException;
	Actor findActor(Long id);
	void createMovie(Movie movie);
	void createActor(Actor actor);
	void update(Movie movie);
	void update(Actor actor);
	void deleteMovie(Long id);
	void deleteActor(Long actor_id);
	public void registerUser(User user);
}
