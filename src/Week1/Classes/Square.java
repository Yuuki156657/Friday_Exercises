package Week1.Classes;

public class Square {
    private int width;
    private int height;
    private String color;

    public Square(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

//    public Square(int side) {
//        this.color = "Black";
//        this.side = side;
//    }

    /* getter */
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    /* setter */
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*  */
    public void draw() {
        String paintColor = this.color.substring(0, 1);
        for(int row = 0; row < this.width; row++) {
            for(int col = 0; col < this.height; col++) {
                System.out.print(paintColor + " ");
            }
            System.out.println();
        }
    }
}
