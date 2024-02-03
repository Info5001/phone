package model;

public class Screen {
    private float size;
    private int resolutionWidth;
    private int resolutionHeight;
    private String technology;

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public int getResolutionWidth() {
        return resolutionWidth;
    }

    public void setResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    public int getResolutionHeight() {
        return resolutionHeight;
    }

    public void setResolutionHeight(int resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void screenInfo() {
        System.out.println("Screen size: " + size + " inches");
        System.out.println("Resolution: " + resolutionWidth + "x" + resolutionHeight);
        System.out.println("Technology: " + technology);
    }

}
