package ayds.ak5.spotisong.song.external;

public interface ExternalService {

  SpotifySong getSong(String query) throws Exception;
}
