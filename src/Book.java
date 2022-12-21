public class Book {
    private String name;
    private Author author;
    private int year;


    public Book(String name, Author author,int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "Название: "+this.name+" Автор: "+this.author+" Год издания: "+this.year;
    }

    public boolean equals(Object book) {
        boolean isEqual = false;
        Book equalBook = (Book) book;
        if((this.name.equals(equalBook.getName())) && (this.author.equals(equalBook.getAuthor())) && (this.year== equalBook.getYear()))
            isEqual = true;

        return isEqual;
    }

    @Override
    public int hashCode() {
        int result = this.name == null ? 0 : name.hashCode();
        result = 31*result+this.year;
        return result;
    }

}
