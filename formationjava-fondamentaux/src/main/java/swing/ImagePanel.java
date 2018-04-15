package swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

  Image img;

  public ImagePanel(){
      img=null;
  }
  public ImagePanel(String url) {
    this(new ImageIcon(url).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
        if (this.img!=null)this.setSize(this.img.getWidth(this),this.img.getHeight(this));
    }
  

  @Override
  public void paintComponent(Graphics g) {
    if (img!=null)g.drawImage(img, 0, 0, null);
  }

}