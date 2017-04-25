import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue()
  {
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
		pixelObj.setGreen(0);
      }
    }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(255-pixelObj.getRed());
			  pixelObj.setGreen(255-pixelObj.getGreen());
			  pixelObj.setBlue(255-pixelObj.getBlue());
		  }
	  }
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  int avg = (pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue()) / 3;
			  pixelObj.setRed(avg);
			  pixelObj.setGreen(avg);
			  pixelObj.setBlue(avg);
		  }
	  }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
	Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
	Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length /2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBottomToTop()
  {
	Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length /2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[pixels.length - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
   public void mirrorDiagonal()
  {
	Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel topPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels.length; col++)
      {
		leftPixel = pixels[row][col];
        topPixel = pixels[col][row];
        leftPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  //this one looks really cool
  public void mirrorOtherDiagonal()
  {
	Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel topPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels.length; col++)
      {
		leftPixel = pixels[row][col];
        topPixel = pixels[col][row];
        topPixel.setColor(leftPixel.getColor());
      }
    }   
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
		
		count++;
      }
    }
	System.out.println(count);
  }
  
  public void mirrorArms()
  {
    Pixel[][] pixels = this.getPixels2D();
	Pixel leftPixel = null;
    Pixel rightPixel = null;
	int width = pixels[0].length;
       
    for (int row = 160; row < 190; row++)
    {
      for (int col = 105; col < 169; col++)
      {
        if (pixels[row][col].getBlue() < 100)
		{
			leftPixel = pixels[row][col];      
			rightPixel = pixels[row][width - col];
			rightPixel.setColor(leftPixel.getColor());
		}
      }
    }
	
	for (int row = 172; row < 195; row++)
    {
      for (int col = 239; col < 293; col++)
      {
        if (pixels[row][col].getBlue() < 100)
		{
			leftPixel = pixels[row][col];      
			rightPixel = pixels[row][width - col];
			rightPixel.setColor(leftPixel.getColor());
		}
      }
    }
	
  }
  
  public void mirrorGull()
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 235; row < 320; row++)
    {
      for (int col = 245; col < 343; col++)
      {
		leftPixel = pixels[row][col];      
        rightPixel = pixels[row + 10][pixels[0].length + 100 - col];
        rightPixel.setColor(leftPixel.getColor());
		rightPixel.setRed(rightPixel.getRed() - 15);
		rightPixel.setGreen(rightPixel.getGreen() - 15);
		rightPixel.setBlue(rightPixel.getBlue() - 15);
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy1 (Picture fromPic, int fromStartRow, int fromEndRow, 
					int fromStartCol, int fromEndCol, int toStartRow, int toStartCol)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		
		for(int fromRow = fromStartRow, toRow = toStartRow; 
			fromRow < fromEndRow && toRow < toPixels.length; 
			fromRow++, toRow++)
		{
			for(int fromCol = fromStartCol, toCol = toStartCol; 
				fromCol < fromEndCol && toCol < toPixels[0].length;
				fromCol++, toCol++)	
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());	
			}
		}
	}

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void myCollage()
  {
	  Picture seagullOnlyBlue = new Picture("seagull.jpg");
	  seagullOnlyBlue.keepOnlyBlue();
	  this.copy1(seagullOnlyBlue, 235, 320, 245, 343, 200, 200);
	  Picture seagullNoBlue = new Picture("seagull.jpg");
	  seagullNoBlue.zeroBlue();
	  this.copy1(seagullNoBlue, 235, 320, 245, 343, 375, 500);
	  Picture negateSeagull = new Picture("seagull.jpg");
	  negateSeagull.negate();
	  this.copy1(negateSeagull, 235, 320, 245, 343, 260, 450);
	  this.mirrorHorizontalBottomToTop();
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
	Pixel topPixel = null;
	Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
	Color bottomColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
		topPixel = pixels[row][col];
		bottomPixel = pixels[row+1][col];
        rightColor = rightPixel.getColor();
		bottomColor = bottomPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist && topPixel.colorDistance(bottomColor) > edgeDist)
		{
			leftPixel.setColor(Color.BLACK);
			topPixel.setColor(Color.BLACK);			}
        else
		{
			leftPixel.setColor(Color.WHITE);
			topPixel.setColor(Color.WHITE);
		}
      }
    }
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  if(pixelObj.getBlue() > 155 && pixelObj.getRed() < 30)
			  {
				  pixelObj.setBlue(pixelObj.getBlue()+30);
			  }
		  }
	  }
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    //beach.explore();
    //beach.zeroBlue();
	//beach.keepOnlyBlue();
	//beach.negate();
	//beach.grayscale();
	//beach.mirrorVerticalRightToLeft();
	//beach.mirrorHorizontal();
	//beach.mirrorHorizontalBottomToTop();
	//beach.mirrorDiagonal();
	//beach.mirrorOtherDiagonal();
	beach.myCollage();
	beach.explore();
	
	Picture water = new Picture("water.jpg");
	//water.explore();
	// water.fixUnderwater();
	//water.copy1(beach, 0, 100, 0, 100, 200, 200);
	//water.explore();
	
	Picture temple = new Picture("temple.jpg");
	// temple.mirrorTemple();
	// temple.explore();
	
	Picture snowman = new Picture("snowman.jpg");
	// snowman.mirrorArms();
	// snowman.explore();
	
	Picture seagull = new Picture("seagull.jpg");
	// seagull.mirrorGull();
	// seagull.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
