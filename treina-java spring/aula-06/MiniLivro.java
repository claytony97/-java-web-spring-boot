public class MiniLivro extends Livro {

  @Override
  public String gerarCodigoBarras() {
    return this.getBookName() + " " + this.getBookPrice() + "MINILIVRO";
  }

}
