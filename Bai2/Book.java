public class Book {
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookSummary;
    private String bookDetails;
    private short bookNumberPages;
    private String bookImages;
    private String bookNotes;
    public Book(int bookId, String bookTitle, String bookAuthor, String bookSummary, String bookDetails, short bookNumberPages, String bookImages, String bookNotes) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookSummary = bookSummary;
        this.bookDetails = bookDetails;
        this.bookNumberPages = bookNumberPages;
        this.bookImages = bookImages;
        this.bookNotes = bookNotes;
    }
    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public String getBookDetails() {
        return bookDetails;
    }

    public short getBookNumberPages() {
        return bookNumberPages;
    }

    public String getBookImages() {
        return bookImages;
    }

    public String getBookNotes() {
        return bookNotes;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }

    public void setBookDetails(String bookDetails) {
        this.bookDetails = bookDetails;
    }

    public void setBookNumberPages(short bookNumberPages) {
        this.bookNumberPages = bookNumberPages;
    }

    public void setBookImages(String bookImages) {
        this.bookImages = bookImages;
    }

    public void setBookNotes(String bookNotes) {
        this.bookNotes = bookNotes;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookNumberPages=" + bookNumberPages +
                '}';
    }
}
