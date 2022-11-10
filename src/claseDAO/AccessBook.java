package claseDAO;

import claseDAO.dao.BookDao;
import claseDAO.daoimpl.BookDaoImpl;
import claseDAO.model.Books;

public class AccessBook {
    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();

        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }

        //create book
        Books book =new Books(4,"Algorithms2");
        //book.setBookName("Algorithms2");
        bookDao.saveBook(book);

        for (Books book2 : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book2.getIsbn()+"->" +
                    "name: "+book2.getBookName());
        }
    }

}
