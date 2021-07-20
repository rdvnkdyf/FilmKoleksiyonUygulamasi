package ridvan.staj.MovieCollectionInternProject.repo;

import java.util.List;

import ridvan.staj.MovieCollectionInternProject.model.Actor;
import ridvan.staj.MovieCollectionInternProject.model.Movie;
import ridvan.staj.MovieCollectionInternProject.model.User;

public interface ActorRepo {
	List<Actor> findActorsByMovie(Movie movie);
	List<Actor> findActors();
	Actor findActorById(Long id);
	void create(Actor actor);
	Actor update(Actor actor);
	void delete(Long actor_id);
	void registerUser(User user);
}
