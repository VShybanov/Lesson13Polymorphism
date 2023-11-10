public class Lesson13Polymorphism {
    public static void main(String[] args) {
        PopMusic popBand = new PopMusic();
        RockMusic rockBand = new RockMusic();
        ClassicMusic classicBand = new ClassicMusic();
        MusicStyles[] bands = new MusicStyles[3];
        bands[0] = popBand;
        bands[1] = rockBand;
        bands[2] = classicBand;
        for (MusicStyles ms: bands) {
            ms.playMusic();
        }
    }
}
