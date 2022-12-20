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

    public boolean equals(Author author) {
        boolean isEqual = false;
        if((this.name.equals(author.getName())) && (this.surname.equals(author.getSurname())))
            isEqual = true;

        return isEqual;
    }

    @Override
    public int hashCode() {
        int result = this.name == null ? 0 : name.hashCode();
        result = 31*result;
        return result;
    }
}