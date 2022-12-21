import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    public String toString(){
        return "Имя: "+this.name+" Фамилия: "+this.surname;
    }

    public boolean equals(Object author) {
        boolean isEqual = false;
        Author equalAuthor = (Author) author;
        if((this.name.equals(equalAuthor.getName())) && (this.surname.equals(equalAuthor.getSurname())))
            isEqual = true;

        return isEqual;
    }

    @Override
    public int hashCode() {
        int result;
        int hashName = this.name == null ? 0 : name.hashCode();
        int hashSurname = this.surname == null ? 0 : surname.hashCode();
        result = 31*hashName*hashSurname;
        return result;
    }
}