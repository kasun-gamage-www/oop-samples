/*
    This File Contains variations of the infamous star drawing exercise

    References
    http://stackoverflow.com/questions/11409621/creating-a-triangle-with-for-loops
 */

class Stars {

    public static void main(String[] args) {
        Stars myStarDrawer = new Stars();

        myStarDrawer.drawSpacedTriangle();
    }

    private void drawGrid() {
        for (int outer = 0; outer < 3; outer++) { //Specifies Height
            for (int inner = 0; inner < 5; inner++) { //Specifies Width
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private void drawGrid(int height, int width) {
        for (int outer = 0; outer < height; outer++) {
            for (int inner = 0; inner < width; inner++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private void drawGrid(int width, int height, int spacing) {
        for (int outer = 0; outer < height; outer++) {
            for (int inner = 0; inner < width; inner++) {
                if (inner % spacing == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    private void drawSimpleTriangle() {
        for (int i = 1; i < 10; i += 2) {
            for (int k = 0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private void drawSimpleTriangle(int height) {
        for (int i = 1; i < 10; i += 2) {
            for (int k = 0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private void drawSpacedTriangle() {
        for (int i = 1; i < 10; i += 2) {
            for (int k = 0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    private void drawStars() {
        for (int outer = 0; outer < 3; outer++) { //Specifies Height
            for (int inner = 0; inner < 5; inner++) { //Specifies Width
                if (inner % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\t Stars : " + (outer + 1) + " Spaces : " + (5 - outer - 1) + "\n");
        }
    }

}
