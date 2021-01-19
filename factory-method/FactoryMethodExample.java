public class FactoryMethodExample {

  private static Dialog dialog;

  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }

  private static void configure() {
    if ("Linux".equals(System.getProperty("os.name"))) {
      dialog = new LinuxDialog();
    } else {
      dialog = new HtmlDialog();
    }
  }

  private static void runBusinessLogic() {
    dialog.renderWindow();
  }

}
