/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srp;

/**
 *
 * @author carloshumbertomenesesmurillo
 */
public class Book {
    private int numpaginas;
    private String authorname;
    private String bookname;
    private int precio;
    public Book(int numpaginas, String authorname, String bookname,int precio) {
        this.numpaginas = numpaginas;
        this.authorname = authorname;
        this.bookname = bookname;
        this.precio=precio;
    }
    
}
