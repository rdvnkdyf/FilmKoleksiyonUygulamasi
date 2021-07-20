package ridvan.staj.MovieCollectionInternProject.util;

import java.sql.Date;

public class MovieFormWrapper {
	
	private String name;
	private Date date;
	private String category;
	private String description;
	private float rating;
	private String image;
	private String castRef;
    private String language;
    private String media;
	public MovieFormWrapper(String text) {
		this.castRef = text;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getCastRef() {
		return castRef;
	}
	public void setCastRef(String castRef) {
		this.castRef = castRef;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language=language;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media=media;
	}
	
}