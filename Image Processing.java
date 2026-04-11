// Interface
interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

// Abstract class for Image Processing
abstract class ImageProcessor implements Filterable {

    String currentFilter = "None";

    @Override
    public void apply_filter(String filter_type) {
        currentFilter = filter_type;
        System.out.println("Image filter applied: " + filter_type);
    }

    @Override
    public void reset_filter() {
        currentFilter = "None";
        System.out.println("Image filter reset to default.");
    }

    // Abstract method (specific behavior)
    abstract void processImage();
}

// Abstract class for Data Analysis
abstract class DataAnalyzer implements Filterable {

    String currentFilter = "None";

    @Override
    public void apply_filter(String filter_type) {
        currentFilter = filter_type;
        System.out.println("Data filter applied: " + filter_type);
    }

    @Override
    public void reset_filter() {
        currentFilter = "None";
        System.out.println("Data filter reset to default.");
    }

    // Abstract method (specific behavior)
    abstract void analyzeData();
}

// Concrete class for Image Processing
class PhotoEditor extends ImageProcessor {

    @Override
    void processImage() {
        System.out.println("Processing image with filter: " + currentFilter);
    }
}

// Concrete class for Data Analysis
class StatisticalTool extends DataAnalyzer {

    @Override
    void analyzeData() {
        System.out.println("Analyzing data using filter: " + currentFilter);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Image processing example
        PhotoEditor img = new PhotoEditor();
        img.apply_filter("Blur");
        img.processImage();
        img.reset_filter();

        System.out.println();

        // Data analysis example
        StatisticalTool data = new StatisticalTool();
        data.apply_filter("Normalize");
        data.analyzeData();
        data.reset_filter();
    }
}
