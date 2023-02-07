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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
