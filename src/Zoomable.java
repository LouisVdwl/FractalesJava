public interface Zoomable {
    public int height();
    public int width();
    public void zoom(Point center, double factor);
}
