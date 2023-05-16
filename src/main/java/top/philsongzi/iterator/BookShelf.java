package top.philsongzi.iterator;

import java.util.ArrayList;

/**
 * @author 小子松
 * @version 1.0
 * @description
 * @date 2023/5/11 16:03
 */
public class BookShelf implements Aggregate{

    // 用数组实现的，但是书籍达到max之后无法增加了
//    private Book[] books;
//    private int last = 0;
//    public BookShelf(int maxsize) {
//        this.books = new Book[maxsize];
//    }
//
//    public Book getBookAt(int index) {
//        return books[index];
//    }
//
//    public void appendBook(Book book) {
//        this.books[last] = book;
//        last++;
//    }
//
//    public int getLength() {
//        return last;
//    }
//    @Override
//    public Iterator iterator() {
//        return new BookShelfIterator(this);
//    }

    // 使用ArrayList实现
    private ArrayList books;
    public BookShelf(int initialsize) {
        this.books = new ArrayList(initialsize);
    }
    public Book getBookAt(int index) {
        return (Book) books.get(index);
    }
    public void appendBook(Book book) {
        books.add(book);
    }
    public int getLength() {
        return books.size();
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
