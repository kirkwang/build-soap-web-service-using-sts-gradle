package get_movie_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "movie",
        propOrder = {"name", "genra", "director", "year", "country"}
)
public class Movie {
    @XmlElement(
            required = true
    )
    protected String name;
    @XmlElement(
            required = true
    )
    protected String genra;
    @XmlElement(
            required = true
    )
    protected String director;
    protected int year;
    @XmlElement(
            required = true
    )
    protected String country;

    public Movie() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getGenra() {
        return this.genra;
    }

    public void setGenra(String value) {
        this.genra = value;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String value) {
        this.director = value;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int value) {
        this.year = value;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String value) {
        this.country = value;
    }
}
