package PDF_Splitter;
import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

public class pdf_Splitter {
    public static void main(String[] args)
            throws IOException
    {
        File pdffile
                = new File("\"C:\\Users\\Akash Ghadage\\OneDrive\\Desktop\\Buffer Cache.pdf\"");
        PDDocument document = PDDocument.load(pdffile);
        Splitter splitting = new Splitter();
        List<PDDocument> Page = splitting.split(document);
        Iterator<PDDocument> iteration
                = Page.listIterator();
        int j = 1;
        while (iteration.hasNext()) {
            PDDocument pd = iteration.next();
            pd.save("C:/Desktop/Java/Generated/sample-"
                    + j++ + ".pdf");
        }
        System.out.println("Splitted Pdf Successfully.");
        document.close();
    }
}

