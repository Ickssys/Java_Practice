import java.awt.*;

public class CafeWall {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(650, 400);
        Graphics2D g = panel.getGraphics();

        panel.setBackground(Color.GRAY);
        row(g, 0, 0, 4, 20);
        row(g, 50, 70, 5, 30);
        grid(g, 10,150,25, 0, 8,4);
        grid(g, 250,200,25, 10, 6,3);
        grid(g, 425,180,20, 10, 10,5);
        grid(g, 400,20,35, 35, 4,2);

    }
    public static void grid(Graphics2D g, int x, int y, int size, int offset, int oL, int iL){
        for(int i = 0; i < oL; i++){
            row(g, x + (i % 2 * offset), (size + 2) * i + y, iL, size);
        }

    }
    public static void row(Graphics2D g, int x, int y, int n, int size){
        for(int i = 0; i < n; i++){
            blackSquare(g, size * 2 * i + x, y, size);
            whiteSquare(g, size * 2 * i + (x + size), y, size);
        }
    }
    public static void blackSquare(Graphics2D g, int x, int y ,int size) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, size, size);

        g.setColor(Color.BLUE);
        g.drawLine(x, y, x + size, y + size);
        g.drawLine(x + size, y, x, y + size);
    }
    public static void whiteSquare(Graphics2D g, int x, int y, int size){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, size, size);
    }

}
