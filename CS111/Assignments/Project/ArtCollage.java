/*************************************************************************
 *  Compilation:  javac ArtCollage.java
 *  Execution:    java ArtCollage
 *
 *  @author: Andrew Haddad andrew.gh@rutgers.edu 179009180
 *
 *************************************************************************/

import java.awt.Color;

public class ArtCollage {

    // The orginal picture
    private Picture original;

    // The collage picture
    private Picture collage;

    // The collage Picture consists of collageDimension X collageDimension tiles
    private int collageDimension;

    // A tile consists of tileDimension X tileDimension pixels
    private int tileDimension;
    
    /*
     * One-argument Constructor
     * 1. set default values of collageDimension to 4 and tileDimension to 100
     * 2. initializes original with the filename image
     * 3. initializes collage as a Picture of tileDimension*collageDimension x tileDimension*collageDimension, 
     *    where each pixel is black (see all constructors for the Picture class).
     * 4. update collage to be a scaled version of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public ArtCollage (String filename) {

	// WRITE YOUR CODE HERE
        this.collageDimension= 4;
        this.tileDimension=100;
        int w= tileDimension*collageDimension;
        int h= tileDimension*collageDimension;
        this.original= new Picture(filename);
        this.collage= new Picture(w, h);

        for (int tcol = 0; tcol < w; tcol++) {
            for (int trow = 0; trow < h; trow++) {
                int scol = tcol * original.width() / w;
                int srow = trow * original.height() / h;
                Color color = original.get(scol, srow);
                collage.set(tcol, trow, color);
            }
        }
    }


    /*
     * Three-arguments Constructor
     * 1. set default values of collageDimension to cd and tileDimension to td
     * 2. initializes original with the filename image
     * 3. initializes collage as a Picture of tileDimension*collageDimension x tileDimension*collageDimension, 
     *    where each pixel is black (see all constructors for the Picture class).
     * 4. update collage to be a scaled version of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public ArtCollage (String filename, int td, int cd) {

	// WRITE YOUR CODE HERE
        this.collageDimension= cd;
        this.tileDimension=td;
        int w= tileDimension*collageDimension;
        int h= tileDimension*collageDimension;
        this.original= new Picture(filename);
        this.collage= new Picture(w, h);

        for (int tcol = 0; tcol < w; tcol++) {
            for (int trow = 0; trow < h; trow++) {
                int scol = tcol * original.width() / w;
                int srow = trow * original.height() / h;
                Color color = original.get(scol, srow);
                collage.set(tcol, trow, color);
            }
        }
    }
        

    /*
     * Returns the collageDimension instance variable
     *
     * @return collageDimension
     */
    public int getCollageDimension() {

	// WRITE YOUR CODE HERE
        return collageDimension;
    }

    /*
     * Returns the tileDimension instance variable
     *
     * @return tileDimension
     */
    public int getTileDimension() {

	// WRITE YOUR CODE HERE
        return tileDimension;
    }

    /*
     * Returns original instance variable
     *
     * @return original
     */
    public Picture getOriginalPicture() {

	// WRITE YOUR CODE HERE
        return original;
    }

    /*
     * Returns collage instance variable
     *
     * @return collage
     */
    public Picture getCollagePicture() {

	// WRITE YOUR CODE HERE
        return collage;
    }
    
    /*
     * Display the original image
     * Assumes that original has been initialized
     */
    public void showOriginalPicture() {

	// WRITE YOUR CODE HERE
        original.show();
    }

    /*
     * Display the collage image
     * Assumes that collage has been initialized
     */
    public void showCollagePicture() {

	// WRITE YOUR CODE HERE
        collage.show();


    }

    /*
     * Replaces the tile at collageCol,collageRow with the image from filename
     * Tile (0,0) is the upper leftmost tile
     *
     * @param filename image to replace tile
     * @param collageCol tile column
     * @param collageRow tile row
     */
    
    public void replaceTile (String filename,  int collageCol, int collageRow) {

	// WRITE YOUR CODE HERE
        Picture replacement = new Picture (filename);

        int h= tileDimension;
        int w= tileDimension;

        for (int tcol = (tileDimension* collageCol); tcol < tileDimension + (tileDimension * collageCol); tcol++) {
            for (int trow = (tileDimension* collageRow); trow < tileDimension + (tileDimension * collageRow); trow++) {
                int scol = ((tcol - collageCol * tileDimension) * replacement.width()) / w;
                int srow = ((trow - collageRow * tileDimension) * replacement.height()) / h;
                Color color = replacement.get(scol, srow);
                collage.setRGB(tcol,trow, replacement.getRGB(scol, srow));

            }
        } 
    }
    
    /*
     * Makes a collage of tiles from original Picture
     * original will have collageDimension x collageDimension tiles, each tile
     * has tileDimension X tileDimension pixels
     */
    public void makeCollage () {

	// WRITE YOUR CODE HERE
    int h= original.height();
    int w= original.width();

    Picture temp = new Picture (tileDimension, tileDimension);

    for (int tcol = 0; tcol < tileDimension; tcol++) {
        for (int trow = 0; trow < tileDimension; trow++) {
            int scol = tcol * w / tileDimension;
            int srow = trow * h / tileDimension;
            Color color = original.get(scol, srow);
            temp.set(tcol, trow, color);
        }
    }

    h= temp.height();
    w= temp.width();

    for (int col=0; col < w; col++) {
        for (int row=0; row < h; row++) {
            Color collageColor= temp.get(col, row);
            for (int i=0; i < collageDimension; i++) {
                for (int j=0; j < collageDimension; j++) {
                    collage.set(w*j + col, h*i + row, collageColor);

                }
            }
        }
    }
    }

    /*
     * Colorizes the tile at (collageCol, collageRow) with component 
     * (see Week 9 slides, the code for color separation is at the 
     *  book's website)
     *
     * @param component is either red, blue or green
     * @param collageCol tile column
     * @param collageRow tile row
     */

    public void colorizeTile (String component,  int collageCol, int collageRow) {

	// WRITE YOUR CODE HERE

    for (int col= (tileDimension* collageCol); col < tileDimension + (tileDimension * collageCol); col++) {
        for (int row= (tileDimension* collageRow); row < tileDimension + (tileDimension * collageRow); row++) {
            Color color = collage.get(col, row);
            if (component == "red") {
                int red= color.getRed();
                Color color2 = new Color(red,0, 0);
                collage.set(col,row, color2);
            } else if (component == "blue") {
                int blue= color.getBlue();
                Color color2 = new Color(0,0, blue);
                collage.set(col,row, color2);

            } else if (component == "green") {
                int green= color.getGreen();
                Color color2 = new Color(0,green, 0);
                collage.set(col,row, color2);
            }
        }
    }     
    // component= component.toLowerCase();
    // int h= original.height();
    // int w= original.width();

    // for (int tcol = 0; tcol < tileDimension; tcol++) {
    //     for (int trow = 0; trow < tileDimension; trow++) {
    //         for (int col= (tileDimension* collageCol); col < tileDimension + (tileDimension * collageCol); col++) {
    //             for (int row= (tileDimension* collageRow); row < tileDimension + (tileDimension * collageRow); row++) {
    //                 int scol = tcol * original.width() / tileDimension;
    //                 int srow = trow * original.height() / tileDimension;
    //                 Color color = original.get(scol, srow);
    //                 if (component == "red") {
    //                     int red= color.getRed();
    //                     Color color2 = Luminance.toGray(color);
    //                     collage.set(col,row, color2);

    //                 }
    //                 if (component == "green") {
    //                     int green= color.getGreen();
    //                     color = new Color(0,green, 0);
    //                     collage.set(col,row, color);

    //                 }
    //                 if (component == "blue") {
    //                     int blue= color.getBlue();
    //                     color = new Color(0, 0,blue);
    //                     collage.set(col,row, color);

    //                 }
    //             }
    //         }      
    //     }
    // }
    }

    /*
     * Greyscale tile at (collageCol, collageRow)
     * (see Week 9 slides, the code for luminance is at the book's website)
     *
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void greyscaleTile (int collageCol, int collageRow) {

	// WRITE YOUR CODE HERE
    for (int col= (tileDimension* collageCol); col < tileDimension + (tileDimension * collageCol); col++) {
        for (int row= (tileDimension* collageRow); row < tileDimension + (tileDimension * collageRow); row++) {
            Color color = collage.get(col, row);
            Color color2 = Luminance.toGray(color);
            collage.set(col,row, color2);
        }
    }      
    }


    // Test client 
    public static void main (String[] args) {

        String filename= "Ariel.jpg";
        ArtCollage p= new ArtCollage(filename);
        p.makeCollage();
        filename="Flo.jpg";
        p.replaceTile(filename,2,3);
        String component= "blue";
        p.colorizeTile(component, 1,1);
        p.greyscaleTile(3,1);
        p.showCollagePicture();

    }
}
