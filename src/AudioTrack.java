public class AudioTrack implements VideoElement {
    private String name;
    private int duration;
    private int fileSize;

    public AudioTrack(String name, int duration, int fileSize) {
        this.name = name;
        this.duration = duration;
        this.fileSize = fileSize;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getFileSize() {
        return fileSize;
    }

    @Override
    public void accept(VideoVisitor visitor) {
        visitor.visitAudioTrack(this);
    }
}
