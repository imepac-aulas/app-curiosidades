public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        System.out.println();
        mostrarTraProfissional();
        System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }
    public static void mostrarTraProfissional() {
        TraProfissional traProfissional = new TraProfissional();
        System.out.println(traProfissional.seuNome());
        System.out.println(traProfissional.suaAreaAtuacao());
        System.out.println("Att do codigo");
    }
}