package test.java;

import de.embl.cba.metaimage_io.MetaImage_Writer;
import ij.IJ;
import ij.ImagePlus;

public class TestWrite {
    public static void main( String[] args )
    {
        ImagePlus imp = IJ.openImage("http://imagej.nih.gov/ij/images/mri-stack.zip");

        MetaImage_Writer writer = new MetaImage_Writer();
        String directory = "C:\\Users\\meechan\\Documents\\temp\\";
        String filenameWithExtension = "test.mhd";
        writer.save( imp, directory, filenameWithExtension );
    }
}
