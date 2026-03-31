class FileExtensionExtractor {
    public static void main(String[] args) {
        String fileName = "report.pdf";

        int index = fileName.lastIndexOf('.');

        if (index != -1 && index != fileName.length() - 1) {
            String extension = fileName.substring(index + 1);
            System.out.println("File Extension: " + extension);
        } else {
            System.out.println("No valid file extension found.");
        }
    }
}