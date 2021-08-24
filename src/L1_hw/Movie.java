package L1_hw;

public class Movie {
    String title;
    int pageCount;
    String director;

    Movie(String title, int pageCount, String director){
        this.title = title;
        this.pageCount = pageCount;
        this.director = director;
    }
    void setTitle(String title){
        this.title = title;
    }
    void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
    void setDirector(String director){
        this.director = director;
    }

    String getTitle(){
        return title;
    }
    int getPageCount(){
        return pageCount;
    }
    String getDirector(){
        return director;
    }

    @Override
    public String toString(){
        return "Сценарий '" + title + "' содержит в себе " + pageCount + " страниц(ы/у). Режиссер сценария: " + director;
    }
}
