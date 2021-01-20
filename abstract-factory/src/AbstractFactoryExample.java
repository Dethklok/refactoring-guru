public class AbstractFactoryExample {

  static GUIFactory guiFactory;

  static void configure() {
    String osName = System.getProperty("os.name");

    if (osName.equals("Linux")) {
      guiFactory = new LinuxGUIFactory();
    } else {
      guiFactory = new WindowsGUIFactory();
    }
  }

  static void render() {
    guiFactory.createButton().render();
    guiFactory.createCheckbox().render();
  }

  public static void main(String[] args) {
    configure();
    render();
  }

}
