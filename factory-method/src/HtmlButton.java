public class HtmlButton implements Button {

  @Override
  public void render() {
    System.out.println("<button>Hello</button>");
    onClick();
  }

  @Override
  public void onClick() {
    System.out.println("Click! Button says: Hello world!");
  }

}
