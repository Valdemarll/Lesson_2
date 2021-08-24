package L1_hw;

public class Main {
    public static void main(String[] args){
        // class Human
        Human human1 = new Human();
        Human human2 = new Human("Дмитрий", "Орлов", "Алексеевич");

        human1.setFirst_name("Олег");
        human1.setMiddle_name("Кириллович");
        human2.setLast_name("Романов");

        System.out.println(human1);
        System.out.println(human2);


        // class Calculator
        Calculator calc = new Calculator();

        System.out.println(calc.add(7, 4));
        System.out.println(calc.sub(13, 2));
        System.out.println(calc.multiply(5, 7));
        System.out.println(calc.div(32, 8));


        // class Matrix
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        System.out.println("\nЗаполнить элементами matrix1");
        matrix1.setElements();
        System.out.println("\nЗаполнить элементами matrix2");
        matrix2.setElements();
        System.out.println("Matrix1:" + matrix1);
        System.out.println("Matrix2:" + matrix2);

        System.out.println("Сложение Matrix1 и Matrix2:\n" + matrix1.add(matrix2));
        System.out.println("Произведение Matrix1 и Matrix2:\n" + matrix1.multiply(matrix2));


        // class Book
        Book book = new Book("Мастер и Маргарита", 480, 1966, "Булгаков");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYearRelease());
        System.out.println(book.getPageCount());

        book.setTitle("Гарри Поттер и Философский камень");
        book.setAuthor("Джоан Роулинг");
        book.setYearRelease(1997);
        book.setPageCount(432);

        System.out.println(book.toString());


        // class Movie
        Movie movie = new Movie("Free Guy", 267, "Зак Пенн");
        System.out.println(movie.getTitle());
        System.out.println(movie.getDirector());
        System.out.println(movie.getPageCount());

        movie.setTitle("Groundhog Day");
        movie.setDirector("Харольд Ремис");
        movie.setPageCount(361);

        System.out.println(movie.toString());

    }

}

