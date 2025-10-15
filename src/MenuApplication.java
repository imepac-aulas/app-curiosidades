public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        mostrarSamelaProfissional();
        System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }

    public static void mostrarSamelaProfissional() {
        SmsfProfissional smsfProfissional = new SmsfProfissional();
        System.out.println(smsfProfissional.seuNome());
        System.out.println(smsfProfissional.suaAreaAtuacao());
        System.out.println("Samela alterei seu arquivo");
    }
}