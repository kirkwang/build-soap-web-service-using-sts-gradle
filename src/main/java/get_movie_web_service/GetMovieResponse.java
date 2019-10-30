package get_movie_web_service;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//




import hello.Movie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"movie"}
)
@XmlRootElement(
        name = "getMovieResponse"
)
public class GetMovieResponse {
    @XmlElement(
            required = true
    )
    protected Movie movie;

    public GetMovieResponse() {
    }

    public Movie getMovie() {
        return this.movie;
    }

    public void setMovie(Movie value) {
        this.movie = value;
    }
}
