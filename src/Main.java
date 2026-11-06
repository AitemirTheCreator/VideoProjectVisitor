public class Main {
    public static void main(String[] args) {
        VideoProject project = new VideoProject();

        project.addElement(new VideoClip("Intro", 30, 50));
        project.addElement(new VideoClip("Main Video", 120, 200));
        project.addElement(new AudioTrack("Background Music", 150, 15));
        project.addElement(new AudioTrack("Sound Effects", 20, 5));

        DurationVisitor durationVisitor = new DurationVisitor();
        project.accept(durationVisitor);

        FileSizeVisitor fileSizeVisitor = new FileSizeVisitor();
        project.accept(fileSizeVisitor);

        System.out.println("Video Project Report");
        System.out.println("--------------------");
        System.out.println("Total Duration: " +
                durationVisitor.getTotalDuration() + " seconds");
        System.out.println("Total File Size: " +
                fileSizeVisitor.getTotalFileSize() + " MB");
    }
}
