public class DurationVisitor implements VideoVisitor {
    private int totalDuration = 0;

    @Override
    public void visitVideoClip(VideoClip clip) {
        totalDuration += clip.getDuration();
    }

    @Override
    public void visitAudioTrack(AudioTrack track) {
        totalDuration += track.getDuration();
    }

    public int getTotalDuration() {
        return totalDuration;
    }
}
