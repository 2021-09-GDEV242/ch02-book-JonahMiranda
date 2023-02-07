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
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean
    bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookCourseText;
    }
    /**
     * This method satifies the requirement of 2.92
     */
    public boolean isCourseText()
    {
    return courseText;
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
    /**
     * This method satisfies the requirement of 2.88 and 2.90
     */
    public void setRefNumber(String ref)
    {
    if(ref.length() >= 3)
    {
        refNumber = ref;
    }
    else
    {
        System.out.println("ERROR: Ref Number is less than 3"); 
    }
    }
    public String getRefNumber()
    {
    return refNumber;
    }
    
    public void borrow()
    {
    borrowed += 1;
    }
    
    public int getBorrowed()
    {
    return borrowed;
    }
    /**
     * These method satisfies the requirement of 2.87 and 2.91
     */
    public void printDetails()
    {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Pages: " + pages);
    System.out.println("Borrowed: " + borrowed + "x");
    if(refNumber.length() > 0)
        {
        System.out.println("Reference Number =" + refNumber);
        }
    else
        {
        System.out.println("Reference Number = ZZZ");
        }
    }
}
    /**
     * 2.86 - My objects are immutable. I know this because 
     * none of my methods can change any of the field 
     * variables 
     */
    
    
