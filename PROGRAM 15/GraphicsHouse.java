import java.awt.*;
import java.awt.event.*;

public class GraphicsHouse extends Canvas {
    private Color doorColor = Color.BLUE;

    // Constructor to add mouse listener
    public GraphicsHouse() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Only change color if the click is inside the door's area
                if (e.getX() >= 170 && e.getX() <= 230 && e.getY() >= 270 && e.getY() <= 350) {
                    doorColor = (doorColor == Color.BLUE) ? Color.RED : Color.BLUE;
                    repaint(); // Repaint the canvas to reflect the color change
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // Draw the house body (yellow rectangle)
        g.setColor(Color.YELLOW);
        g.fillRect(100, 200, 200, 150);

        // Draw the roof (red triangle)
        g.setColor(Color.RED);
        int[] xPoints = {80, 200, 320};
        int[] yPoints = {200, 100, 200};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw the door with dynamic color
        g.setColor(doorColor);
        g.fillRect(170, 270, 60, 80); // Door position and size
    }

    public static void main(String[] args) {
        // Create a Frame (window) to display the Canvas
        Frame frame = new Frame("House Drawing");
        GraphicsHouse canvas = new GraphicsHouse(); // Create the canvas
        frame.add(canvas); // Add the canvas to the frame
        frame.setSize(400, 400); // Set the size of the window
        frame.setVisible(true); // Make the window visible

        // Close the program when the window is closed
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

