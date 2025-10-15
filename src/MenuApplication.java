public class MenuApplication {


    public static void main(String[] args) {

        System.out.println("Menu de profissões --------------");
        mostrarEhfProfissional();
        System.out.println("--------------");
    }

    public static void mostrarEhfProfissional() {
        EhfProfissional ehfProfissional = new EhfProfissional();
        System.out.println(ehfProfissional.seuNome());
        System.out.println(ehfProfissional.suaAreaAtuacao());
    }

    public static void mostrarnpw() {
        EhfProfissional NpwfProfissional = new EhfProfissional();
        System.out.println(NpwfProfissional.seuNome());
        System.out.println(NpwfProfissional.suaAreaAtuacao());

    }
}
