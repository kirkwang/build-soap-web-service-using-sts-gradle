package get_movie_web_service;



import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {
    }

    public GetMovieRequest createGetMovieRequest() {
        return new GetMovieRequest();
    }

    public GetMovieResponse createGetMovieResponse() {
        return new GetMovieResponse();
    }

    public Movie createMovie() {
        return new Movie();
    }
}
