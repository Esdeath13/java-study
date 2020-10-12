import java.math.BigDecimal;
import java.util.Date;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName Arr
 * @Description TODO
 * @Author YWT
 * @Date 2020/10/5 16:41
 **/

@Data
@NoArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode()
public class Book {
    private String bookName;
    private String isbn;
    private String author;
    private BigDecimal price;
    private Date publishedDate;

    /**
     * @Description 构造函数
     * @param bookName 书名
     * @param isbn
     * @param author
     * @param price
     * @param publishedDate
     */
    public Book(String bookName, String isbn, String author, BigDecimal price, Date publishedDate) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.price = price;
        this.publishedDate = publishedDate;
    }

    /**
     * @return 返回书名
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName Book
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.bookName);
        return sb.toString();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}