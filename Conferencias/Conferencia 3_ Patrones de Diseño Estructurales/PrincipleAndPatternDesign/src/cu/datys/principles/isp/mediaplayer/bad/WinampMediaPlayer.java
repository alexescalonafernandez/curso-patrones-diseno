package cu.datys.principles.isp.mediaplayer.bad;

/**
 * Created by alexander.escalona on 25/01/2018.
 */
public class WinampMediaPlayer implements IMediaPlayer {
    @Override
    public void playAudio() {

    }

    @Override
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
