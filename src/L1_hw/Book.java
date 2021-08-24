package L1_hw;

public class Book {
    String title;
    int pageCount;
    int yearRelease;
    String author;

    Book(String title, int pageCount, int yearRelease, String author){
        this.title = title;
        this.pageCount = pageCount;
        this.yearRelease = yearRelease;
        this.author = author;
    }
    void setTitle(String title){
        this.title = title;
    }
    void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
    void setYearRelease(int yearRelease){
        this.yearRelease = yearRelease;
    }
    void setAuthor(String author){
        this.author = author;
    }

    String getTitle(){
        return title;
    }
    int getPageCount(){
        return pageCount;
    }
    int getYearRelease(){
        return yearRelease;
    }
    String getAuthor(){
        return author;
    }

    @Override
    public String toString(){
        return "Книга '" + title + "' содержит в себе " + pageCount + " страниц(ы/у). " +
                author + " выпустил(а) ее в " + yearRelease + " году.";
    }
}
