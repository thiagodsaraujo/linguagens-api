package br.com.github.thiagodsaraujo.linguagensapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collation = "linguagensDb.linguagem")
public class Linguagem {

    @Id
    @MongoId
    private String id;

    private String title;
    private String image;
    private int ranking;

    public Linguagem(){

    }

    public Linguagem(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int getRanking() {
        return ranking;
    }

    public String getId() {
        return id;
    }
}
