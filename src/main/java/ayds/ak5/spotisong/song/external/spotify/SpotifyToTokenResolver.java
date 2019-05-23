package ayds.ak5.spotisong.song.external.spotify;

public interface SpotifyToTokenResolver {

  String getTokenFromExternalData(String serviceData) throws Exception;
}

