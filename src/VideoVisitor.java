public interface VideoVisitor {
    void visitVideoClip(VideoClip clip);
    void visitAudioTrack(AudioTrack track);
}
