package Task12_15;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj){
        if (!super.equals(obj))
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        return language.equals(programmerBook.language)
                && level == programmerBook.level;
    }

    @Override
    public int hashCode(){
        int result = super.hashCode();
        result += language.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return super.toString() + "Language: " + language + "\nLevel: " + level + "\n";
    }
}
