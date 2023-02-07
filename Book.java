/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Jonah Miranda
 * @version February 7, 2023
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }

    /**
     * These methods satisfy the requirement of 2.83
     */
    public String getAuthor()
    {   
    return author;
    }
    
    public String getTitle()
    {
    return title;
    }
    
    /**
     * This method satifies the requirement for 2.85
     */
    public int getPages()
    {
    return pages;
    }
    
    /**
     * These methods satisfy the requirement of 2.84
     */
    public void printAuthor()
    {
    System.out.println(author);
    }
    
    public void printTitle()
    {
    System.out.println(title);
    }
}

/**
 * 2.86 - My objects are immutable. I know this because 
 * none of my methods can change any of the field 
 * variables 
 */
