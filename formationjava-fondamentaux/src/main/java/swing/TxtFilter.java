/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package swing;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Olivier Andrade - Aplose
 */
public class TxtFilter extends FileFilter{

    @Override
    public boolean accept(File f) {
        return f.isDirectory() || f.getAbsolutePath().endsWith(".txt");
    }

    @Override
    public String getDescription() {
        return "Fichiers textes (*.txt)";
    }

}
