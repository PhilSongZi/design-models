package top.philsongzi.iterator;

/**
 * @author 小子松
 * @version 1.0
 * @description
 * @date 2023/5/11 16:10
 */
public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
