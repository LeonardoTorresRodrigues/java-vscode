import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        var artigo = new Artigo("Vs Code com Java", Autor.Leonardo, LocalDate.of(2023, 03, 25), Categoria.BACKEND);
        System.out.println(artigo);
    }
}
