package com.alphas.movies.types;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movieslist")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {
    private ObjectId id;
    private String title;
    private String imdbId;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    @DocumentReference
    private List<Reviews> reviewsIds;
}
