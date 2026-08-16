interface Camera {
    void clickPhoto();
}

interface Music {
    void playMusic();
}

class Mobile implements Camera, Music {

    public void clickPhoto() {
        System.out.println("Photo Clicked.");
    }

    public void playMusic() {
        System.out.println("Music Playing.");
    }
}

public class Q6_multiple_inheritance {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.clickPhoto();
        m.playMusic();
    }
}