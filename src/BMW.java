public class BMW extends Car{
    private String newSound;

    @Override
    public String getNewSound() {
        return newSound;
    }

    public void setNewSound(String newSound) {
        this.newSound = newSound;
    }
}
