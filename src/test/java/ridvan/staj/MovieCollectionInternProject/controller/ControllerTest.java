package ridvan.staj.MovieCollectionInternProject.controller;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ridvan.staj.MovieCollectionInternProject.model.Actor;
import ridvan.staj.MovieCollectionInternProject.model.Movie;
import ridvan.staj.MovieCollectionInternProject.service.AppService;

@ExtendWith(SpringExtension.class)
@SpringBootTest(properties= {"spring.profiles.active=dev"})
public class ControllerTest {	
	
	@Autowired
	private AppService appService;
	
	@Test
	public void testFindMovies() {
		// Veritabanında başlangıçta 10 adet film girişi bulunmaktadır. Bu test bunu sağlamak içindir.
		List<Movie> movies = appService.findMovies();
		MatcherAssert.assertThat(movies.size(), Matchers.equalTo(10));
	}
	
	@Test
	public void testFindMovieById() {
	    // Kimliği 1 olan film Esaretin Bedeli'dir, bu test bunu sağlamak içindir.
		Movie movie = appService.findMovie(1L);
		MatcherAssert.assertThat(movie.getName(), Matchers.equalTo("The Shawshank Redemption"));
	}
	
	@Test
	public void testCreateAndUpdateMovie() {
		// Bu test, film oluşturmada, veritabanına eklemede herhangi bir sorun olmadığından emin olur,
		// Bir aktör oluşturma, veritabanına ekleme,
		// Aktörün filmin oyuncu kadrosu olarak ayarlanması ve movie_stars veritabanının güncellenmesi.
		Movie movie = new Movie();
		movie.setName("Test-0001");
		movie.setCategory(null);
		movie.setDate(null);
		movie.setDescription(null);
		movie.setRating(5.0f);
		appService.createMovie(movie);
		MatcherAssert.assertThat(appService.findMoviesByName("Test-0001").get(0).getName(), Matchers.equalTo("Test-0001"));
		
		Actor actor = new Actor();
		actor.setActor_name("Ridvan Kadayifçi");
		appService.createActor(actor);
		MatcherAssert.assertThat(appService.findActor(actor.getActor_id()).getActor_name(), Matchers.equalTo(actor.getActor_name()));
		
		movie.addActor(actor);
		actor.addMovie(movie);
		
		appService.update(actor);
		appService.update(movie);
		MatcherAssert.assertThat(appService.findActorsByMovie(movie).size(), Matchers.equalTo(1));
		
		appService.deleteMovie(movie.getId());
		appService.deleteActor(actor.getActor_id());
	}
}
