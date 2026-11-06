public class FileSizeVisitor implements VideoVisitor {
    private int totalFileSize = 0;

    @Override
    public void visitVideoClip(VideoClip clip) {
        totalFileSize += clip.getFileSize();
    }

    @Override
    public void visitAudioTrack(AudioTrack track) {
        totalFileSize += track.getFileSize();
    }

    public int getTotalFileSize() {
        return totalFileSize;
    }
}
